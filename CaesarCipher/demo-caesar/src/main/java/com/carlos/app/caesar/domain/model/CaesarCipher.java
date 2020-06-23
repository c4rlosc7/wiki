package com.carlos.app.caesar.domain.model;

import com.carlos.app.caesar.domain.caesar.CipherCaesarImpl;

import java.util.Arrays;

public class CaesarCipher extends CipherCaesarImpl {
    public String plainText;
    public char[] cipherText;
    public int key;

    public CaesarCipher() {
    }

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
}
