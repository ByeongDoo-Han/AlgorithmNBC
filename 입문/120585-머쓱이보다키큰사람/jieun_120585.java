class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int num : array){
            if(num - height > 0) answer++;
        }
        return answer;
    }
}