// git commit -m "code: Solve programmers 120814 피자나눠먹기1 (jaehyeok)"

class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n>0){
            answer ++;
            n -=7;
        }

        return answer;
    }
}