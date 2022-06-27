package org.kyhslam.bakjun;

import java.util.Arrays;
import java.util.Scanner;

public class p1940 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        /*int N = 6;
        int M = 9;
        int[] arr = {2, 7, 4, 1, 5, 3};*/

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        Arrays.sort(arr);


        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        int count = 0; // 개수

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int right = i+1;

            while (right < arr.length) {
                int y = arr[right];
                int sum = x + y;

                if (sum == M) {
                    count++;
                }
                right++;
            }
        }

        System.out.println("count = " + count);

    }
}
