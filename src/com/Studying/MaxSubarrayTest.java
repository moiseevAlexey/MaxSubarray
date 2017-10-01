package com.Studying;

import org.junit.Test;

import static com.Studying.MaxSubarray.maxSubarray;
import static org.junit.Assert.*;

public class MaxSubarrayTest {
    @Test
    public void maxSubarrayTest() {
        double[] testArray1 = {100, 113, 110, 85, 105, 102, 86, 63, 81, 101, 94, 106, 101, 79, 94};
        assertEquals(new Triple(7, 11, 43.0), maxSubarray(testArray1));

        double[] testArray2 = {10 ,11, 7, 10, 6};
        assertEquals(new Triple(2, 3, 3.0), maxSubarray(testArray2));

        double[] testArray3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(new Triple(0, 9, 9.0), maxSubarray(testArray3));

        double[] testArray4 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertEquals(new Triple(0, 1, -1.0), maxSubarray(testArray4));
    }

}