package com.deepak.codility;

/**
 * @author Deepak
 *
 */
public class CyclicRotation {

    public static int[] solution(int[] A, int K) {
        int[] B = null;
        if (A != null && A.length != 0 && K > 0) {
            B = new int[A.length];
            for (int j = 1; j <= K; j++) {
                B[0] = A[A.length - 1];
                for (int i = 0; i < A.length - 1; i++) {
                    B[i + 1] = A[i];
                }
                A = B;
                B = (j != K) ? new int[A.length] : B;
            }
        } else {
            return A;
        }
        return B;
    }

    public static void main(String[] args) {
        int[] B = solution(new int[] { 4, 6, 0, 0, -2, 10 }, 0);
        printArray(B);
    }

    private static void printArray(int[] C) {
        for (int a : C) {
            System.out.print(a + " ");
        }
        System.out.println("");
    }
}
