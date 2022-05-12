package org.kyhslam.inflearnJava.twoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class cp05 {

    /**
     * 연속된 자연수의 합 (05.10)
     * @param args
     */

    static int answer = 0;

    public static void solution(int[] arr, int N) {

        int p1 = 0;
        int sum = 0;
        for (int i = 0; i < N-1; i++) {
            sum += arr[i];
            if(sum == N) answer++;
            while (sum >= N) {
                sum -= arr[p1++];
                if(sum == N) answer++;
            }
        }

        System.out.println("answer = " + answer);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = (i+1); 
        }

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        solution(arr, N);
        //answer : 3
    }
}
