package org.codewars.smaller_than_me;

public class Smaller {

    /**
     * This is a hard version of How many are smaller than me?.
     * If you have troubles solving this one, have a look at the easier kata first.
     * <p>
     * Write: function smaller(arr)
     * that given an array arr, you have to return the amount of numbers that are smaller than arr[i] to the right.
     * <p>
     * For example:
     * smaller([5, 4, 3, 2, 1]) === [4, 3, 2, 1, 0]
     * smaller([1, 2, 0]) === [1, 1, 0]
     */
    public static int[] smaller(int[] unsorted) {
        int[] result = new int[unsorted.length];
        Abc abc = null;
        for (int i = unsorted.length - 1; i >= 0; i--) {
            abc = getSmaller(abc, unsorted[i], result, 0, i);
        }

        return result;
    }

    private static Abc getSmaller(Abc abc, int num, int[] result, int sum, int i) {
        if (abc == null) {
            result[i] = sum;
            return new Abc(num);
        }
        if (abc.val == num) {
            abc.dup++;
            result[i] = sum + abc.count;
        } else if (abc.val > num) {
            abc.count++;
            abc.left = getSmaller(abc.left, num, result, sum, i);
        } else {
            abc.right = getSmaller(abc.right, num, result, sum + abc.count + abc.dup, i);
        }
        return abc;
    }


    private static class Abc {
        public int dup;
        public Abc left;
        public Abc right;
        public int val;
        public int count;

        public Abc(int val) {
            this.dup = 1;
            this.val = val;
            this.count = 0;
        }
    }
}
