package org.kyhslam.inflearnJava.string;

import java.util.Arrays;

public class cp05 {

    public static void solution(String str) {

        String answer = "";
        System.out.println("str = " + str);

        char[] chr = str.toCharArray();

        int left = 0;
        int right = str.length()-1;

        while (left < right) {

            if (Character.isAlphabetic(chr[left]) || Character.isAlphabetic(chr[right])) {
                char temp = chr[left];
                chr[left] = chr[right];
                chr[right] = temp;
            }
            left++;
            right--;
        }

        for (char c : chr) {
            answer += c;
        }

        System.out.println("Arrays.toString(chr) = " + Arrays.toString(chr));
        System.out.println("answer = " + answer);
    }


    public static void main(String[] args) {

        String str = "a#b!GE*T@S";
        solution(str);
    }
}
