package com.carlos.lombok;

import com.carlos.lombok.app.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("User Test Class")
class UserTests {

	private final User user = new User();

	@Test
	@DisplayName("Testing getId id = 1L")
	public void getIdTest() {
		// Arrange
		user.setId(1L);
		Long expectedValue = 1L;

		// Act
		Long result = user.getId();

		// Assert
		assertEquals(expectedValue, result);
	}

	@Test
	@DisplayName("Testing getName name = Carlos Martinez")
	public void getNameTest() {
		// Arrange
		user.setName("Carlos Martinez");
		String expectedValue = "Carlos Martinez";

		// Act
		String result = user.getName();

		// Assert
		assertEquals(expectedValue, result);
	}

}
