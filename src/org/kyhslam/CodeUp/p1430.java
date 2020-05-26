package org.kyhslam.CodeUp;

import java.util.Scanner;

public class p1430 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //String val	=	""; // "abC Def gh";

        //val	=	scan.nextLine();
        int cnt = scan.nextInt();
        int[] arr1 = new int[cnt]; //숫자

        int index = 0;
        cnt = 5;
        while(cnt > 0)
        {
            arr1[index++] = scan.nextInt();
            cnt--;
        }
        viewArray(arr1);

        int cnt2 = scan.nextInt();
        int[] pArr = new int[cnt2];

        for(int i=0; i < cnt2; i++){
            pArr[i] = scan.nextInt();
        }
        viewArray(pArr);

        for(int i=0; i < pArr.length; i++){
            boolean flag = false;
            for(int j=0; j < arr1.length; j++){
                if(pArr[i] == arr1[j]) {
                    flag = true;
                    //System.out.println(pArr[i] + " -- " + arr1[j]);
                }
            }

            if(flag == true){
                System.out.printf(1 + " ");
            }else{
                System.out.printf(0 + " ");
            }
        }
    }


    public static void viewArray(int[] arr){
        for(int k=0; k < arr.length; k++){
            System.out.printf(arr[k] + " ");
        }
        System.out.println("");
    }




}