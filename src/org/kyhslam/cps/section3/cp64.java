package org.kyhslam.algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class cp64 {

    static ArrayList<Integer>[] a;
    static int cnt = 0;
    static boolean[] v = new boolean[6];

    public static void dfs(int x) {

        if(x == 5) {
            cnt++;
        }else{
            for(int y : a[x]) {
                System.out.println(x + " -> " + y);

                if(v[y] == false){
                    v[y] = true;
                    dfs(y);
                    v[y] = false;
                }

            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        a = (ArrayList<Integer>[]) new ArrayList[n+1];


        for(int i=1; i <= n; i++) {
            a[i] = new ArrayList<Integer>();
        }

        for(int i=0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            a[x].add(y);
        }

        for (int i=1; i < a.length; i++) {
            ArrayList<Integer> list = a[i];
            System.out.println(i + " == " + list);
        }

        v[1] = true;
        dfs(1);

        System.out.println(cnt);

    }
}
