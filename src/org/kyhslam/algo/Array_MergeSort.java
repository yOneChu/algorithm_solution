package org.kyhslam.practice;


import java.util.Scanner;

// 배열 병합
public class Array_MergeSort {


    static void merge(int[] a, int aLength, int[] b, int bLength, int[] c) {
        int pa = 0;
        int pb = 0;
        int pc = 0;

        while(pa < aLength && pb < bLength){
            c[pc++] = (a[pa] < b[pb]) ? a[pa++] : b[pb++];
        }

        while(pa < aLength) c[pc++] = a[pa++];

        while(pb < bLength) c[pc++] = b[pb++];
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int[] a= {2,4,6,8,11,13};
        int[] b= {1,2,3,4,9,16,21};
        int[] c = new int[13];

        System.out.println("두 배열의 병합");

        merge(a, a.length, b, b.length, c);

        for(int i=0; i < c.length; i++) {
            System.out.print(c[i] +" ");
        }


    }
}
