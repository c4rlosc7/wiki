package com.carlos.app.caesar;

public class Solution {
    public static void main(String[] args) {
        CaesarCipher caesar = new CaesarCipher("Hello", 3);
        System.out.println("= = = = = = = = DECIPHER = = = = = = = =");
        System.out.println("PlanText: " + caesar.getPlainText());
        System.out.println("CipherText: " + caesar.getCipherText());
        System.out.println("Key: " +caesar.getKey());
        caesar.cipher(caesar);
        System.out.println("= = = = = = = = CIPHER = = = = = = = =");
        System.out.println("PlanText: " + caesar.getPlainText());
        System.out.println("CipherText: " + new String(caesar.getCipherText()));
        System.out.println("Key: " +caesar.getKey());
    }
}
