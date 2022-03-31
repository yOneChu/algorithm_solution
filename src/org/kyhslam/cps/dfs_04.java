
package org.kyhslam.inflearnJava.dfs;

import java.util.Scanner;

public class dfs_04 {

    /**
     * 중복순열
     */
    static int N = 0;
    static int M = 0;
    static int level = 0;

    public void dfs(int level, int[] arr) {

        if (level == M) {
            System.out.println(arr[0] + " " + arr[1]);
        } else {
            for (int i = 1; i <= N; i++) {
                arr[level] = i;
                dfs((level + 1), arr);
            }
        }

    }


    public static void main(String[] args) {
        dfs_04 t = new dfs_04();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        int[] a = new int[M];

        System.out.println("N = " + N);
        System.out.println("M = " + M);
        System.out.println("a = " + a.length);
        //t.dfs(0, a);
        t.dfs(0, a);
    }
}
