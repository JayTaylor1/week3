package unaryPredicate;

/**
 * An example of a unary predicate.
 *
 * IsEven implements a unary predicate over Integers.
 *
 * The test method therefore takes an Integer as its parameter, and returns true
 * iff the parameter is an even number.
 *
 * @author Hugh Osborne
 * @version October 2019
 */

public class IsPrime implements UnaryPredicate<Integer> {

    /**
     * Test whether a number is even.
     *
     * @param n the number t be tested
     * @return true iff n is even
     */
    @Override
    public boolean test(Integer n) {
        for (int i = 2 ; i <= n/2; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
