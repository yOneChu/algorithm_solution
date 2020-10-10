package org.kyhslam.cps;


import java.util.ArrayList;
import java.util.Collections;

// 이분검색 (먼저 정렬되어 있어야 된다.)
public class cp42 {

    static int[] a = { 23,87,65,12,57,32,99,81};
    static int[] aa = {12,23,32,57,65,81,87,99};


    public static void main(String[] args) {

        int n = aa.length;
        int key = 32;

        int lt = 0;
        int rt = 0;
        int mid = 0;


        //이분검색
        rt = n-1;
        while (lt <= rt) {
            mid = (lt + rt) / 2;
            if(aa[mid] == key) {
                System.out.println( (mid+1) + " 번째" );
                break;
            }
            else if(aa[mid] > key){
                rt = (mid-1);
            }
            else{
                lt = mid+1;
            }
        }

        System.out.println("========");

        for(int i=0; i < aa.length; i++){
            //System.out.println(aa[i] + " ");
        }


    }
}
