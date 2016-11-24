package com.deepak.codility;

import java.util.Arrays;

/**
 * @author Deepak
 *
 */
public class PermCheck {

    public static int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != (i + 1)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] A = new int[] { 4, 1, 3, 2 };
        System.out.println(solution(A));
    }

}
