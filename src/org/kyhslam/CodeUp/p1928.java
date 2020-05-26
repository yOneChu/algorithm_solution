package org.kyhslam.CodeUp;

import java.util.Scanner;

public class p1928 {


    public static void mod(int x) {
        System.out.println(x);

        if(x == 1){
            return;
        }else if(x%2 == 0){
            //짝수
            mod(x/2);
        }else{
            //홀수
            mod((3*x) +1 );
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();
        mod(target);
    }
}
