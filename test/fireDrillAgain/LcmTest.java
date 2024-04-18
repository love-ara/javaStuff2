package fireDrillAgain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class LcmTest {
    @Test
    public void getHCFTest(){
        int[] arr = {2, 6, 8};
        int[] expected = {2};

        assertArrayEquals(expected, Lcm.hcf(arr));
    }

    @Test
    public void getHCFTest2(){
        int[] arr = {3, 6, 18};
        int[] expected = {3};

        assertArrayEquals(expected, Lcm.hcf(arr));

    }
    @Test
    public void getLCMTest2(){
        int[] arr = {3, 6, 18};
        int[] expected = {18};

        assertArrayEquals(expected, Lcm.lcm(arr));

    }
    @Test
    public void getLCMTest(){
        int[] arr = {2, 6, 8};
        int[] expected = {24};

        assertArrayEquals(expected, Lcm.lcm(arr));

    }
}
