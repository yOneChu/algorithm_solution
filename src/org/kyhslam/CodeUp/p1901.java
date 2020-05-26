package org.kyhslam.CodeUp;

import java.util.Scanner;

public class p1901 {

    static int cnt = 0;


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        cnt = scan.nextInt();
        fs(1);
    }

    public static void fs(int val){
        if(val == cnt+1){
            return;
        }

        System.out.println(val);

        val =   val+1;
        fs(val);
    }
}
