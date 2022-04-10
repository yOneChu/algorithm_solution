package com.kyhslam.inflearnJava.dfs;

import java.util.Scanner;

/**
 * 조합 구하기(DFS)
 */
public class dfs_01 {

    static int[] combi;
    static int N = 0;
    static int M = 0;

    public void DFS(int level, int start) {

        if (level == M) {
            for(int x : combi) System.out.print(x + " ");
            System.out.println();
            return;
        } else {

            for (int i = start; i <= N; i++) {
                combi[level] = i;
                DFS((level + 1), (i+1));
            }
        }

    }

    public static void main(String[] args) {
        dfs_01 t = new dfs_01();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        combi = new int[M];
        t.DFS(0, 1);
    }
}
