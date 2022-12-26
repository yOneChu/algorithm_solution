package org.kyhslam.inflearnJava.dfs_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class p01 {

    private static int n;
    private static int[] arr;
    private static int totalSum = 0;
    private static boolean flag = false;
    private static String answer="NO";

    private static void DFS(int level, int sum, int[] arr) {

        if(flag) return;

        if (level == n) {
            if ((totalSum - sum) == sum) {
                flag = true;
            }
        } else {
            DFS(level + 1, sum + arr[level], arr);
            DFS(level + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        //6
        //1 3 5 6 7 10
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(totalSum);

        DFS(0, 0, arr);
        System.out.println("FLAG = " + flag);
        //System.out.println("answer = " + answer);
    }
}
