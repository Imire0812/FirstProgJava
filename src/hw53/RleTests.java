package hw53;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class RleTests {
    @Test
    public void testCommonLine() {
        // arrange
        String line = "aaabbcddddaaaaa";

        // act
        String result = Rle.rle(line);

        // assert
        assertEquals("a3b2cd4a5", result);
    }

    @Test
    public void testSameChars() {
        // arrange
        String line = "aaaaaaaaaaaaa";

        // act
        String result = Rle.rle(line);

        // assert
        assertEquals("a13", result);
    }

    @Test
    public void testDiffChars() {
        // arrange
        String line = "abcdefgh";

        // act
        String result = Rle.rle(line);

        // assert
        assertEquals("abcdefgh", result);
    }

    // ""
    @Test
    public void testEmptyString() {
        // arrange
        String line = "";

        // act
        String result = Rle.rle(line);

        // assert
        assertEquals("", result);
    }

    @Test
    public void testNull() {
        // arrange
        String line = null;

        // act & assert
        assertThrowsExactly(NullPointerException.class, () -> Rle.rle(line));
    }
}