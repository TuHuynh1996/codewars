package org.codewars.mumbling;

import java.util.ArrayList;
import java.util.List;

public class Accumul {

    /**
     * This time no story, no theory. The examples below show you how to write function accum:
     *
     * @Examples: accum(" abcd ") -> "A-Bb-Ccc-Dddd"
     * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
     * accum("cwAt") -> "C-Ww-Aaa-Tttt"
     * <p>
     * The parameter of accum is a string which includes only letters from a..z and A..Z.
     */
    public static String accum(String s) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            strings.add(multiplyChar(s.charAt(i), i + 1));
        }
        return String.join("-", strings);
    }

    private static String multiplyChar(char c, int cal) {
        char[] chars = new char[cal];
        for (int i = 0; i < cal; i++) {
            if (i == 0) {
                chars[i] = Character.toUpperCase(c);
            } else {
                chars[i] = Character.toLowerCase(c);
            }
        }
        return new String(chars);
    }
}
