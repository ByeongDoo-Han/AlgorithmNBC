// git commit -m "code: Solve programmers 120583 중복된숫자개수 (kyeonghwa)"
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i=0; i<array.length; i++)
            if(array[i]==n) {
                answer++;
            }
        return answer;
    }
}