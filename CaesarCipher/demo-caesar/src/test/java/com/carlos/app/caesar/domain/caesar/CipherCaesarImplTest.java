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
    public void sum() {
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

}