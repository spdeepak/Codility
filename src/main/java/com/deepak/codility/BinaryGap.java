package com.deepak.codility;

import java.util.stream.Stream;

/**
 * @author Deepak
 *
 */
public class BinaryGap {

    public static int solution(int N) {
        //        String[] binary = Integer.toBinaryString(N).split("");
        //        int[] L = new int[binary.length];
        //        int s = 0;
        //        int x = Integer.toBinaryString(N).lastIndexOf("1");
        //        for (int i = 1; i < x; i++) {
        //            if (binary[i].equals("0")) {
        //                L[s] += 1;
        //            } else {
        //                s++;
        //            }
        //        }
        //        int large = L[0];
        //        for (int i = 0; i < L.length; i++) {
        //            if (large < L[i]) {
        //                large = L[i];
        //            }
        //        }
        //        return large;
        return Stream.of(Integer.toBinaryString(N).replaceAll("0+$", "").split("1+")).filter(a -> a != null)
                .map(String::length).max(Integer::compare).orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(solution(51712));
        System.out.println(String.format("Hi %s, I am %s", "Namratha", "Deepak"));
    }
}
