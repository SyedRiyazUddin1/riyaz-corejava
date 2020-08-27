package com.corejava.crytpography;

import com.corejava.util.MyLogger;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

//Program to generate a key using KeyGenerator

public class KeyGeneratorDemo {

    public static void main(String[] args) throws NoSuchAlgorithmException {
//creating the instance of KeyPairGenerator and passing the algorithm as an argument
        KeyGenerator kg = KeyGenerator.getInstance("AES");
        kg.init(256);  //setting up the keysize

        //generating the secret key
        SecretKey secret = kg.generateKey();
        MyLogger.consoleLogger.info(secret);

    }


}
