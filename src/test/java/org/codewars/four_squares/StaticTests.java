package org.codewars.four_squares;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StaticTests {
    private static final BigInteger processResult(BigInteger[] result) {
        BigInteger n = new BigInteger("0");
        BigInteger c = new BigInteger("1");

        c = new BigInteger("1");
        c = c.multiply(result[0]).multiply(result[0]);
        n = n.add(c);

        c = new BigInteger("1");
        c = c.multiply(result[1]).multiply(result[1]);
        n = n.add(c);

        c = new BigInteger("1");
        c = c.multiply(result[2]).multiply(result[2]);
        n = n.add(c);

        c = new BigInteger("1");
        c = c.multiply(result[3]).multiply(result[3]);
        n = n.add(c);

        return n;
    }

    @Test
    public void Test1SmallInputs() {
        BigInteger[] result = new BigInteger[4];
        result = FourSquares.GetRepresentation(new BigInteger("215"));
        assertEquals(new BigInteger("215"), processResult(result));
        result = FourSquares.GetRepresentation(new BigInteger("8056870485"));
        assertEquals(new BigInteger("8056870485"), processResult(result));
        result = FourSquares.GetRepresentation(new BigInteger("805687048580568704858056870485"));
        assertEquals(new BigInteger("805687048580568704858056870485"), processResult(result));
    }
}
