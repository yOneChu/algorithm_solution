package org.kyhslam.inflearnJava.dfs_Practice;

public class p07 {

    private static int[][] memo;
    private static int DFS(int n, int r) {

        if(memo[n][r] != 0) return memo[n][r];

        if(r == 1) {
            memo[n][r] = n;
            return n;
        }

        if(n == r || r == 0) {
            memo[n][r] = 1;
            return 1;
        }
        else {
            //memo[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
            return memo[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }

    }

    public static void main(String[] args) {

        memo = new int[100][100];

        System.out.println(DFS(5, 3));
    }
}
