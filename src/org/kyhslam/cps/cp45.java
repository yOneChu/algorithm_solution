package org.kyhslam.cps;


//공주 구하기
public class cp45 {

    public static void main(String[] args) {
        int n = 8;
        int k = 3;

        int[] p = new int[9];

        int pos = 0;
        int count = 0;
        int cnt = 0; // 제외된 사람의 수
        //view1(p);
        //view1(p);

        while(true){
            pos++;
            //System.out.println(pos);
            if(cnt == (n-1)){
                break;
            }

            if(pos > 8){
                pos = 1;
            }

            if(p[pos] == 0){
                count++;
                if(count == k){
                    p[pos] = 1;
                    count = 0;
                    cnt++;
                }
            }
        }

        view1(p);
        System.out.println();
        for(int i=1; i < p.length; i++){
            if(p[i] ==  0){
                System.out.println(i);
            }

        }
    }

    public static void view1(int[] arr){
        for(int k=0; k < arr.length; k++){
            System.out.printf(arr[k] + " ");
        }
        System.out.println("");
    }

    public static void view2(int [][] arr){
        for(int i=0; i < arr.length; i++){

            for(int j=0; j < arr[i].length; j++){
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
