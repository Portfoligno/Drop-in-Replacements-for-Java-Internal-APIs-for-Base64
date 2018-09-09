package io.github.portfoligno.base64.sun.misc;

import org.jetbrains.annotations.NotNull;

import java.util.Base64;

public class BASE64Encoder extends CharacterEncoder {
  private final @NotNull Base64.Encoder delegate = Base64.getMimeEncoder();

  @Override
  public @NotNull String encode(@NotNull byte[] aBuffer) {
    return delegate.encodeToString(aBuffer);
  }
}
