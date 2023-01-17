package org.codewars.order;

public class Order {
    /**
     * Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
     * <p>
     * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
     * <p>
     * If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
     *
     * @Examples: "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
     * "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
     * ""  -->  ""
     */
    public static String order(String words) {
        String[] wordArray = words.split(" ");
        String[] wordSoftArray = new String[wordArray.length];
        boolean flag = false;
        for (String word : wordArray) {
            for (char c : word.toCharArray()) {
                if (Character.isDigit(c)) {
                    wordSoftArray[c - '1'] = word;
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            return String.join(" ", wordSoftArray);
        }
        return "";
    }
}
