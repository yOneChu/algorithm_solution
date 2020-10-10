package org.kyhslam.cps.section3;


import java.util.ArrayList;

// 재귀(2진수 출력)
public class cp57 {

    public static ArrayList<Integer> aa = new ArrayList<>();

    public static void D(int x) {

        if(x == 0){
            return;
        }else{
            //System.out.print((x%2) + " ");
            D(x/2);
            System.out.print((x%2) + " ");
        }

    }

    public static void main(String[] args) {

        int n = 11;
        D(n);
    }
}
