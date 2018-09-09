package io.github.portfoligno.base64.sun.misc;

import org.jetbrains.annotations.NotNull;

public abstract class CharacterEncoder {
  public abstract @NotNull String encode(@NotNull byte[] aBuffer);
}
