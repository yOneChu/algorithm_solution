package org.kyhslam.inflearnJava.string;

import java.util.Arrays;

public class cp03 {

    public static void solution(String str) {

        String answer = "";
        String[] arr = str.trim().split(" ");

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        for (String c : arr) {
            System.out.println("c = " + c);

            if (answer.length() < c.length()) {
                answer = c;
            }
        }
        
        System.out.println("answer = " + answer);
    }


    public static void main(String[] args) {
        String str = "It is time to study";
        solution(str);
    }
}
