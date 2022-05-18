package org.kyhslam.inflearnJava.string;

public class cp07 {

    public static void solution(String str) {

        String reverStr = new StringBuilder(str).reverse().toString();

        if (str.toLowerCase().equals(reverStr.toLowerCase())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


    public static void main(String[] args) {
        String a = "gooG";
        solution(a);
    }
}
