package org.kyhslam.algorithm;

import java.util.*;

// 최대 수입 스케줄
public class cp75 {

    private static int maxDay = 0;
    private static int totalRevenue = 0;

    public static class Node {
        int money;
        int when;

        public Node(int money, int when) {
            this.money = money;
            this.when = when;
        }
    }

    public static class ListMaxSort implements Comparator<Node> {

        @Override
        public int compare(Node o1, Node o2) {
            int when1 = o1.when;
            int when2 = o2.when;
            return when1 <= when2 ? 1 : -1; // 큰 순서로 정렬
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Node> list = new ArrayList<>();
        
        //큰 순서대로 정렬
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=1; i <= N; i++) {
            int m = sc.nextInt();
            int w = sc.nextInt();
            list.add(new Node(m, w));

            if(w > maxDay) maxDay = w;
        }

        // 정렬
        // list에 넣은 값 큰 날짜 순서로 저장
        Collections.sort(list, new ListMaxSort());


        System.out.println();
        System.out.println(list);

        for (Node n : list) {
            System.out.println(n.money + " : " + n.when);
        }


        //pop으로 꺼내야 내가 정한 순서대로 출력된다.
        /*while(!pQ.isEmpty()) {
            Node a = pQ.poll();
            System.out.println(a.money + " : " + a.when);
        }*/
        
        for(int i=maxDay; i >=1 ; i--) {
            for(int j=0; j < list.size(); j++) {
                Node tempNode = list.get(j);
                if(i == tempNode.when) {
                    pQ.add(tempNode.money);
                }
            }

            System.out.println(i + "-----");
                System.out.println(pQ);
            System.out.println("--------");

            //Queue에서 젤 큰 값 꺼내서 합한다
            if(!pQ.isEmpty()) {
                int tt = pQ.poll(); //poll or pop으로 꺼내야 내가 정한 순서대로 출력된다.
                System.out.println("tt == " + tt);
                totalRevenue += tt;
            }
        }

        System.out.println("totalRevenue === " + totalRevenue);
    }
}

/*
6
50 2
20 1
40 2
60 3
30 3
30 1
*/
