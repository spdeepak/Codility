package com.deepak.codility;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Deepak
 *
 */
public class TapeEquilibrium {

    public static int solution(int[] A) {
        Integer low = null;
        for (int i = 1; i < A.length; i++) {
            int v = Math.abs(IntStream.of(Arrays.copyOfRange(A, 0, i)).sum()
                    - IntStream.of(Arrays.copyOfRange(A, i, A.length)).sum());
            if (i != 1) {
                low = low < v ? low : v;
            } else {
                low = v;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] A = new int[] { 3, 1, 2, 4, 3, 123, 43, -45 };
        long start = System.currentTimeMillis();
        System.out.println("\nSolution is: " + solution(A));
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);

        //        for (int i = 1; i < A.length; i++) {
        //            System.out.println("P = " + i + ", difference = |" + IntStream.of(Arrays.copyOfRange(A, 0, i)).sum() + "-"
        //                    + IntStream.of(Arrays.copyOfRange(A, i, A.length)).sum() + "| = "
        //                    + Math.abs(IntStream.of(Arrays.copyOfRange(A, 0, i)).sum()
        //                            - IntStream.of(Arrays.copyOfRange(A, i, A.length)).sum()));
        //        }
    }
}
