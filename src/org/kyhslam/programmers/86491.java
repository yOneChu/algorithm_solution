class Solution {
    public int solution(int[][] sizes) {
        int wMax = 0;
        int hMax = 0;
        int answer = 0;
        
        for(int i=0; i < sizes.length; i++){
            int x = Math.max(sizes[i][0], sizes[i][1]);
            int y = Math.min(sizes[i][0], sizes[i][1]);

            wMax = Math.max(wMax, x);
            hMax = Math.max(hMax, y);
        }
        answer = wMax * hMax;
        return answer;
    }
}
