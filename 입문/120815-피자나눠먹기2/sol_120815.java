// git commit -m "code: Solve programmers 120815 피자나눠먹기2 (sol)"
class Solution {
    public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= 100; i++) {
            if((6*i) % n == 0)
                return i;
        }

        return answer;
    }
}