package org.kyhslam.inflearnJava.dp;

import java.util.Arrays;
import java.util.Scanner;

public class dp_05 {

    static int N; // 동전의 개수
    static int[] coinArr;
    static int[] dp;
    static int M; // 거슬러 줄 금액
    public static void solution(int[] coinArr) {
        dp = new int[M+1]; // 동전금액 길이만큼 만큼 초기화
        Arrays.fill(dp, Integer.MAX_VALUE); // 0으로 초기화
        System.out.println("Arrays.toString(dp) = " + Arrays.toString(dp));
        dp[0] = 0;

        for (int i = 0; i < coinArr.length; i++) {

            int curCash = coinArr[i]; // 금액

            for (int j = curCash; j < dp.length; j++) {
                dp[j] = Math.min( (dp[j - curCash] + 1), dp[j]);
            }
        }

        System.out.println("Arrays.toString(dp) = " + Arrays.toString(dp));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 동전의 개수

        coinArr = new int[N];

        //동전 셋팅
        for (int i = 0; i < N; i++) {
            coinArr[i] = sc.nextInt();
        }

        System.out.println("Arrays.toString(coinArr) = " + Arrays.toString(coinArr));

        M = sc.nextInt(); // 거슬러줄 금액
        solution(coinArr);

        System.out.println("dp[M] = " + dp[M]);
    }
}
