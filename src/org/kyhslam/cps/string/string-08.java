package org.kyhslam.inflearnJava.string;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class cp08 {

    public static void solution(String str) {

        String answer = "YES";
        String[] a = str.split(" ");

        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));

        Deque<String> deque = new LinkedList<>(); // Deque 선언

        for (String s : a) {
            char[] ch = s.toLowerCase().toCharArray();
            System.out.println("Arrays.toString(ch) = " + Arrays.toString(ch));

            for (char c : ch) {
                if(Character.isAlphabetic(c)){
                    deque.add(String.valueOf(c));
                }
            }
        }

        System.out.println("deque = " + deque);
        
        int left = 0;
        int right = deque.size()-1;

        while (!deque.isEmpty()) {

            String x = deque.pollFirst(); // 꺼내서 제거
            String y = deque.pollLast(); // 꺼내서 제거

            System.out.println(x + " -- " + y);

            if ( !x.equals(y) ) {
                answer = "NO";
                break;
            }
        }
        System.out.println("answer = " + answer);
        
    }
    
    public static void main(String[] args) {
        String a = "found7, time: study; Yduts; emit, 7Dnuof";
        
        solution(a);
    }
}
