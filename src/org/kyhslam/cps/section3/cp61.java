package org.kyhslam.algorithm;

// 특정 수 만들기
public class cp61 {

    public static int n = 4;
    public static int target = 12;
    public static int cnt = 0;

    public static void dfs(int level, int[] arr, int sum) {

        if(level == (n+1)){
            if(sum == target){
                cnt++;
            }
        }else{

            //더하기
            dfs(level+1, arr, (sum+arr[level]));

            //제외
            dfs(level+1, arr, (sum));

            //빼기
            dfs(level+1, arr, (sum - arr[level]));
        }
    }

    public static void main(String[] args) {

        //입력 : 2,4,6,8
        //결과 4

        int [] arr = {0,2,4,6,8};

        dfs(1, arr, 0);
        System.out.println(cnt);

    }
}

