package org.codewars.four_squares;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Set;

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
        if (n.equals(BigInteger.ONE)) {
            result[0] = BigInteger.ONE;
            return result;
        }
        BigInteger result1 = findSqrt(n);;
        BigInteger result234;
        while (true) {
            result234 = n.subtract(result1.multiply(result1));
            if(isThreeSquare(result234)) {
                break;
            }
            result1 = result1.subtract(BigInteger.ONE);
        }


        Set<Integer> set = new HashSet<>();
        int i = 0;
        for (long j = 0; result1.compareTo(BigInteger.valueOf(j)) >= 0; j++) {
            System.out.println("loop count " + ++i + "/" + result1);
            BigInteger num34Squares = n.subtract(result1.multiply(result1)).subtract(BigInteger.valueOf(j * j));
            int num = num34Squares.remainder(BigInteger.valueOf(4)).intValue();
            if (num == 1) {
                System.out.println("num ="+ i + "/ " + num34Squares);
                for (BigInteger result3 = BigInteger.ZERO; result3.compareTo(findSqrt(num34Squares)) <= 0; result3 = result3.add(BigInteger.ONE)) {
                    BigInteger result4 = findSqrt(num34Squares.subtract(result3.multiply(result3)));
//                    System.out.println("loop count " + ++i + "/");
                    if (result3.multiply(result3).add(result4.multiply(result4)).equals(num34Squares)) {
                        result[0] = result1;
                        result[1] = BigInteger.valueOf(j);
                        result[2] = result3;
                        result[3] = result4;
                        System.out.println(result[0] + ", " + result[1] + ", " + result[2] + ", " + result[3]);
                        return result;
                    }
                }
            } else if (!set.add(num)) {
                result1 = result1.subtract(BigInteger.ONE);
                set = new HashSet<>();
                j = -1;
            }
        }
        return result;
    }

    private static BigInteger findSqrt(BigInteger n) {
        BigDecimal bigDecimal = new BigDecimal(n.sqrt());
        return bigDecimal.setScale(0, RoundingMode.FLOOR).toBigInteger();
    }

    public static boolean isPrime(BigInteger n) {
        if (n.equals(BigInteger.ONE)) {
            return false;
        }
        for (BigInteger i = BigInteger.TWO; i.compareTo(n.sqrt()) <= 0; i = i.add(BigInteger.ONE)) {
            if (n.remainder(i).intValue() == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     *  n != 4^a(8b+7)
     * @param n
     * @return
     */
    public static boolean  isThreeSquare(BigInteger n){
        while (n.compareTo(BigInteger.ZERO)>=0 && n.remainder(BigInteger.valueOf(4)).intValue() != 0) {
            if(n.remainder(BigInteger.valueOf(8)).intValue() != 7) {
                return true;
            }
            n = new BigDecimal(n.divide(BigInteger.valueOf(4))).setScale(0, RoundingMode.FLOOR).toBigInteger() ;
        }
        return false;
    }
}
