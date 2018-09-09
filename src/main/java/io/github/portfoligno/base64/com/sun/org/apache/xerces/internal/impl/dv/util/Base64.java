package io.github.portfoligno.base64.com.sun.org.apache.xerces.internal.impl.dv.util;

import org.jetbrains.annotations.Nullable;

public class Base64 {
  public static @Nullable String encode(@Nullable byte[] binaryData) {
    return binaryData == null ? null : java.util.Base64.getEncoder().encodeToString(binaryData);
  }

  public static @Nullable byte[] decode(@Nullable String encoded) {
    return encoded == null ? null : java.util.Base64.getDecoder().decode(encoded);
  }
}
