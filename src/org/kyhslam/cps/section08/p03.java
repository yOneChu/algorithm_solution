import java.util.Scanner;

public class p03 {

    private static int N = 0;
    private static int M = 0; //제한시간
    private static int[] jums;
    private static int[] times;
    private static int maxVal = 0;

    private static void DFS(int level, int totalSum, int totalTime) {

        if (level == N) {
            if (M >= totalTime) {
                maxVal = Math.max(totalSum, maxVal);
            }
        } else {
            DFS(level + 1, totalSum + jums[level], totalTime + times[level]);
            DFS(level + 1, totalSum, totalTime);
        }
    }

    //최대점수 구하기(DFS)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); //문제 개수
        M = sc.nextInt(); //제한시간

        jums = new int[N];
        times = new int[N];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt(); //점수
            int y = sc.nextInt(); //시간
            jums[i] = x;
            times[i] = y;
        }

        DFS(0, 0, 0);
        System.out.println("maxVal=" + maxVal);
    }
}
