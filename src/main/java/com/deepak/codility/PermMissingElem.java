package com.deepak.codility;

import java.util.stream.IntStream;

/**
 * @author Deepak
 *
 */
public class PermMissingElem {

    public static int solution(int[] A) {
        int[] B = new int[A.length + 1];
        for (int i = 0; i < A.length + 1; i++) {
            B[i] = i + 1;
        }
        return IntStream.of(B).sum() - IntStream.of(A).sum();
    }

    public static void main(String[] args) {
        int[] A = new int[] { 2, 3, 1, 4, 6 };
        System.out.println(solution(A));
    }
}
