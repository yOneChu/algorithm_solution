package org.kyhslam.inflearnJava.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class arr_02 {

    public static ArrayList answer = new ArrayList();

    public static void solution(int[] arr01, int[] arr02) {
 
        int p1 = 0;
        int p2 = 0;

        Arrays.sort(arr01);
        Arrays.sort(arr02);


        while (p1 < arr01.length && p2 < arr02.length) {
            if (arr01[p1] == arr02[p2]) {
                answer.add(arr01[p1]);
                p1++;
                p2++;
            } else if (arr01[p1] > arr02[p2]) {
                p2++;
            } else {
                p1++;
            }
        }

        System.out.println("answer = " + answer);
        
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr01 = new int[N];
        for (int i = 0; i < N; i++) {
            arr01[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] arr02 = new int[M];
        for (int i = 0; i < M; i++) {
            arr02[i] = sc.nextInt();
        }

        System.out.println("Arrays.toString(arr01) = " + Arrays.toString(arr01));
        System.out.println("Arrays.toString(arr02) = " + Arrays.toString(arr02));

        solution(arr01, arr02);
    }
}
