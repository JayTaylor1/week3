package genericMethods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.*;

class SwapTest {

    /**
     * A selection of tests for equals
     */
	 String[] array = {"Tony","Andrew","Hugh","Diane","Simon","Gary"};

    @Test
    void testSwapIntegers() {
        Integer[] array = {5,2,9,-7,3,2,12,0};
        Integer[] expected = {-7,2,9,5,3,2,12,0};
        assertArrayEquals(expected,Swap.swap(array,0, 3));
    }

    @Test
    void testSwapIntegers2() {
        Integer[] array = {5,2,9,-7,3,2,12,0};
        Integer[] expected = {0,2,9,-7,3,2,12,5};
        assertArrayEquals(expected,Swap.swap(array,0, 7));
    }
    @Test
    void testSwapStrings() {
        String[] array = {"Tony","Andrew","Hugh","Diane","Simon","Gary"};
        String[] expected = {"Tony","Simon","Hugh","Diane","Andrew","Gary"};
        assertArrayEquals(expected,Swap.swap(array,1, 4));
    }



}