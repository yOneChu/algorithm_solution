package org.kyhslam.inflearnJava.twoPointer;

import java.util.Scanner;

public class cp06 {


    /**
     * 최대 길이 연속부분수열 (05.10)
     */

    public static void solution(int[] arr, int N, int K) {

        int answer = Integer.MIN_VALUE;
        int cnt = 0; // 변경한 횟수
        int lt = 0;

        for (int i = 0; i < N; i++) {
            if(arr[i] == 0) cnt++;
            while (cnt > K) {
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, (i - lt + 1));
        }

        System.out.println("answer = " + answer);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 14
        int K = sc.nextInt(); // 2

        int[] arr = {1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1};

        solution(arr, N, K);

        // answer : 8
    }
}
