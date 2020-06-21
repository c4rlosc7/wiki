package com.carlos.app.caesar;

public class util {
    public static char[] generateCipherAlphabet(String plain, int key) {
        char[] arrayCharsCipher = new char[plain.length()];

        for(int count = 0; count < arrayCharsCipher.length; count++){
            if (key > 25) key = 0;
            arrayCharsCipher[key] = plain.charAt(count);
            key++;
        }
        return arrayCharsCipher;
    }
}
