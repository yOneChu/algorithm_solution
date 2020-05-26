package org.kyhslam.CodeUp;

import java.util.Scanner;

public class p1905 {

    static int[] data;
    //static int sum = 2;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();

        data = new int[target+1];

        int result = fibo(target);

        System.out.println( result );

    }

    // 1 1 2 3 5 8 13 21 34 ...
    public static int fibo(int x){

        if(x <=2){
            return 1;
        }

        if(data[x] != 0){
            return data[x];
        }else{
            data[x] = fibo(x-1) + fibo(x-2);
            //sum += data[x];

            return data[x];
        }


    }
}
