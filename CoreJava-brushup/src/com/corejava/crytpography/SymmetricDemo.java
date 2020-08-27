package com.corejava.crytpography;

import com.corejava.util.MyLogger;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.util.Base64;

//Program to create the Symmetric keys

public class SymmetricDemo {

    public static String encrypt(byte[] key, byte[] initVector, String value) throws Exception {
        IvParameterSpec iv = new IvParameterSpec(initVector);
        SecretKeySpec skeySpec = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
        byte[] encrypted = cipher.doFinal(value.getBytes("UTF-8"));
        String encoded = Base64.getEncoder().encodeToString(encrypted);
        return encoded;
    }

    public static String decrypt(byte[] key, byte[] initVector, String encrypted) throws Exception {
        IvParameterSpec iv = new IvParameterSpec(initVector);
        SecretKeySpec skeySpec = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
        cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
        byte[] original = cipher.doFinal(Base64.getDecoder().decode(encrypted));
        return new String(original);
    }

    public static void main(String[] args) {

        try {

            SecureRandom sr = new SecureRandom();
            byte[] key = new byte[16];
            sr.nextBytes(key);
            byte[] initVector = new byte[16];
            sr.nextBytes(initVector);

            String payload = "My name is James Bond";
            MyLogger.consoleLogger.info("Original text=" + payload);
            String encrypted = encrypt(key, initVector, payload);
            MyLogger.consoleLogger.info("Encrypted test=" + encrypted);
            String decrypted = decrypt(key, initVector, encrypted);
            MyLogger.consoleLogger.info("Decrypted text=" + decrypted);
            String result = decrypted.equals(payload) ? "It works!" : "Somethings not right";
            MyLogger.consoleLogger.info(result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }

}
