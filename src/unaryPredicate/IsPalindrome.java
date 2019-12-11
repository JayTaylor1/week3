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

public class IsPalindrome implements UnaryPredicate<String> {


    public boolean test(String word) {

        int length = word.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = word.charAt(forward++);
            char backwardChar = word.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;

    }
}
