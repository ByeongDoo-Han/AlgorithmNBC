// git commit -m "code: Solve programmers 120817 배열의평균값 (kyeonghwa)"
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;

        for(int i = 0; i < numbers.length; i++){
            answer += numbers[i];
        }

        return answer / numbers.length;
    }
}
