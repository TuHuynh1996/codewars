package org.codewars.unique.number;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FindUniqTest {
    private double precision = 0.0000000000001;

    @Test
    public void sampleTestCases() {
        assertEquals(1.0, Kata.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(3.0, Kata.findUniq(new double[]{1, 1, 1, 2, 1, 1, 2, 2, 4, 3, 4, 4, 4, 5, 5, 5}), precision);
        assertEquals(2.0, Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }), precision);
        assertEquals(0.55, Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }), precision);
    }
}