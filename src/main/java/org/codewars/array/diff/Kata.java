package org.codewars.array.diff;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        return listA.stream().mapToInt(e -> e).toArray();
    }

// public static int[] arrayDiff(int[] a, int[] b) {
//     if(b.length == 0) {
//         return a;
//     }
//     int size = a.length;
//     for (int k : a) {
//         for (int i : b) {
//             if (k == i) {
//                 size--;
//                 break;
//             }
//         }
//     }
//     int[] result = new int[size];
//     int index = 0;
//     int countEq;
//     for (int k : a) {
//         countEq = 0;
//         for (int i : b) {
//             if (k == i) {
//                 countEq++;
//                 break;
//             }
//         }
//         if (countEq == 0) {
//             result[index] = k;
//             index++;
//         }
//     }
//     return result;
// }
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
