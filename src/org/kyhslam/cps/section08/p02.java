
public class p02 {

    private static int C, N = 0;
    private static int[] arr;
    private static int maxVal = 0;
    private static void DFS(int level, int sum, int[] arr) {

        if (level == N) {
            if(C > sum) {
                maxVal = Math.max(sum, maxVal);
            }
        } else {
            DFS(level + 1, sum + arr[level], arr);
            DFS(level + 1, sum, arr);
        }
    }


    public static void main(String[] args) {
        // 259 5
        // 81 58 42 33 61
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt();
        N = sc.nextInt();
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("C = " + C);
        System.out.println("N = " + N);
        System.out.println(Arrays.toString(arr));

        DFS(0, 0, arr);
        System.out.println("maxVal=" + maxVal);


    }
}
