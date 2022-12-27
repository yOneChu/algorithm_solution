import java.util.Scanner;

public class p04 {

    private static int N, M=0;

    private static void DFS(int level, int[] arr) {

        if(level == M) {
            for (int i = 0; i < arr.length; i++) {
                System.out.printf(arr[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= N; i++) {
                arr[level] = i;
                DFS(level+1, arr);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        int[] arr = new int[M];
        DFS(0, arr);


    }
}
