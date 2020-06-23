package com.carlos.app.caesar.domain.util;

import com.carlos.app.caesar.domain.model.CaesarCipher;

public class Constant {
    public final static String PLAIN = "abcdefghijklmnopqrstuvwxyz";
    public static char[] CIPHER = new char[PLAIN.length()];

    public static void generateCipherAlphabet(CaesarCipher caesarCipher) {
        int key = caesarCipher.getKey();

        for(int count = 0; count < CIPHER.length; count++){
            if (key > 25) key = 0;
            CIPHER[key] = PLAIN.charAt(count);
            key++;
        }
    }
}
