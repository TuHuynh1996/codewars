package org.codewars.four_squares;

import java.math.BigInteger;

public class FourSquares {
    /**
     * Recently you had a quarrel with your math teacher. Not only that nerd demands knowledge of all the theorems,
     * but he turned to be an constructivist devotee! After you recited by heart Lagranges theorem(https://en.wikipedia.org/wiki/Lagrange%27s_four-square_theorem) of sum of four squares,
     * he now demands a computer program to obtain such a decomposition, so that to see that you really understand a topic.
     * What a downer!
     * <p>
     * You remember well the theorem. Any positive integer can be decomposed into a sum of four squares of integers.
     * Seems not too hard... But after a quarrel, your teacher wants blood. Apparently he will test your program on extremely
     * huge numbers... And your program better finished working before the break - you don't want to get F, do you?
     * <p>
     * Tip: random tests feature 20 numbers as high as 2^128 and 20 number as high as 2^1024.
     */

    public static BigInteger[] GetRepresentation(BigInteger n) {
        BigInteger[] result = new BigInteger[4];
        result[0] = BigInteger.ZERO;
        result[1] = BigInteger.ZERO;
        result[2] = BigInteger.ZERO;
        result[3] = BigInteger.ZERO;
        BigInteger result1 = findSqrt(n);
        long a = result1.longValue();
        for (long j = 0; j <= a; j++) {
            for (long k = j; k <= a; k++) {
                for (long l = k; l <= a; l++) {
                    if (a * a + j * j + k * k + l * l == n.longValue()) {
                        result[0] = result1;
                        result[1] = BigInteger.valueOf(j);
                        result[2] = BigInteger.valueOf(k);
                        result[3] = BigInteger.valueOf(l);
                        System.out.print(a + "," + j + "," + k + "," + l + "\r\n");
                        return result;
                    }
                }
            }
        }
        return result;
    }

    private static BigInteger findSqrt(BigInteger n) {
        return BigInteger.valueOf((int) Math.floor(Math.sqrt(n.doubleValue())));
    }

}
