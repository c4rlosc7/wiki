package com.carlos.app.caesar.domain.caesar;

import com.carlos.app.caesar.domain.model.CaesarCipher;
import com.carlos.app.caesar.domain.util.Constant;

import static com.carlos.app.caesar.domain.util.Constant.PLAIN;

public class CipherCaesarImpl implements ICaesar {
    @Override
    public void cipher(CaesarCipher caesarCipher) {
        Constant.generateCipherAlphabet(caesarCipher);
        caesarCipher.setCipherText(new char[caesarCipher.getPlainText().length()]);
        for (int index = 0; index < caesarCipher.getCipherText().length; index++) {
            int indexLetterCipher = PLAIN.indexOf(caesarCipher.getPlainText().toLowerCase().charAt(index));
            if (indexLetterCipher == -1) {
                caesarCipher.getCipherText()[index] += ' ';
                continue;
            }
            caesarCipher.getCipherText()[index] = Constant.CIPHER[indexLetterCipher];
        }
    }

    @Override
    public void decipher(CaesarCipher caesarCipher) {
    }
}
