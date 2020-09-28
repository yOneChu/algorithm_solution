package org.kyhslam.cps.section4;


import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

//원더랜드(Prim MST 알고리즘 : priority_queue 활용)
public class cp79 {

    static ArrayList<Edge> [] a;
    static boolean visited[];

    static int res = 0;

    public static class Edge implements Comparable<Edge> {
        int node;
        int distance;

        public Edge(int node, int distance){
            this.node = node;
            this.distance = distance;
        }

        @Override
        public int compareTo(Edge o) {
            return this.distance <= o.distance ? -1 : 1;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "node=" + node +
                    ", distance=" + distance +
                    '}';
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt(); // 도시의 개수(노드)
        int e = sc.nextInt(); // 도로의 개수(간선)

        a = (ArrayList<Edge>[]) new ArrayList[v+1];
        visited = new boolean[v+1];


        //우선순위 큐
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();


        //노드 초기화
        for(int i=1; i <= 9; i++){
            a[i] = new ArrayList<Edge>();
        }


        //노트연결
        for(int i=1; i <= e; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt(); //가중치

            //양방향 연결
            a[x].add(new Edge(y,z));
            a[y].add(new Edge(x,z));
        }

        // 1부터 시작
        priorityQueue.add(new Edge(1,0));

        while (!priorityQueue.isEmpty()){
            Edge tmp = priorityQueue.poll();
            //System.out.println("poll == " + tmp.node + " : " + tmp.distance);

            int target = tmp.node;
            int cost = tmp.distance;

            if(visited[target] == false){

                res = res + cost;
                visited[target] = true;
                for(int i=0; i < a[target].size(); i++){
                    Edge tt = a[target].get(i);
                    System.out.println(tt.node + " : " + tt.distance);
                    priorityQueue.add(tt);
                }
            }

            //System.out.println("-----------------");
            //System.out.println(priorityQueue);
            //System.out.println("-----------------");
        }

        System.out.println("res == " + res);

        for(int i=1; i < a.length; i++){
            for(int y=0; y < a[i].size(); y++){
                Edge eg = a[i].get(y);
                System.out.println(i + " - " + eg.node + " : " + eg.distance);
            }
        }

    }
}


/*
9 12
1 2 12
1 9 25
2 3 10
2 8 17
2 9 8
3 4 18
3 7 55
4 5 44
5 6 60
5 7 38
7 8 35
8 9 15
*/
