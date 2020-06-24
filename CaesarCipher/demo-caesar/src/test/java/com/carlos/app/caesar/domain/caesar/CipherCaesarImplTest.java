package com.carlos.app.caesar.domain.caesar;

import static org.junit.jupiter.api.Assertions.*;

import com.carlos.app.caesar.domain.model.CaesarCipher;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("CipherCaesar implementation Test Class")
class CipherCaesarImplTest {

    private final CaesarCipher caesar = new CaesarCipher();

    @Test
    @DisplayName("Testing CipherCaesar: plainText: Hello, cipherText: ebiil, key: 3")
    public void cipher() {
        // Arrange
        caesar.setPlainText("Hello");
        caesar.setKey(3);
        String expectedValue = "ebiil";

        // Act
        caesar.cipher(caesar);
        String result = new String(caesar.getCipherText());

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing DeCipherCaesar: plainText: ebiil, cipherText: hello, key: 3")
    public void decipher() {
        // Arrange
        // Act
        // Assert
    }

}