package org.rj.util;

import java.util.Base64;

public class EncodeDecodeUtil {

  public static String decodePassword(String password) {
    byte[] encbytes = password.getBytes();
    Base64.Decoder dec = Base64.getDecoder();
    byte[] decbytes = dec.decode(encbytes);
    return new String(decbytes);
  }

  public static String encodePassword(String pass) {
    Base64.Encoder enc = Base64.getEncoder();
    byte[] encbytes = enc.encode(pass.getBytes());
    return new String(encbytes);
  }
}
