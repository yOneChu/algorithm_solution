package org.kyhslam.algorithm;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 송아지 찾기(BFS:상태트리)
public class cp71 {

    public static int[] visited = new int[100];
    public static int[] distance = {1,-1,5};


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int E = sc.nextInt();

        // 5 14 -> 3

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(S);
        visited[S]= 1;
        while (!queue.isEmpty()){
            int x = queue.remove(); // 현재 node
            for(int i=0; i < distance.length; i++){
                int jump = distance[i];
                int d = x + jump; // 점프한 node

                if(d == E){
                    System.out.println("eee " + visited[x]);
                    return;
                }

                if(visited[d] == 0){
                    visited[d] = visited[x] + 1;
                    queue.add(d);
                }
            }

        }




    }
}
