package com.corejava.crytpography;

import com.corejava.util.MyLogger;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.*;

//Program to create the asymmetric keys

public class AsymmetricCipherDemo {

    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, SignatureException, UnsupportedEncodingException, BadPaddingException, IllegalBlockSizeException {

        String original  = "Asymmetric";
        //creating the instance of KeyPairGenerator and passing the algorithm as an argument
        final KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");

        kpg.initialize(1024); //setting up the keysize
        KeyPair kp = kpg.generateKeyPair();
        final String cipherName = "rsa/ecb/oaepwithsha-256andmgf1padding";
        Cipher cipher = Cipher.getInstance(cipherName);
        cipher.init(cipher.ENCRYPT_MODE,kp.getPublic());
        final byte[] originalBytes = original.getBytes("UTF-8");
        byte[] cipherTextBytes = cipher.doFinal(originalBytes);

        String encryptedString = new String (cipherTextBytes,"UTF-8");
        MyLogger.consoleLogger.info(encryptedString);

        //as we are using two keys, we also need to use Signature
        Signature sig = Signature.getInstance("SHA256WithRSA");
        sig.initSign(kp.getPrivate());
        sig.update(originalBytes);

        //descrypting the encrypted key
        cipher.init(cipher.DECRYPT_MODE,kp.getPrivate());
        byte[] decryptedBytes = cipher.doFinal(cipherTextBytes);
        String decryptedString = new String (decryptedBytes,"UTF-8");
        MyLogger.consoleLogger.info(decryptedString);

    }
}
