// git commit -m "code: Solve programmers 120862 최댓값만들기2 (sol)"

class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                if(numbers[i] * numbers[j] > answer) {
                    answer = numbers[i] * numbers[j];
                }
            }
        }
        return answer;
    }
}