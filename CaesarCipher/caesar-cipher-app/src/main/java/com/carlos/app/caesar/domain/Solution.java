package com.carlos.app.caesar.domain;

import com.carlos.app.caesar.domain.model.CaesarCipher;

public class Solution {
    public static void main(String[] args) {
        // Plaintext:  THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
        // Ciphertext: QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD
        // Key : 3
        CaesarCipher caesar = new CaesarCipher("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 3);
        caesar.cipher(caesar);
        System.out.println("PlanText: " + caesar.getPlainText());
        System.out.println("CipherText: " + new String(caesar.getCipherText()));
        System.out.println("Key: " +caesar.getKey());
    }
}
