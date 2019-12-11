package unaryPredicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsPrimeTest {

    private IsPrime predicate = new IsPrime();

    @Test
    void testOne() {
        assertTrue(predicate.test(1));
    }

    @Test
    void testTwo() {
        assertTrue(predicate.test(2));
    }

    @Test
    void testThree() {
        assertFalse(predicate.test(9));
    }

    @Test
    void testPrime() {
        assertTrue(predicate.test(17));
    }

    @Test
    void testNegativePrime() {
        assertTrue(predicate.test(-17));
    }

}