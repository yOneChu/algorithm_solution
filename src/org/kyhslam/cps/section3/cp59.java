package org.kyhslam.cps.section3;


import java.util.Scanner;

// 부분집합(MS인터뷰, DFS 완전탐색)
public class cp59 {

    static int n = 0;
    static boolean[] visitied = new boolean[50];

    public static void DFS(int level){

        if(level == n+1) {
            for(int i=1; i< visitied.length; i++){
                if(visitied[i] == true) System.out.print(i + " ");
            }
            System.out.println();
        }else{
            visitied[level] = true;
            DFS(level+1);

            visitied[level] = false;
            DFS(level+1);
        }



    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        DFS(1);

    }

}
