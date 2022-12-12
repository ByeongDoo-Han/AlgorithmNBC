// git commit -m "code: Solve programmers 120831 짝수의합 (jaehyeok)"
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i =0;i<=n;i+=2){
            answer+= i;
        }
        return answer;
    }
}