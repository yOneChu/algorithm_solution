package org.kyhslam.programmers.kakao2021;

import java.util.Arrays;

public class p01 {


    public static boolean isValid(char c) {
        if(Character.isLetterOrDigit(c)) return true;
        if(c == '-' || c == '_' || c == '.') return true;
        return false;
    }

    public static void main(String[] args) {

        String new_id = "...!@BaT#*..y.abcdefghijklm";
        StringBuilder answer = new StringBuilder();

        boolean lastDot = false;
        for (char ch : new_id.toCharArray()) {
            if(isValid(ch) == false) continue;
            if('.' == ch) {
                if(answer.length() == 0 || lastDot) continue;
                lastDot = true;
            }else{
                lastDot = false;
            }

            ch = Character.toLowerCase(ch);
            answer.append(ch);
        }



        // 15자리수 맞추기
        // new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한
        // 나머지 문자들을 모두 제거합니다.
        if(answer.length() >= 16){
            answer.setLength(15);
        }

        //new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if(answer.length() == 0) {
            answer.append('a');
        }

        // 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
        if(answer.charAt(answer.length()-1) == '.') {
            answer.deleteCharAt(answer.length()-1);
        }


        //new_id의 길이가 2자 이하라면, new_id의 마지막 문자를
        //new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if(answer.length() <= 2) {
            char a = answer.charAt(answer.length()-1);
            while (answer.length() < 3) {
                answer.append(a);
            }
        }

        System.out.println("result :: " + answer.toString());
    }
}
