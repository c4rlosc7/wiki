package com.carlos.app.caesar.domain.caesar;

import com.carlos.app.caesar.domain.model.CaesarCipher;
import com.carlos.app.caesar.domain.util.Constant;

import static com.carlos.app.caesar.domain.util.Constant.PLAIN_ALPHABET;

public class CipherCaesarImpl implements ICaesar {
    @Override
    public void cipher(CaesarCipher caesarCipher) {
        Constant.generateCipherAlphabet(caesarCipher);
        char[] cipherText = new char[caesarCipher.getPlainText().length()];
        for (int index = 0; index < cipherText.length; index++) {
            int indexLetterCipher = PLAIN_ALPHABET.indexOf(caesarCipher.getPlainText().toLowerCase().charAt(index));
            if (indexLetterCipher == -1) {
                cipherText[index] += ' ';
                continue;
            }
            cipherText[index] = Constant.CIPHER_ALPHABET[indexLetterCipher];
        }
        caesarCipher.setCipherText(new String(cipherText));
    }

    @Override
    public void decipher(CaesarCipher caesarCipher) {
    }
}
