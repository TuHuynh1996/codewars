package org.codewars.four_squares;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class FourSquares {
    private static BigInteger four = BigInteger.valueOf(4);

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
        if (n.equals(BigInteger.ZERO)) {
            result[0] = BigInteger.ZERO;
            return result;
        }
        BigInteger result1 = findSqrt(n);
        while (true) {
            BigInteger num234Squares = n.subtract(result1.multiply(result1));
            System.out.println("result1: " + result1);
            BigInteger result2 = findSqrt(num234Squares);

            BigInteger num34Squares = num234Squares.subtract(result2.multiply(result2));
            int num = num34Squares.remainder(BigInteger.valueOf(4)).intValue();
            if (num != 3) {
                System.out.println("num34Squares: " + num34Squares);
                BigInteger result34 = findSqrt(num34Squares);
                for (BigInteger result3 = result34; result3.compareTo(result3.divide(BigInteger.TWO)) >= 0; result3 = result3.subtract(BigInteger.ONE)) {
                    BigInteger num4Squares = num34Squares.subtract(result3.multiply(result3));
                    BigInteger result4 = findSqrt(num4Squares);
                    if (result4.multiply(result4).equals(num4Squares)) {
                        result[0] = result1;
                        result[1] = result2;
                        result[2] = result3;
                        result[3] = result4;
                        System.out.println(result[0] + ", " + result[1] + ", " + result[2] + ", " + result[3]);
                        return result;
                    }
                }
                result1 = result1.subtract(BigInteger.ONE);
            } else {
                result1 = result1.subtract(BigInteger.ONE);
                continue;
            }
        }
    }

    private static BigInteger findSqrt(BigInteger n) {
        BigDecimal bigDecimal = new BigDecimal(n.sqrt());
        return bigDecimal.setScale(0, RoundingMode.FLOOR).toBigInteger();
    }

}
