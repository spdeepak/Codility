package com.deepak.codility;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Deepak
 *
 */
public class OddOccurrencesInArray {

    public static int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }
        Integer v = null;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() % 2 != 0) {
                v = m.getKey();
                break;
            }
        }
        return v;
    }

    public static void main(String[] args) {
        int[] ar = new int[] { 9, 3, 9, 3, 9, 7, 9 };
        System.out.println(solution(ar));
    }
}
