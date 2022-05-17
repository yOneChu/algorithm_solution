package org.kyhslam.inflearnJava.string;

public class cp04 {


    public static void solution(String str) {

        char[] chr = str.toCharArray();
        for (int i = chr.length-1; i >= 0; i--) {
            System.out.println("chr[i] = " + chr[i]);
        }

    }

    public static void solution2(String str) {

        //문자열 뒤집기
        String tmp = new StringBuilder(str).reverse().toString();
        System.out.println("tmp = " + tmp);

    }

    public static void main(String[] args) {

        String a = "good";


        solution(a);
        solution2(a);
    }
}
