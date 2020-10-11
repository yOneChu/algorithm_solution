package org.kyhslam.cps.section3;

import java.util.ArrayList;
import java.util.Scanner;


//최소비용(DFS : 인접행렬)
public class cp67 {

    static int[][] map = new int[10][10];
    static ArrayList<Integer>[] a ;

    static boolean[] visitied;
    static int N = 0;
    static int cost = 2147000000;


    static void DFS(int v, int sum){

        if(v == N){
            if(sum < cost){
                cost = sum;
                //System.out.println(cost);
            }
        }else{
            for(int i=0; i<= N; i++){
                if(map[v][i] >0 && visitied[i] == false){
                    visitied[i] = true;
                    DFS(i,sum+map[v][i]);
                    visitied[i] = false;
                }


            }

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();

        for(int i=0; i<= N; i++){
            //a[i] = new ArrayList<Integer>();
        }

        visitied = new boolean[N+1];

        for(int i=1; i<= M; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int dis = sc.nextInt();

            //a[x].add()
            map[x][y] = dis;
        }

        DFS(1,0);
        System.out.println(cost);


        /*for(int i=0; i < map.length; i++){
            for(int j=0; j < map[i].length; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }*/
    }
}
