package com.deepak.codility;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Deepak
 *
 */
public class FrogRiverOne {

    public static int solution(int X, int[] A) {
        Set<Integer> set = new HashSet();
        for (int i = 0; i < X; i++) {
            set.add(i + 1);
        }
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i])) {
                set.remove(A[i]);
            }
            if (set.isEmpty()) {
                return (i);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = new int[] { 1, 3, 1, 4, 2, 3, 5, 4 };
        int X = 5;
        System.out.println(solution(X, A));
    }
}
