package org.kyhslam.CodeUp;


import java.util.Scanner;

//3001 선현탐색(Linear Search)
public class p3001 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();

        int[] arr = new int[cnt];

        for(int i=0; i < cnt; i++){
            arr[i] = scan.nextInt();
        }

        viewArray(arr);


        int searchValue = scan.nextInt();
        int result = 0;
        for(int i=0; i < arr.length; i++){
            if(arr[i] == searchValue){
               //System.out.println(i+1);
                result  =   i+1;
            }
        }

        if(result == 0 ){
            System.out.println(-1);
        }else{
            System.out.println(result);
        }
    }


    public static void viewArray(int[] arr){
        for(int k=0; k < arr.length; k++){
            System.out.printf(arr[k] + " ");
        }
        System.out.println("");
    }
}
