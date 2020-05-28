package org.kyhslam.CodeUp;


import java.util.Scanner;

//피보나치 수열
//분류 : 동적계획법
public class p2601 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();

        func(cnt);

    }



    public static void func(int cnt){

        int[] arr = new int[cnt+2];
        arr[1] = 1;
        arr[2] = 1;

        if(cnt == 1 || cnt == 2){
            System.out.println(arr[cnt]);
            return;
        }

        for(int i = 3; i <= cnt; i++){
            arr[i] = arr[i-2] + arr[i-1];

            if(cnt == i){
                System.out.println(i + " - " + arr[i]);
                return;
            }

        }

        //viewArray(arr);
    }


    public static void viewArray(int[] arr){
        for(int k=0; k < arr.length; k++){
            System.out.printf(arr[k] + " ");
        }
    }

}
