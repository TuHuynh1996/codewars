package array.diff;

public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        if(b.length == 0) {
            return a;
        }
        int size = a.length;
        for (int k : a) {
            for (int i : b) {
                if (k == i) {
                    size--;
                    break;
                }
            }
        }
        int[] result = new int[size];
        int index = 0;
        int countEq;
        for (int k : a) {
            countEq = 0;
            for (int i : b) {
                if (k == i) {
                    countEq++;
                    break;
                }
            }
            if (countEq == 0) {
                result[index] = k;
                index++;
            }
        }
        return result;
    }
//
//    public static int[] arrayDiff2(int[] a, int[] b) {
//        List myArray = new ArrayList<Integer>();
//        boolean flag = true;
//        for (int ia : a) {
//            for (int i = 0; i < b.length; i++) {
//                flag = true;
//                if (b[i] == ia) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                myArray.add(ia);
//            }
//        }
//        a = myArray.stream().mapToInt(i -> (int) i).toArray();
//        return a;
//    }

}
