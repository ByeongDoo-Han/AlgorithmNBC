// git commit -m "code: Solve programmers 12921 소수찾기 (sol)"
class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i = 2; i < n + 1; i++) {
            for(int j = i; j < n + 1; j = j + i) {
                arr[j]++;
            }
        }
        for(int i = 2; i < arr.length; i++) {
            if (arr[i] == 1){
                answer++;
            }
        }
        return answer;
    }
}