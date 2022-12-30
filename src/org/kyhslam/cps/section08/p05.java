package org.kyhslam.inflearnJava.dfs_Practice;

import java.util.Scanner;

public class p05 {

    private static int N, M = 0;
    private static int[] arr;
    private static int answer = Integer.MAX_VALUE;

    private static void DFS(int level, int totalSum, int[] arr) {


        if(M <= totalSum) {
            if (M == totalSum) {
                answer = Math.min(level, answer);
            }
            return;
        } else {
            for (int i = 0; i < arr.length; i++) {
                DFS(level + 1, totalSum + arr[i], arr);
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        M = sc.nextInt();

        DFS(0, 0, arr);

        System.out.println("answer = " + answer);
    }
}
