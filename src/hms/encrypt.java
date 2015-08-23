/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samitha
 */
public class encrypt {

    public static String MD5(String str) {
        try {

            //method1
//            MessageDigest md= MessageDigest.getInstance("MD5");
//            md.update(str.getBytes());
//            String encrypt1= new String(md.digest());
//            System.out.println(encrypt1);
            
            // method2
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messagedigest = md.digest(str.getBytes());
            BigInteger num = new BigInteger(1, messagedigest);
            String hashtext = num.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException ex) {
            // Logger.getLogger(encrypt.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }

      //  return "";
    }

    public static void main(String[] args) {

//        String sa = "123456";
//        System.out.println("MD5:" + encrypt.MD5(sa));
    }

}
