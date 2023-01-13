// git commit -m "code: Solve programmers 120846 합성수찾기 (sol)"
class Solution {
    public static int solution(int n) {
        int answer = 0;
        int count;
        for(int i = 4; i <= n; i++) {
            count = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                    if(count > 2) {
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}