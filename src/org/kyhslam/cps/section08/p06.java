package org.kyhslam.inflearnJava.dfs_Practice;

import java.util.Scanner;

public class p06 {

    private static int N, M;
    private static int[] arr;
    private static int[] pm;

    private static void DFS(int level, int[] visited, int[] pm) {

        if (level == M) {

            for (int i = 0; i < pm.length; i++) {
                System.out.printf(pm[i] + " ");
            }
            System.out.println("");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if(visited[i] == 0) {
                    pm[level] = arr[i];
                    visited[i] = 1;
                    DFS(level+1, visited, pm);
                    visited[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {

        //3 2
        //3 6 9
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); //
        M = sc.nextInt(); // 출력 개수

        arr = new int[N];
        pm = new int[M];
        //visited = new int[N];
        int[] visited = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        DFS(0, visited, pm);

    }
}
