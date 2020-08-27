package com.corejava.crytpography;

import com.corejava.util.MyLogger;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public class KeyStoreDemo {

    public static void main(String[] args) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException {

        //Creating the KeyStore object
        KeyStore keyStore = KeyStore.getInstance("JCEKS");

        //Loading the KeyStore object
        char[] password  = "changeit".toCharArray();
        String path = "C:/Program Files/Java/jre1.8.0_251/lib/security/cacerts";
        FileInputStream fis = new FileInputStream(path);
        keyStore.load(fis,password);

        //Creating the KeyStore.ProtectionParameter object
        KeyStore.ProtectionParameter protectionParameter = new KeyStore.PasswordProtection(password);

        //Creating  SecretKey object
        SecretKey mySecretKey = new SecretKeySpec("myPassword".getBytes(),"DSA");

        //Creating SecretKeyEntry object
        KeyStore.SecretKeyEntry secretKeyEntry = new KeyStore.SecretKeyEntry(mySecretKey);
        keyStore.setEntry("secretKeyAlias",secretKeyEntry,protectionParameter);

        //Storing the KeyStore object
        FileOutputStream fos = null;
        fos = new FileOutputStream("newKeyStoreName");
        keyStore.store(fos,password);
        MyLogger.consoleLogger.info("Data stored successfully");

    }
}
