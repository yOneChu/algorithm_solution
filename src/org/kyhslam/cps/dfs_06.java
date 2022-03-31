package org.kyhslam.inflearnJava.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class dfs_06 {

    /**
     * 순열 구하기
     */
    static int N = 0; // 개수
    static int M = 0; // 뽑는 개수
    static int[] arr; //

    //내가한거
    public void dfs(int level, int[] data) {

        if(level == M) {
            System.out.println(Arrays.toString(data));
            //System.out.println("data = " + data);
            return;
        } else {
            for (int i = 0; i < N; i++) {
                if(level != 0 && data[level-1] == arr[i]) {

                } else {
                    data[level] = arr[i];
                    dfs((level + 1), data);
                }

            }
        }


    }

    public static void main(String[] args) {
        dfs_06 t = new dfs_06();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] d = new int[M];
        //ArrayList<Integer> d = new ArrayList<>();

        t.dfs(0, d);
    }
}
