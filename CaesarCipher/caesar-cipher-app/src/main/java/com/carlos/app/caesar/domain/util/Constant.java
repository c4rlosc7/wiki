package com.carlos.app.caesar.domain.util;

import com.carlos.app.caesar.domain.model.CaesarCipher;

public class Constant {
    public final static String PLAIN_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static char[] CIPHER_ALPHABET = new char[PLAIN_ALPHABET.length()];

    public static void generateCipherAlphabet(CaesarCipher caesarCipher) {
        int key = caesarCipher.getKey();

        for(int count = 0; count < CIPHER_ALPHABET.length; count++){
            if (key > 25) key = 0;
            CIPHER_ALPHABET[key] = PLAIN_ALPHABET.charAt(count);
            key++;
        }
    }
}
