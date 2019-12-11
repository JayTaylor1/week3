package unaryPredicate;

/**
 * An example of a unary predicate.
 *
 * IsOdd implements a unary predicate over Integers.
 *
 * The test method therefore takes an Integer as its parameter, and returns true
 * iff the parameter is an odd number.
 *
 */

public class IsOdd implements UnaryPredicate<Integer> {

    /**
     * Test whether a number is odd.
     *
     * @param n the number t be tested
     * @return true if n is odd
     */
    @Override
    public boolean test(Integer n) {

        return n % 2 != 0;
    }
}
