package org.codewars.four_squares;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.List;

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
    public void TestInputs() {
        BigInteger[] result = new BigInteger[4];

//        result = FourSquares.GetRepresentation(new BigInteger("0"));
//        assertEquals(new BigInteger("0"), processResult(result));
//
//        result = FourSquares.GetRepresentation(new BigInteger("1"));
//        assertEquals(new BigInteger("1"), processResult(result));
//
//        result = FourSquares.GetRepresentation(new BigInteger("17"));
//        assertEquals(new BigInteger("17"), processResult(result));
//
//        result = FourSquares.GetRepresentation(new BigInteger("33"));
//        assertEquals(new BigInteger("33"), processResult(result));

        result = FourSquares.GetRepresentation(new BigInteger("215"));
        assertEquals(new BigInteger("215"), processResult(result));

//        result = FourSquares.GetRepresentation(new BigInteger("333"));
//        assertEquals(new BigInteger("333"), processResult(result));
//
//        result = FourSquares.GetRepresentation(new BigInteger("4093"));
//        assertEquals(new BigInteger("4093"), processResult(result));
//
//        result = FourSquares.GetRepresentation(new BigInteger("1234567890"));
//        assertEquals(new BigInteger("1234567890"), processResult(result));
//        result = FourSquares.GetRepresentation(new BigInteger("90636924936557535283"));
//        assertEquals(new BigInteger("90636924936557535283"), processResult(result));
    }

    @Test
    public void Test1SmallInputs() {
        BigInteger[] result = new BigInteger[4];

        BigInteger test = new BigInteger("165323402823669209384634633746337467165323");
        result = FourSquares.GetRepresentation(test);
        assertEquals(test, processResult(result));
    }

    @Test
    public void Test2MediumInputs() {
        BigInteger[] result = new BigInteger[4];
        BigInteger test = new BigInteger("165323402823669209384634633746337467165323402823669209317");
        result = FourSquares.GetRepresentation(test);
        assertEquals(test, processResult(result));
    }
}
