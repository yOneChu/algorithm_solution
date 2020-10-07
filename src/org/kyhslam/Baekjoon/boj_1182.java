package org.kyhslam.Baekjoon;

import java.util.Scanner;

public class boj_1182 {

    static int[] array ; // {-7, -3, -2, 5, 8};
    static int count = 0; //

    static int N = 0;
    static int S = 0;

    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        S = sc.nextInt();

        array = new int[N];
        visited = new boolean[N];

        for(int i=0; i < N; i++){
            array[i] = sc.nextInt();
        }


        func(array, 0,0, visited);

        System.out.println(count);
    }


    //방문이 모두 false였을 경우, = 공집합의 경우는 제외하고 계산해야 한다.
    public static void func(int[] arr, int level, int sum, boolean[] visit){

        if(level == N){
            //모두 방문하지 않은거는 제외
            int falseCnt = 0;
            for (int i=0; i < visited.length; i++){
                if(visit[i] == false){
                    falseCnt++;
                }
            }

            if(falseCnt != N){
                if(sum == S){
                    count++;
                }
            }
        }else{
            visit[level] = true;
            func(arr, level+1, sum + arr[level], visit);

            visit[level] = false;
            func(arr, level+1, sum , visit);
        }
    }

}
