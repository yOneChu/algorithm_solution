package org.kyhslam.inflearnJava.dfs;

import java.util.Scanner;

public class dfs_02 {

    /**
     * 바둑이 승차(DFS)
     */

    static int C = 0;
    static int N = 0;
    static int answer = 0;

    public void dfs(int level, int sum, int[] arr) {

        if (sum > C) {
            return;
        }

        if (level == N) {
            answer = Math.max(answer, sum);
        } else {
            dfs(level + 1, (sum + arr[level]), arr);
            dfs(level + 1, sum, arr);
        }

    }

    public static void main(String[] args) {
        dfs_02 t = new dfs_02();

        Scanner sc = new Scanner(System.in);
        C = sc.nextInt(); // 최대 무게
        N = sc.nextInt(); // 개수

        int[] data = new int[N];

        for (int i = 0; i < N; i++) {
            data[i] = sc.nextInt();
        }

        t.dfs(0, 0, data);
        System.out.println("answer = " + answer);
    }
}
