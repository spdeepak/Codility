package com.deepak.codility;

/**
 * @author Deepak
 *
 */
public class FrogJmp {

    public static int solution(int X, int Y, int D) {
        //        int count = 0;
        //        while (X <= Y) {
        //            X = X + D;
        //            count++;
        //        }
        //        return count;
        return (int) Math.ceil((Y - X) / (double) D);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(solution(10, 850000000, 1));
        long end = System.currentTimeMillis();
        System.out.println("Start: " + start + " End: " + end + " Time Taken: " + (end - start) / 1000.00);
        System.out.println((int) Math.ceil((85 - 10) / 30.0));
    }

}
