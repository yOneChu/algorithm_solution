package org.kyhslam.inflearnJava.dfs;


public class dfs_10 {

    static int[][] board = {
            {0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 1, 1, 0},
            {0, 0, 0, 1, 0, 0, 0},
            {1, 1, 0, 1, 0, 1, 1},
            {1, 1, 0, 0, 0, 0, 1},
            {1, 1, 0, 1, 1, 0, 0},
            {1, 0, 0, 0, 0, 0, 0}
    };

    // LEFT, RIGHT, TOP, DOWN
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int cnt = 0;


    public void DFS(int x, int y) {

        if (x == 6 && y == 6) {
            cnt++;
        }else {
            for(int i=0; i < 4; i++){
                int xx = x + dx[i];
                int yy = y + dy[i];

                if (xx >= 0 && yy >= 0 && xx < 7 && yy < 7) {

                    if (board[xx][yy] == 0) {
                        board[xx][yy] = 1;
                        DFS(xx, yy);
                        board[xx][yy] = 0;
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        dfs_10 t = new dfs_10();

        board[0][0] = 1;
        t.DFS(0,0);
        System.out.println("cnt === " + cnt);
    }
}
