package org.kyhslam.inflearnJava.string;

import java.util.Arrays;
import java.util.Scanner;

public class cp02 {

    public static void solution(String str) {

        String answer = "";
        char[] ch = str.toCharArray();

        System.out.println("Arrays.toString(c) = " + Arrays.toString(ch));
        for (char c : ch) {
            System.out.println("c = " + c);
            if(Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);
            }
        }


        System.out.println("answer = " + answer);
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String N = "StuDY";

        solution(N);
        
    }
}
