package org.kyhslam.CodeUp;

import java.util.Scanner;

public class p1912 {


    public static int factorial(int x){

        if(x == 1){
            return 1;
        }else{
            return x * factorial(x-1);
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        long start = System.currentTimeMillis();

        //factorial(target);
        System.out.println(factorial(target));

        long end = System.currentTimeMillis();

        System.out.println("time : "+ (start - end));


    }
}
