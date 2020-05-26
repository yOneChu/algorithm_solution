package org.kyhslam.CodeUp;

import java.util.Scanner;

//거스름돈
public class p3301 {

    static int cnt = 0;
    static int[] pay = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
    static int m = 0; //몫
    static int r = 0; //나머지

    static int allSum = 0; //입력값

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        allSum = scan.nextInt();


        viewArray(pay);

        for(int i=0; i < pay.length; i++){
            gg(pay[i]);
        }


        System.out.println(cnt + " : " + cnt);

    }

    public static void gg(int pay) {

        int q = (allSum / pay);
        if(q > 0){
            cnt += q;
            allSum = (allSum % pay);
        }
    }

    public static void viewArray(int[] arr){
        for(int k=0; k < arr.length; k++){
            System.out.printf(arr[k] + " ");
        }
        System.out.println("");
    }
}
