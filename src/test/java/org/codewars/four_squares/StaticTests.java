package org.codewars.four_squares;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.math.BigInteger;

class StaticTests {
    @Test
    public void Test1SmallInputs() {
        BigInteger[] result = new BigInteger[4];

        result = FourSquares.GetRepresentation(new BigInteger("0"));
        assertEquals(new BigInteger("0"), processResult(result));

        result = FourSquares.GetRepresentation(new BigInteger("1234567890"));
        assertEquals(new BigInteger("1234567890"), processResult(result));

        result = FourSquares.GetRepresentation(new BigInteger("17"));
        assertEquals(new BigInteger("17"), processResult(result));

        result = FourSquares.GetRepresentation(new BigInteger("215"));
        assertEquals(new BigInteger("215"), processResult(result));

        result = FourSquares.GetRepresentation(new BigInteger("215"));
        assertEquals(new BigInteger("215"), processResult(result));

        result = FourSquares.GetRepresentation(new BigInteger("333"));
        assertEquals(new BigInteger("333"), processResult(result));

        result = FourSquares.GetRepresentation(new BigInteger("4093123"));
        assertEquals(new BigInteger("4093123"), processResult(result));
//
//        result = FourSquares.GetRepresentation(new BigInteger("11234567890"));
//        assertEquals(new BigInteger("11234567890"), processResult(result));

//        result = FourSquares.GetRepresentation(new BigInteger("10636924936557535283"));
//        assertEquals(new BigInteger("10636924936557535283"), processResult(result));
    }

    private static final BigInteger processResult(BigInteger[] result){
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
}
