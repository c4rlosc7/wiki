package com.carlos.app.caesar.domain;

import com.carlos.app.caesar.domain.model.CaesarCipher;

public class Solution {
    public static void main(String[] args) {
        CaesarCipher caesar = new CaesarCipher("Hello", 3);
        caesar.cipher(caesar);
        System.out.println("PlanText: " + caesar.getPlainText());
        System.out.println("CipherText: " + new String(caesar.getCipherText()));
        System.out.println("Key: " +caesar.getKey());
    }
}
