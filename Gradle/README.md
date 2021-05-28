<img src="https://my-bucket-image2.s3.amazonaws.com/ImageGitHub/gradle-logo.png" alt="drawing" width="200"/>

___

Gradle is an `open-source` build automation tool that is designed to be flexible enough to build almost any type of software.

Gradle runs on the JVM and you must have a Java Development Kit (JDK) installed to use it. This is a bonus for users familiar with the Java platform as you can use the standard Java APIs in your build logic, such as custom task types and plugins.


# [Getting Started](https://github.com/markdown-it/markdown-it-emoji)

## [Prerequisites](https://github.com/markdown-it/markdown-it-emoji)

-  JDK Java 1.8 or higher

```console
❯ java -version
java version "1.8.0_151"
Java(TM) SE Runtime Environment (build 1.8.0_151-b12)
Java HotSpot(TM) 64-Bit Server VM (build 25.151-b12, mixed mode)
```

Gradle ships with its own Groovy library, therefore Groovy does not need to be installed

## [Install](https://github.com/markdown-it/markdown-it-emoji)

### [Microsoft Windows users](https://github.com/markdown-it/markdown-it-emoji)

- [download gradle releases](https://gradle.org/releases/)
- Environmental Variables 
    - GRADLE_HOME 
        - %GRADLE_HOME%/bin to your Path

```console
------------------------------------------------------------
Gradle 6.4.1
------------------------------------------------------------

Build time:   2020-05-15 19:43:40 UTC
Revision:     1a04183c502614b5c80e33d603074e0b4a2777c5

Kotlin:       1.3.71
Groovy:       2.5.10
Ant:          Apache Ant(TM) version 1.10.7 compiled on September 1 2019
JVM:          11 (Oracle Corporation 11+28)
OS:           Windows 10 10.0 amd64
```

## [Hello World with Gradle](https://github.com/markdown-it/markdown-it-emoji)

Created to projecto java with the next packages src/main/java/hw/Main.java

```java
package hw;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world with Gradle");
    }
}
```

## [Build gradle](https://github.com/markdown-it/markdown-it-emoji)

```console
gradle build

BUILD SUCCESSFUL in 2s
2 actionable tasks: 2 executed
```

## [Gradle commans](https://github.com/markdown-it/markdown-it-emoji)

> gradle build

> gradle tasks

> gradle -d <tasks> // debug

> gradle -i <tasks> // info

> gradle -w <tasks> // warning

> gradle -q <tasks> // quiet

> thank you for reading