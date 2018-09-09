package io.github.portfoligno.base64.test.gen

import io.kotlintest.properties.Gen
import java.util.*

private val RANDOM = Random()

class ByteArrayGen(maxNumBits: Int) : Gen<ByteArray> {
  private val constants = listOf(byteArrayOf(), byteArrayOf(0), byteArrayOf(1))
  private val numBitsGen: Gen<Int> = Gen.choose(0, maxNumBits)

  override
  fun constants() = constants

  override
  fun random() = numBitsGen.random().map {
    val bytes = ByteArray(it)
    RANDOM.nextBytes(bytes)
    bytes
  }
}
