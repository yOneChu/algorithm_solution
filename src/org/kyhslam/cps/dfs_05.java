package org.kyhslam.inflearnJava.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class dfs_05 {

    /**
     * 동전교환
     */
    static int N = 0; //동전의 종류개수
    static Integer[] arr; // 동전종류
    static int M = 0; //거슬러줄 금액
    static int minCount = Integer.MAX_VALUE;


    public void dfs(int level, int sum) {

        if (sum > M || level > minCount) {
            return;
        }

        if (sum == M) {
            System.out.println("level = " + level + ", " + sum);
            minCount = Math.min(level, minCount);
            return;
        }else {

            for (int i = 0; i < arr.length; i++) {
                dfs((level+1), (sum+arr[i]));
            }


        }

    }


    public static void main(String[] args) {
        dfs_05 t = new dfs_05();

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());
        M = sc.nextInt();


        t.dfs(0, 0);

        System.out.println("minCount = " + minCount);
    }
}
