package com.carlos.app.caesar.domain.caesar;

import static org.junit.jupiter.api.Assertions.*;

import com.carlos.app.caesar.domain.model.CaesarCipher;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("CipherCaesar implementation Test Class")
class CipherCaesarImplTest {

    private final CaesarCipher caesar = new CaesarCipher();

    @Test
    @DisplayName("Testing Cipher Caesar: A")
    public void cipherCaseA() {
        // plainText: Hello, cipherText: ebiil, key: 3
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
    @DisplayName("Testing Cipher Caesar: B")
    public void cipherCaseB() {
        // plainText: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"
        // cipherText: qeb nrfzh yoltk clu grjmp lsbo qeb ixwv ald, key: 3"
        // Arrange
        caesar.setPlainText("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
        caesar.setKey(3);
        String expectedValue = "qeb nrfzh yoltk clu grjmp lsbo qeb ixwv ald";

        // Act
        caesar.cipher(caesar);
        String result = new String(caesar.getCipherText());

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing DeCipherCaesar: A")
    public void decipher() {
        // Arrange
        // Act
        // Assert
    }

}