package consultation28_03_2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxWithTestsTest {

    private MaxWithTests m = new MaxWithTests();
    @Test
    public void zero_elt_test(){
        int[] ints = {};
       m.max(ints);
       assertEquals(-1, m.max(ints));
    }
    @Test
    public void one_elt_test(){
        int[] ints = {2};
        m.max(ints);
        assertEquals(2, m.max(ints));
    }
    @Test
    public void two_elt_test(){
        int[] ints = {2,7};
        m.max(ints);
        assertEquals(7, m.max(ints));
    }
    @Test
    public void many_elt_test(){
        int[] ints = {2,9999999,7,5,99,3,-19999999};
        m.max(ints);
        assertEquals(9999999, m.max(ints));
    }
    @Test
    public void many_negativ_elt_test(){
        int[] ints = {-2,-9999999,-7,-5,-99,-3,-19999999};
        m.max(ints);
        assertEquals(-2, m.max(ints));
    }

}