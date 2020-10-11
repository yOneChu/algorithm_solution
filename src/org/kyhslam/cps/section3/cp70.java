package org.kyhslam.cps.section3;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 그래프 최단거리(BFS)
public class cp70 {

    static ArrayList<Integer>[] a;
    static boolean[] visited;
    static int[] distance;

    public static void BFS(int start) {

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(start);

        while(!queue.isEmpty()) {
            int x = queue.remove();

            for(int y : a[x]) {
                if(visited[y] == false){
                    queue.add(y);
                    visited[y] = true;
                    distance[y] = distance[x]+1;
                }
            }

        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        a = (ArrayList<Integer>[]) new ArrayList[N+1];
        distance = new int[N+1];
        visited = new boolean[N+1];

        for(int i=1; i <= N; i++){
            a[i] = new ArrayList<Integer>();
        }

        for(int i=1; i <= M; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            a[x].add(y);
        }

        //연결확인
        for(int i=1; i < a.length; i++){
            //System.out.println(i + " == " + a[i]);
        }

        BFS(1);

        for(int i=2; i < distance.length; i++){
            System.out.print(i + " ::: " +  distance[i]);
            System.out.println();
        }
    }


}
