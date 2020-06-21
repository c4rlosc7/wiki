package com.carlos.app.caesar;

public class CaesarCipher {

    final static String PLAIN = "abcdefghijklmnopqrstuvwxyz";
    static char[] CIPHER = new char[PLAIN.length()];

    public static char[] caesarCipher(String plainText, int key) {
        CIPHER = util.generateCipherAlphabet(PLAIN, key);
        char[] cipherText = new char[plainText.length()];
        
        for (int index = 0; index < cipherText.length; index++) {
            int indexLetterCipher = PLAIN.indexOf(plainText.toLowerCase().charAt(index));
            if (indexLetterCipher == -1) {
                cipherText[index] += ' ';
                continue;
            }
            cipherText[index] = CIPHER[indexLetterCipher];
        }
        return cipherText;
    }

    public static void main(String[] args) {
        String plainText = "Hello";
        // String plainText = "this is a secret";
        char[] cipherText = new char[plainText.length()];
        cipherText = caesarCipher(plainText, 3);
        System.out.println(cipherText);
    }

}
