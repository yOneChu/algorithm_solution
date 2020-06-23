package org.kyhslam.cps;

import java.util.Scanner;

//멀티 태스킹
public class cp46 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();

        int stop = 5;

        int[] p = new int[4];
        p[1] = 1;
        p[2] = 2;
        p[3] = 3;

        int pos = 0;
        int count = 0;
        view1(p);
        while(true){

            if(count == stop){
                break;
            }

            //pos++;

            if(pos > 3){
                pos = 1;
            }

            if(p[pos] != 0){
                p[pos] = p[pos] -1;
                count++;
            }

            pos++;
        } // end while


        System.out.println();
        view1(p);

        for(int i=0; i < p.length; i++){
            if(p[i] != 0){
                System.out.println(i);
            }
        }
    }

    public static void view1(int[] arr){
        for(int k=0; k < arr.length; k++){
            System.out.printf(arr[k] + " ");
        }
        System.out.println("");
    }
}
