// git commit -m "code: Solve programmers 120809 배열두배만들기 (jaehyeok)"

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {

        int[] answer = Arrays.stream(numbers).map(i->i*2).toArray();

        return answer;
    }
}