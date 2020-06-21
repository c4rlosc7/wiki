package com.carlos.app.caesar;

public class CaesarCipher {

    public static char[] generatedCipher(String plain, int key) {
        char[] arrayCharsCipher = new char[plain.length()];

        for(int count = 0; count < arrayCharsCipher.length; count++){
            if (key > 25) key = 0;
            arrayCharsCipher[key] = plain.charAt(count);
            key++;
        }
        return arrayCharsCipher;
    }

    public static char[] caesarCipher(String text, int key) {
        text = text.toLowerCase();
        String plain   = "abcdefghijklmnopqrstuvwxyz";
        char[] cipher = new char[plain.length()];
        cipher = generatedCipher(plain, key);
        char[] textCipher = new char[text.length()];
        
        for (int index = 0; index < textCipher.length; index++) {
            if (plain.indexOf(text.charAt(index)) == -1) {
                textCipher[index] += ' ';
                continue;
            }
            textCipher[index] = cipher[plain.indexOf(text.charAt(index))];
        }
        return textCipher;
    }

    public static void main(String[] args) {
        // String plainText = "Hello";
        String plainText = "this is a secret";
        char[] cipherText = new char[plainText.length()];
        cipherText = caesarCipher(plainText, 3);
        System.out.println(cipherText);
    }

}
