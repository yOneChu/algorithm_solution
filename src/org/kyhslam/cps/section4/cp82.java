package org.kyhslam.cps.section4;

import java.util.Scanner;

// 순열구하기(DFS) 완전탐색
public class cp82 {

    static int[] a = {1,3,6,7};
    static int[] res;
    static boolean[] check;
    static int N;
    static int R;
    static int cnt = 0;

    static void DFS(int L) {
        if(L == R){
            for(int i=0; i < L; i++){
                System.out.print(res[i] + " ");
            }
            cnt++;
            System.out.println();
            return;
        }else{

            for(int i=0; i < N; i++){
                if(check[i] == false){
                    res[L] = a[i];
                    check[i] = true;
                    DFS(L+1);
                    check[i] = false;
                }


            }
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //int N = sc.nextInt();
        //int R = sc.nextInt();

        // 4, 3
        N = 4;
        R = 3;

        //a = new int[N];
        res = new int[100];
        check = new boolean[100];

        // 1 3 6 7
        DFS(0);

        System.out.println("cnt :: " + cnt);
    }



}
