package com.kyhslam.inflearnJava.dp;

public class dp_03 {

    static int[] dp;
    static int maxCount = Integer.MIN_VALUE;



    public static void solution(int[] arr) {

        dp[0] = 1;
        for (int i = 1; i < arr.length; i++) {

            int maxValue = 0;
            for (int j = i - 1; j >= 0; j--) {

                if (arr[j] < arr[i] && maxValue < dp[j]) {
                    maxValue = dp[j];
                }
            }
            dp[i] = maxValue + 1;
            maxCount = Math.max(maxCount, dp[i]);
        }

        System.out.println(maxCount);

    }

    public static void main(String[] args) {

        int[] arr = {5,3,7,8,6,2,9,4};

        dp = new int[arr.length];

        solution(arr);

    }
}
