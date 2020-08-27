package com.corejava.crytpography;

import com.corejava.util.MyLogger;

import java.security.*;

//Program to generate public and private keys

public class KeyPairGeneratorDemo {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        //creating the instance of KeyPairGenerator and passing the algorithm as an argument
        final KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(2048); //setting up the key size
        KeyPair kp = kpg.generateKeyPair();
        //creating the public key using PublicKey class
        final PublicKey publicKey = kp.getPublic();
        //creating the private key using PrivateKey class
        final PrivateKey privateKey = kp.getPrivate();

        MyLogger.consoleLogger.info("Public key: "+publicKey);
        MyLogger.consoleLogger.info("Private key: "+privateKey);
    }
}

