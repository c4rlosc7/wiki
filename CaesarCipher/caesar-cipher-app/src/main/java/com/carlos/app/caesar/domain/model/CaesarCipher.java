package com.carlos.app.caesar.domain.model;

import com.carlos.app.caesar.domain.caesar.CipherCaesarImpl;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class CaesarCipher extends CipherCaesarImpl {
    public String plainText;
    public char[] cipherText;
    public int key;

    public CaesarCipher(String plainText, int key) {
        this.plainText = plainText;
        this.key = key;
    }
}
