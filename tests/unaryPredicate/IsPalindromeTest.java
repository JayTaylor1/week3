package unaryPredicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsPalindromeTest {

    private IsPalindrome predicate = new IsPalindrome();

    @Test
    void testOne() {
        assertTrue(predicate.test("racecar"));
    }

    @Test
    void testTwo() {
        assertTrue(predicate.test("hannah"));
    }

    @Test
    void testThree() {
        assertTrue(predicate.test("tattarrattat"));
    }

    @Test
    void testPrime() {
        assertFalse(predicate.test("Not One"));
    }

    @Test
    void testNegativePrime() {
        assertTrue(predicate.test("12321"));
    }

}