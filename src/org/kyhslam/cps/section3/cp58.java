package org.kyhslam.cps.section3;

import java.util.ArrayList;

public class cp58 {

    public static ArrayList<Integer>[] a;

    //전위순회
    public static void DFS(int x) {

        if(x > 7){
            return;
        }else{
            System.out.println(x);
            DFS(x*2);
            DFS((x*2) +1);
        }

    }

    //중위순회
    public static void DFS2(int x) {
        if(x > 7){
            return;
        }else{
            DFS2(x*2);
            System.out.println(x);
            DFS2((x*2) +1);
        }
    }

    //후위순회
    public static void DFS3(int x) {
        if(x > 7){
            return;
        }else{
            DFS3(x*2);
            DFS3((x*2) +1);
            System.out.println(x);
        }
    }


    public static void main(String[] args) {

        int nodeCount = 7;


        for(int i=1; i<= nodeCount; i++){
            //a[i] = new ArrayList<Integer>();
        }

        DFS3(1);
    }
}
