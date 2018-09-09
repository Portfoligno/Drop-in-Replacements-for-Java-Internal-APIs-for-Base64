package io.github.portfoligno.base64.test

import io.github.portfoligno.base64.com.sun.org.apache.xerces.internal.impl.dv.util.Base64
import io.github.portfoligno.base64.sun.misc.BASE64Decoder
import io.github.portfoligno.base64.sun.misc.BASE64Encoder
import io.github.portfoligno.base64.test.gen.ByteArrayGen
import io.kotlintest.properties.assertAll
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

typealias OriginalBase64 = com.sun.org.apache.xerces.internal.impl.dv.util.Base64
typealias OriginalBASE64Encoder = sun.misc.BASE64Encoder
typealias OriginalBASE64Decoder = sun.misc.BASE64Decoder

class ReplacementSpec : StringSpec({
  val gen = ByteArrayGen(4096)

  "Base64#encode should be compatible" {
    assertAll(gen.orNull()) {
      Base64.encode(it) shouldBe OriginalBase64.encode(it)
    }
  }
  "Base64#decode should be compatible" {
    assertAll(gen.orNull()) {
      val s = OriginalBase64.encode(it)

      Base64.decode(s) shouldBe OriginalBase64.decode(s)
    }
  }

  "BASE64Encoder#encode should be compatible" {
    val encoder = BASE64Encoder()
    val originalEncoder = OriginalBASE64Encoder()

    assertAll(gen) {
      encoder.encode(it) shouldBe originalEncoder.encode(it)
    }
  }
  "BASE64Decoder#decodeBuffer should be compatible" {
    val originalEncoder = OriginalBASE64Encoder()
    val decoder = BASE64Decoder()
    val originalDecoder = OriginalBASE64Decoder()

    assertAll(gen) {
      val s = originalEncoder.encode(it)

      decoder.decodeBuffer(s) shouldBe originalDecoder.decodeBuffer(s)
    }
  }
})
