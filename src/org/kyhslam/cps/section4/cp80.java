package org.kyhslam.cps.section4;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

// 다익스트라 알고리즘(우선순위 큐)
public class cp80 {

    static ArrayList<Edge>[] a;
    static boolean[] visited;
    static int[] distance;

    public static class Edge implements Comparable<Edge> {

        int y;
        int dis;

        public Edge(int y, int dis) {
            this.y = y;
            this.dis = dis;
        }

        @Override
        public int compareTo(Edge o) {
            return this.dis <= o.dis ? -1 : 1;
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        a = (ArrayList<Edge>[]) new ArrayList[N+1];
        visited = new boolean[N+1];
        distance = new int[N+1];

        for(int i=1; i <= N; i++){
            a[i] = new ArrayList<Edge>();
            distance[i] = 21470000;
        }

        for(int i=1; i <= M; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int dis = sc.nextInt(); // 거리

            a[x].add(new Edge(y,dis));
        }

        //우선순위 큐
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();


        // 1부터 시작
        priorityQueue.add(new Edge(1,0));

        //탐색 시작
        while( !priorityQueue.isEmpty() ){

            Edge eg = priorityQueue.poll(); // 빼기
            int now = eg.y;
            int cost = eg.dis;

            visited[now] = true;

            for(int i=0; i < a[now].size(); i++){
                Edge node = a[now].get(i);
                int next = node.y;
                int nextDis = node.dis + cost;

                // 해당 정점에 연결된 정점 중에 탐색안해도 되는건 제외한다
                if(visited[next] == false){

                    // distance 거리보다 작은 값을 경우에 우선순위 큐에 넣어 준다.
                    if(nextDis < distance[next]){
                        distance[next] = nextDis;
                        priorityQueue.add(new Edge(next,nextDis));
                    }
                }
            }

        }






        for(int i=1; i < a.length; i++){
            for(int y=0; y < a[i].size(); y++){
                Edge ee =   a[i].get(y);
                //System.out.println(i + " === " +  ee.y + " : " + ee.dis);
            }
        }


        for(int i=1; i <= N; i++){
            System.out.println(i + " == " + distance[i]);
        }

    }
}
