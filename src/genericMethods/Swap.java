package genericMethods;

import java.util.Arrays;

/**
 * A demonstration of a generic method.
 *
 * This class defines a (rather superfluous) static method that will test for
 * equality (according to the equals() method!) of two objects of the same type.
 *
 * @author Hugh Osborne
 * @version October 2019
 */
public class Swap {

    /**
     * Check if two objects are equal
     * @param <T> the type of objects to be compared
     * @param object1 the first object
     * @param object2 the second object
     * @return true if the objects are equal (according to the equals() method)
     */
    public static <T> T[] swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }
}
