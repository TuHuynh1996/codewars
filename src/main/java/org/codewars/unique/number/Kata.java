package org.codewars.unique.number;

import java.util.HashSet;
import java.util.Set;

public class Kata {

    /**
     * There is an array with some numbers. All numbers are equal except for one. Try to find it!
     * <p>
     * Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
     * Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
     * <p>
     * It’s guaranteed that array contains at least 3 numbers.
     * <p>
     * The tests contain some very huge arrays, so think about performance.
     * <p>
     * This is the first kata in series:
     * 1. Find the unique number (this kata)
     * 2. Find the unique string
     * 3. Find The Unique
     */
    public static double findUniq(double arr[]) {
        Set<Double> doubleSet = new HashSet<>();
        Set<Double> arrSet = new HashSet<>();
        for (double d : arr) {
            if (!doubleSet.add(d)) {
                arrSet.remove(d);
            } else {
                arrSet.add(d);
            }
        }
        return (double) arrSet.toArray()[0];
    }
}
