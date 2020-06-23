package org.kyhslam.cps;


// 봉우리
public class cp47 {

    public static void main(String[] args) {

        //int[][] array = new int[7][7];
        int[][] p = {
                {0,0,0,0,0,0,0},
                {0,5,3,7,2,3,0},
                {0,3,7,1,6,1,0},
                {0,7,2,5,3,4,0},
                {0,4,3,6,4,1,0},
                {0,8,7,3,5,2,0},
                {0,0,0,0,0,0,0}
        };

        //view2(array);
        System.out.println();

        int count = 0;

        for(int x=1; x < 6; x++){
            for(int y=1; y < 6; y++){

                int target = p[x][y];

                if(target > p[x][y-1] && target > p[x][y+1] && target > p[x-1][y] && target > p[x+1][y] ){
                    count++;
                }
            }
        }

        System.out.println(count);
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
