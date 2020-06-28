 # ☕ [Lombok](https://github.com/markdown-it/markdown-it-emoji) 

![](https://my-bucket-image2.s3.amazonaws.com/ImageGitHub/annotation-processors.png)

![](https://my-bucket-image2.s3.amazonaws.com/ImageGitHub/plugin-lombok-install.png)

## class User

```java
package com.carlos.lombok.app;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private Long id;
    private String name;
}
```

## class Main

```java
package com.carlos.lombok.app;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1L);
        user.setName("Carlos Martinez");

        System.out.println("***LOMBOK***");
        System.out.println("ID: " + user.getId());
        System.out.println("NAME: " + user.getName());
    }
}
```

```java
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
```

> thank you for reading