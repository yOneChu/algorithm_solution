package org.kyhslam.cps.section3;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

// 최소 힙 (priority_queue : 우선순위 큐)
public class cp74 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        while(true){
            int a = sc.nextInt();
            if(a == -1) break;
            if(a == 0){
                if(queue.isEmpty()){
                    System.out.println("-1\n");
                }else{
                    System.out.println("top = " + -queue.poll());
                }
            }
            else{
                queue.add(-a);
            }
        }// end while

    }
}
