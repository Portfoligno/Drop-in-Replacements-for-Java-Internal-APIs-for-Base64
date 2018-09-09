package io.github.portfoligno.base64.sun.misc;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Base64;

public class BASE64Decoder extends CharacterDecoder {
  private final @NotNull Base64.Decoder delegate = Base64.getDecoder();

  @Override
  public @NotNull byte[] decodeBuffer(@NotNull String inputString) throws IOException {
    return delegate.decode(inputString);
  }
}
