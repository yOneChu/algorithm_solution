package org.kyhslam.CodeUp;

import java.util.Scanner;

public class p1855 {

    static int data[] = new int[100];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        //viewArray(f);
        System.out.println(fibo(x));

    }


    static public int fibo(int x){

        if(x <= 2){
            return 1;
        }

        if(data[x] != 0 ){
            return data[x];
        }else{
            data[x] = fibo(x-2) + fibo(x-1);
            return data[x];
        }

    }


}
