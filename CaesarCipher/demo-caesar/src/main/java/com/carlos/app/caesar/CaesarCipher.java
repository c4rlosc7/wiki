package com.carlos.app.caesar;

import java.util.Arrays;

import static com.carlos.app.caesar.Constant.PLAIN;

public class CaesarCipher implements ICaesar {
    public String plainText;
    public char[] cipherText;
    public int key;

    public CaesarCipher(String plainText, int key) {
        this.plainText = plainText;
        this.key = key;
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public char[] getCipherText() {
        return cipherText;
    }

    public void setCipherText(char[] cipherText) {
        this.cipherText = cipherText;
    }

    @Override
    public String toString() {
        return "CaesarCipher{" +
                "plainText='" + plainText + '\'' +
                ", cipherText=" + Arrays.toString(cipherText) +
                ", key=" + key +
                '}';
    }

    @Override
    public void cipher(CaesarCipher caesarCipher) {
        Constant.generateCipherAlphabet(caesarCipher);
        caesarCipher.setCipherText(new char[plainText.length()]);
        for (int index = 0; index < cipherText.length; index++) {
            int indexLetterCipher = PLAIN.indexOf(plainText.toLowerCase().charAt(index));
            if (indexLetterCipher == -1) {
                cipherText[index] += ' ';
                continue;
            }
            cipherText[index] = Constant.CIPHER[indexLetterCipher];
        }
    }

    @Override
    public char[] decipher(CaesarCipher caesarCipher) {
        return null;
    }
}
