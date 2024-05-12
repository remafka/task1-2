import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MTestTest {

    @Test
    public void testMin() {
        long[] nums = {3, 7, 2, 9, 5};
        long expectedMin = 2;
        long actualMin = Main._min(nums);
        assertEquals(expectedMin, actualMin);
    }

    @Test
    public void testMax() {
        long[] nums = {3, 7, 2, 9, 5};
        long expectedMax = 9;
        long actualMax = Main._max(nums);
        assertEquals(expectedMax, actualMax);
    }

    @Test
    public void testSum() {
        long[] nums = {3, 7, 2, 9, 5};
        long expectedSum = 26;
        long actualSum = Main._sum(nums);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testMult() {
        long[] nums = {3, 7, 2, 9, 5};
        long expectedMult = 1890;
        long actualMult = Main._mult(nums);
        assertEquals(expectedMult, actualMult);
    }
    @Test
    public void testSumofMult(){
        long[] nums = {3, 7, 2, 9, 5};
        long expectedSumofMult = 1916;
        long actualSumofMult = Main._sum(nums) + Main._mult(nums);
        assertEquals(expectedSumofMult, actualSumofMult);

    }
}
