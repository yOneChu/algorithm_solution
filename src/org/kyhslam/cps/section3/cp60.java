package org.kyhslam.cps.section3;


// 합이 같은 부분집합(DFS : 아마존 인터뷰)
public class cp60 {

    static int[] p = {0,1,3,5,6,7,10};
    static int[] path = new int[7];
    static int total = 0;
    static int[] ch = new int[4];
    static int L = 0;
    static int n = 0;
    //static int sum = 0;
    static boolean flag = false;

    public static void D(int level, int sum){

        if(level == (n+1)){
            if(sum == (total-sum)){
                flag = true;
            }
        }else{

            //더한다
            D((level+1), (sum+p[level]));

            //제외
            D((level+1), sum);
        }
    }

    //경로까지
    public static void D2(int level, int sum, int path[]){

        if(flag == true){
            return;
        }

        if(level == (n+1)){
            if(sum == (total-sum)){
                flag = true;
                for(int i=1; i < path.length; i++){
                    if(path[i] != 0){
                        System.out.println(path[i] + " ");
                    }
                }
            }
        }else{

            //더한다
            path[level] = p[level];
            D2((level+1), (sum+p[level]), path);

            //제외
            path[level] = 0;
            D2((level+1), sum, path);
        }
    }


    public static void main(String[] args) {

        n = 6;
        for(int i=1; i < p.length; i++){
            total += p[i];
        }

        System.out.println("total == " + total);
        System.out.println();

        //D(1, 0);
        D2(1, 0, path);

        System.out.println(flag);

        if(flag){
            System.out.println("YES");
        }



    }
}
