package org.kyhslam.CodeUp;


import java.util.Scanner;

//최대공배수, 최소공약수
public class p4506 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = new int[2];

        for(int i=0; i < 2; i++){
            arr[i] = scan.nextInt();
        }

        int val = 24 % 18;
        System.out.println(val);
        gdc(arr[0], arr[1]);

    }

    public static int gdc(int a, int b){

        if(b == 0){
            return a;
        }else{
            int val = a % b;
            //System.out.println(val);
            gdc(b, (a%b));
        }

        return 0;
    }
}
