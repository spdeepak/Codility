package com.deepak.codility;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Deepak
 *
 */
public class MissingInteger {

    public int solution(int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            set.add(i + 1);
        }
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i])) {
                set.remove(A[i]);
            }
        }
        return set.isEmpty() ? (A.length + 1) : set.stream().findFirst().get();
    }

    public static void main(String[] args) {
        int[] A = new int[10000];
        System.out.println(A.length);
        System.out.println(new int[1].length);
        for (int i = 0; i < 10000; i++) {
            A[i] = i + 1;
        }
        System.out.println(A[A.length - 1]);
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            set.add(i + 1);
        }
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i])) {
                set.remove(A[i]);
            }
        }
        System.out.println(set.isEmpty() ? A[A.length - 1] : set.stream().findFirst().get());
    }
}
