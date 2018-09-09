package io.github.portfoligno.base64.sun.misc;

import org.jetbrains.annotations.NotNull;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class BASE64Encoder extends CharacterEncoder {
  private static final @NotNull String LINE_SEPARATOR = System.lineSeparator();

  private final @NotNull Base64.Encoder delegate = LINE_SEPARATOR.equals("\r\n") ?
      Base64.getMimeEncoder() :
      Base64.getMimeEncoder(76, LINE_SEPARATOR.getBytes(StandardCharsets.US_ASCII));

  @Override
  public @NotNull String encode(@NotNull byte[] aBuffer) {
    String s = delegate.encodeToString(aBuffer);
    int n = s.length();
    return n % (76 + LINE_SEPARATOR.length()) == 76 && s.charAt(n - 1) != '=' ? s + LINE_SEPARATOR : s;
  }
}
