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

    public static char[] caesarCipher(String message, int key) {
        message = message.toLowerCase();
        String plain   = "abcdefghijklmnopqrstuvwxyz";
        char[] cipher = new char[plain.length()];
        cipher = generatedCipher(plain, key);
        char[] textCipher = new char[message.length()];
        
        for (int index = 0; index < textCipher.length; index++) {
            if (plain.indexOf(message.charAt(index)) == -1) {
                textCipher[index] += ' ';
                continue;
            }
            textCipher[index] = cipher[plain.indexOf(message.charAt(index))];
        }
        return textCipher;
    }

    public static void main(String[] args) {
        // String message = "Hello";
        String message = "this is a secret";
        char[] textCipher = new char[message.length()];
        textCipher = caesarCipher(message, 3);
        System.out.println(textCipher);
    }

}
