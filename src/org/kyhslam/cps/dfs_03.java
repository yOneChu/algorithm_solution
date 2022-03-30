package org.kyhslam.inflearnJava.dfs;

import java.util.Arrays;
import java.util.Scanner;

public class dfs_03 {

    /**
     * 최대점수 구하기 (DFS)
     */
    static int N = 0; // 문제개수
    static int M = 0; // 제한시간
    static int maxScore = 0; // 최대점수

    public void dfs(int level, int scoreSum, int timeSum, int[] jumsu, int[] time) {

        if (timeSum > M) {
            return;
        }
        if (level == N) {
            maxScore = Math.max(maxScore, scoreSum);
        } else {
            dfs(level + 1, (scoreSum + jumsu[level]), (timeSum + time[level]), jumsu, time);
            dfs(level + 1, (scoreSum), (timeSum), jumsu, time);
        }
    }

    public static void main(String[] args) {
        /*5 20
        10 5
        25 12
        15 8
        6 3
        7 4*/
        dfs_03 main = new dfs_03();

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        int[] j = new int[N];
        int[] t = new int[N];

        for (int i = 0; i < N; i++) {
            j[i] = sc.nextInt();
            t[i] = sc.nextInt();
        }

        System.out.println("Arrays.toString(j) = " + Arrays.toString(j));
        System.out.println("Arrays.toString(t) = " + Arrays.toString(t));

        main.dfs(0, 0, 0, j, t);
        System.out.println("maxScore = " + maxScore);
    }
}
