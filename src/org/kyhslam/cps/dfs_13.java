package org.kyhslam.inflearnJava.dfs;

public class dfs_13 {

    /**
     * 섬나라 아일랜드 (DFS)
     * - 섬의 개수는?
     */

    static int[][] board = {
            {1, 1, 0, 0, 0, 1, 0},
            {0, 1, 1, 0, 1, 1, 0},
            {0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 1},
            {1, 1, 0, 1, 1, 0, 0},
            {1, 0, 0, 0, 1, 0, 0},
            {1, 0, 1, 0, 1, 0, 0}
    };

    //왼, 위, 오, 아래, 왼왼대각선, 왼오대각선, 왼아래대각선, 왼오른대각선
    static int[] dx = {0, -1, 0, 1, -1, -1, 1, 1};
    static int[] dy = {-1, 0, 1, 0, -1, 1, -1, 1};
    static int cnt = 0;


    public void DFS(int x, int y) {

        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && board[nx][ny] == 1) {
                board[nx][ny] = 0; //방문체크
                DFS(nx, ny);
            }

        }

    }

    public void solution() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    board[i][j] = 0;
                    cnt++;
                    DFS(i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        dfs_13 t = new dfs_13();

        t.solution();

        System.out.println("cnt = " + cnt);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                //System.out.print(board[i][j] + " ");
            }
            //System.out.println();
        }

    }
}
