// git commit -m "code: Solve programmers 120815 피자나눠먹기2 (jaehyeok)"
class Solution {
    public int solution(int n) {
        int answer=0;
        for(int i=1;i<7;i++){
            if((n*i)%6==0){
                answer = (n*i)/6;
                break;
            }
        }
        return answer;
    }
}