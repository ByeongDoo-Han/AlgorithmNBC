// git commit -m "code: Solve programmers 86051 없는숫자더하기 (kyeonghwa)"
class Solution {
    public int solution(int[] numbers) {
        int answer = 45;

        for(int i : numbers) {
            answer -= i;
        }

        return answer;
    }
}