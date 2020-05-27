package org.kyhslam.CodeUp;

import java.util.Scanner;


//피보나치 메모제이션
public class p1916 {

    static long[] data = new long[200];


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();

        long result = fibo(target);

        System.out.println( result );
    }


    public static long fibo(int x){

        if(x <=2){
            return 1;
        }

        if(data[x] != 0){
            return data[x];
        }else{
            data[x] = fibo(x-1) + fibo(x-2);
            return data[x];
        }

    }


    public static void viewArray(int[] arr){
        for(int k=0; k < arr.length; k++){
            System.out.printf(arr[k] + " ");
        }
        System.out.println("");
    }
}
