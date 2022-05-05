
package org.kyhslam.inflearnJava.twoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class array_01 {

    static int[] copyArr;



    public static void solution(int[] arr1, int[] arr2) {

        int p1 = 0;
        int p2 = 0;
        int copyIndex = 0;

        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] <= arr2[p2]) {
                copyArr[copyIndex++] = arr1[p1++];
            } else {
                copyArr[copyIndex++] = arr2[p2++];
            } 
        }

        while(p1 < arr1.length) {
            copyArr[copyIndex++] = arr1[p1++];
        }

        while (p2 < arr2.length) {
            copyArr[copyIndex++] = arr2[p2++];
        }

        System.out.println("Arrays.toString(copyArr) = " + Arrays.toString(copyArr));
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N =  sc.nextInt();
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }

        copyArr = new int[N+M];

        solution(arr1, arr2);
    }
}
