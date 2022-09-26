package org.kyhslam.bakjun;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class p17298 {

    public static void main(String[] args) throws IOException {

        // 4
        // Q: 3 5 2 7
        // A: 5 7 7 -1
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);
        //int N = sc.nextInt();
        int N = Integer.parseInt(bf.readLine());

        int[] A = new int[N];
        int[] ans = new int[N];

        String[] str = bf.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(str[i]);
        }

        Stack<Integer> myStack = new Stack<>();
        myStack.push(0);

        for (int i = 1; i < A.length; i++) {

            while( !myStack.isEmpty() && A[i] > A[myStack.peek()]) {
                ans[myStack.pop()] = A[i];
            }

            myStack.push(i);
        }

        while( !myStack.isEmpty() ) {
            ans[myStack.pop()] = -1;
        }


        //출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i < N; i++){
            bw.write(ans[i] + " ");
        }
        bw.write("\n");
        bw.close();

    }
}
