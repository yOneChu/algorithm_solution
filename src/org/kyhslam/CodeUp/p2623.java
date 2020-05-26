package org.kyhslam.CodeUp;

import java.util.Scanner;

public class p2623 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        if(b > a){
            result = f(b,a);
        }else{
            result = f(a,b);
        }

        System.out.println(result);


    }

    static public int f(int x,int y){

        if(y == 0){
            return x;
        }else{
            return f(y, x%y);
        }
    }
}
