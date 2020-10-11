package org.kyhslam.cps.section3;

import java.util.ArrayList;
import java.util.Scanner;

// 최소비용 (DFS : 가중치 방향그래프)
public class cp68 {

    public static ArrayList<Node>[] a;
    static boolean visited[];
    static int N = 0;
    static int cost = 100000; //최소비용

    public static class Node {
        int y;
        int dis;

        public Node(int y, int dis) {
            this.y = y;
            this.dis = dis;
        }
    }


    public static void DFS(int x, int distance) {

        if(x == N){
            if(cost > distance){
                cost = distance;
            }
            return;
        }else{
            //visited[x] = true;
            for(int i=0; i < a[x].size(); i++){
                Node node = a[x].get(i);

                if(visited[node.y] == false){
                    visited[node.y] = true;
                    DFS(node.y, distance + node.dis);
                    visited[node.y] = false;
                }
            }
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int m = sc.nextInt();

        a = (ArrayList<Node>[]) new ArrayList[N+1];
        visited = new boolean[N+1];

        for(int i=1; i<= N; i++){
            a[i] = new ArrayList<Node>();
        }


        for(int i=1; i<=m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            a[x].add(new Node(y,z));
        }

        DFS(1,0);
        System.out.println(cost);

    }


    public static void listView() {
        for(int i=1; i<= N; i++){
            for(int j=0; j<a[i].size(); j++){
                Node node = a[i].get(j);
                System.out.println(i + " == " + node.y + " , " + node.dis);
            }
        }
    }
}
