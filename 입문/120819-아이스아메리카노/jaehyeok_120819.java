// git commit -m "code: Solve programmers 120819 아이스아메리카노 (jaehyeok)"
class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = (int)money/5500;
        answer[1] = money -5500*answer[0];


        return answer;
    }
}