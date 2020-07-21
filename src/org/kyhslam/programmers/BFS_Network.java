package org.kyhslam.programmers;


// 깊이/너비우선탐색 : 네트워크 level.3
public class BFS_Network {


    public static int p[][] = {
                            {1,1,0},
                            {1,1,0},
                            {0,0,1}
                        };

    public static boolean visited[];
    public static int cnt = 0;


    public static void main(String[] args) {


        view(p);


        solution(3, p);


    }

    public static void view(int[][] arr){
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr[i].length; j++){
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int solution(int n, int[][] computers){
        visited = new boolean[n];
        int count = 0;

        computers = p;

        for(int i=0; i < visited.length; i++){
            if(visited[i] == false){
                count += dfs(i, computers);
            }
        }

        System.out.println("count == " + count);
        //dfs(1);

        return 0;
    }


    public static int dfs(int x, int[][] computers){

        if(visited[x]){
            return 0;
        }

        visited[x] = true;

        for(int y=0; y < p[x].length; y++){
            if(computers[x][y] == 1 && visited[y] == false){
                dfs(y, computers);
            }
        }

        return 1;
    }


}
