// git commit -m "code: Solve programmers 120831 짝수의합 (byeongdoo)"

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i < n + 1; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }
}