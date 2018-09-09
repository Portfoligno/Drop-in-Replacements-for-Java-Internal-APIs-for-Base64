package io.github.portfoligno.base64.sun.misc;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public abstract class CharacterDecoder {
  public abstract @NotNull byte[] decodeBuffer(@NotNull String inputString) throws IOException;
}
