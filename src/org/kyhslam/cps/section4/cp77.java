package org.kyhslam.cps.section4;


import java.util.Scanner;

// 친구인가 (Union-Find)
public class cp77 {

    static int[] parent = new int[100];

    public static int find(int x){
        if(x == parent[x]){
            return x;
        }else{
            return parent[x] = find(parent[x]);
        }
    }

    public static void union(int x, int y){
        x = find(x);
        y = find(y);

        // 같은 부모를 가지고 있지 않으면
        if(x != y){
            // y가 x보다 크다는 가정하에 아래와 같이 표현
            parent[y] = x;
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        //셋팅
        for(int i=1; i<= n; i++){
            parent[i] = i;
        }

        for(int i=1; i <= m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            union(a, b);
        }

        int c = sc.nextInt();
        int d = sc.nextInt();


        if(find(c) == find(d)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        /*if(parent[c] == parent[d]){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }*/

    }
}
