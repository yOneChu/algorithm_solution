package org.kyhslam.inflearnJava.recur;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p08 {

    private static int[] dis = {1, -1, 5};
    private static int[] ch = new int[10001]; // 방문여부
    private static Queue<Integer> queue = new LinkedList<>();

    private static int BFS(int s, int e) {

        ch[s] = 1;
        queue.offer(s);
        int level = 0;

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int x = queue.poll();

                //거리 이동
                for (int j = 0; j < dis.length; j++) {
                    int nx = x + dis[j];

                    if(nx == e) return level+1;
                    if(ch[nx] == 0 && nx >= 1 && nx <= 10000) {
                        queue.offer(nx);
                        ch[nx] = 1;
                    }
                }
            } // end for
            level++;
        } // end while

        return 0;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        int answer = BFS(input1, input2);
        System.out.println(answer);

    }
}
