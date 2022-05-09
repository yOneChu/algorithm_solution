package org.kyhslam.inflearnJava.twoPointer;

import java.util.Scanner;

public class cp04 {

    static int answer = 0;


    public static void solution(int N, int M, int[] arr) {

        int lt = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
            if(sum == M) answer++;
            while(sum >= M) {
                sum -= arr[lt++];
                if(sum == M) answer++;
            }
        }
        System.out.println("answer = " + answer);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 8
        int M = sc.nextInt(); // 6

        int[] arr = {1, 2, 1, 3, 1, 1, 1, 2};

        solution(N, M, arr);
    }
}
