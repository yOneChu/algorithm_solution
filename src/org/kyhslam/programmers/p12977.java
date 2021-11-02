package org.kyhslam.programmers;


import java.util.Arrays;

//Summer/Winter Coding > 소수만들기
public class p12977 {

    public static int cnt = 0;

    public static void main(String[] args) {

        /*
        [1,2,3,4]	1
        [1,2,7,6,4]	4
        */
        int[] arr = {1,2,3,4};
        //int[] arr = {1,2,7,6,4};

        int answer = 0;

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    System.out.println(arr[i] + " + " + arr[j] + " + " + arr[k] + " = " + sum);
                    answer += isCheck(sum);
                }
            }
        }

        System.out.println("cnt = " + cnt);
        System.out.println("answer = " + answer);
    }

    public static int isCheck(int num) {

        boolean flag = true;
        for(int i=2; i < num; i++) {
            if(num%i == 0 ) {
                flag = false;
                System.out.println("false = " + num);
                return 0;
            }
        }
        System.out.println("true = " + num);
        return 1;
    }
}
