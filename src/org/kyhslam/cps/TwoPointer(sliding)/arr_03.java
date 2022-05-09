package org.kyhslam.inflearnJava.twoPointer;

import java.util.Scanner;

public class cp03 {


    static int answer = Integer.MIN_VALUE;

    public static void solution(int N, int K, int[] arr) {

        int lt = 0;
        int rt = 0;
        int sum = 0;

        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }

        answer = Math.min(sum, answer);
        System.out.println("sum = " + sum);

        for (int i = 3; i < N; i++) {
            sum += arr[i] - arr[i-K];
            answer = Math.max(sum, answer);
        }

        System.out.println("answer = " + answer);

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = {12, 15, 11, 20, 25, 10, 20, 19, 13, 15};

        solution(N, K, arr);
    }

}
