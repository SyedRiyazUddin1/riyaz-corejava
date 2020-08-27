package com.corejava.crytpography;

import com.corejava.util.MyLogger;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//Prograam to create a MessageDigest

public class MessageDigestDemo {

    public static void main(String[] args) {

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        String message = "MessageDigest";
        md.update(message.getBytes());
        byte[] digest = md.digest();

        MyLogger.consoleLogger.info(digest);

        //converting the MessageDigest to hex format
        StringBuffer hexString  = new StringBuffer();
        for(int loop=0;loop<digest.length;loop++){
            hexString.append(Integer.toHexString(0xFF & digest[loop]));
        }
        MyLogger.consoleLogger.info("Hex format : "+hexString.toString());
    }
}
