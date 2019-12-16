package genericMethods;
import java.util.Arrays;
/**
 * A demonstration of a generic method.
 *
 * This class defines a static method that will swap two objects of the same type at the given indices.
 *
 * @author Jay Taylor
 * @version 2019
 */
public class Swap {
    /**
     * Swap two objects of the same type at the given indices
     * @param <T> the type of objects to be compared
     * @param index1 the first index to swap
     * @param index2 the index to swap with the first one
     * @param array the initial unswapped array
     * @return the updated array with the swapped indices
     * @throws IndexingError if one of the indices are out of bounds
     * <ul>
     *     <li> Set a temporary ocject equal to the first index</li>
     *     <li> Set the first index equal to the second index</li>
     *     <li> set the second index equal to the temp object</li>
     *     <li> Return the new array</li>
     * </ul>
     */
    public static <T> T[] swap(T[] array, int index1, int index2) throws IndexingError {
        //Check to see if the two indices are valid
        if (index1 < 0 || index1 > array.length || index2 < 0 || index2 > array.length) {
            throw new IndexingError();
        }
        //Set a temp object to hold the first index
        T temp = array[index1];
        //set the first index to be equal to the second index
        array[index1] = array[index2];
        //set the second index to be equal to the temp object
        array[index2] = temp;
        return array;   //Return the swapped array
    }
}