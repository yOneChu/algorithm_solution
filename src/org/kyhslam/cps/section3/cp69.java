package org.kyhslam.cps.section3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 이진트리 넓이우선탐색(BFS)
public class cp69 {

    static ArrayList<Integer>[] a;
    static boolean[] visited;

    public static void BFS(int start) {

        Queue<Integer> queue = new LinkedList<Integer>();

        if(visited[start] == true){
            return;
        }else{

            queue.add(start);
            visited[start] = true;
            while(!queue.isEmpty()) {

                int x = queue.remove();
                System.out.print(x);

                for(int i=0; i < a[x].size(); i++){
                    int y = a[x].get(i);
                    if(visited[y] == false){
                        queue.add(y);
                        visited[y] = true;
                    }
                }



            }

        }




    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();

        a = (ArrayList<Integer>[]) new ArrayList[8];
        visited = new boolean[8];

        for(int i=1; i<= 7; i++){
            a[i] = new ArrayList<Integer>();
        }

        for(int i=1; i <= M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            a[x].add(y);
            a[y].add(x);
        }


        //연결확인
        for(int i=1; i < a.length; i++){
            //System.out.println(i + " == " + a[i]);
        }

        BFS(1);










    }
}
