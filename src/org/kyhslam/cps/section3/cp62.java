package org.kyhslam.algorithm;

import java.util.Arrays;

// 병합정렬
public class cp62 {

    public static int[] data = {0,7,6,3,1,5,2,4,8};
    public static int[] temp = new int[9];

    public static void divide(int lt, int rt) {
        int mid;
        if(lt < rt) {
            mid = (lt+rt)/2;
            divide(lt, mid);
            divide(mid+1, rt);

            int p1 = lt;
            int p2 = mid+1;
            int index = lt; // 집어넣으 배열 index

            while(p1 <= mid && p2 <= rt){
                if(data[p1] < data[p2]) temp[index++] =data[p1++];
                else temp[index++] = data[p2++];
            }

            while(p1 <= mid) temp[index++] = data[p1++];
            while(p2 <= rt) temp[index++] = data[p2++];

            for(int i=lt; i <= rt; i++) {
                data[i] = temp[i];
            }

        }

        //System.out.println(Arrays.toString(data));
        //System.out.println(Arrays.toString(temp));


    }


    public static void main(String[] args) {

        // 7 6 3 1 5 2 4 8
        //data = {7,6,3,1,5,2,4,8};

        int n = data.length;
        System.out.println(n);
        divide(0, n-1);

        System.out.println(Arrays.toString(data));


    }
}
