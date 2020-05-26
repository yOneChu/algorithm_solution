package org.kyhslam.CodeUp;

import java.util.Scanner;

public class p1452 {

    static int[] sorted ; //= new int[1]

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();

        int[] arr = new int[cnt];
        sorted  =   new int[cnt];


        for(int i=0; i < cnt; i++){
            arr[i] = scan.nextInt();
        }

        viewArray(arr);
        mergeSort(arr, 0, arr.length-1);

        viewArray(arr);

        /*for(int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }*/

    }

    public static void mergeSort(int a[], int start, int end){
        if(start < end){
            int middle = (start + end) / 2;
            mergeSort(a, start, middle);
            mergeSort(a, middle+1, end);
            merge(a, start, middle, end);
        }

    }

    public static void merge(int[] a, int start, int middle, int end) {

        int i = start;
        int j = middle + 1;
        int k = start;

        while(i <= middle && j <= end){
            if(a[i] <= a[j]){
                sorted[k] = a[i];
                i++;
            }else{
                sorted[k] = a[j];
                j++;
            }
            k++;
        }

        if(i > middle){
            for(int t=j; t <= end; t++){
                sorted[k] = a[t];
                k++;
            }
        }else{
            for(int t=i; t <= middle; t++){
                sorted[k] = a[t];
                k++;
            }
        }

       for(int t = start; t <= end; t++){
           a[t] = sorted[t];
       }

    }


    public static void viewArray(int[] arr){
        for(int k=0; k < arr.length; k++){
            System.out.printf(arr[k] + " ");
        }
        System.out.println("");
    }
}
