package org.kyhslam.cps.section3;


import java.util.*;

// 최대힙 (priority_queue : 우선순위 큐)
public class cp73 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Queue<Integer> queue = new LinkedList<>();

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        while(true){

            int a = sc.nextInt();

            if(a == -1) break;

            if(a == 0){
                if(queue.isEmpty()){
                    System.out.println("-1\n");
                }else{
                    System.out.println("top = " + queue.poll());
                    //queue.
                }
            }
            else{
                queue.add(a);
            }
        }
        //return 0;

    }


}
