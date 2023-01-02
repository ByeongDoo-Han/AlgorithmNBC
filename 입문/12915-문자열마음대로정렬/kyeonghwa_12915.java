// git commit -m "code: Solve programmers 12915 문자열마음대로정렬 (kyeonghwa)"
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=0; i<=n; i++){
            if (i % 2 == 0){
                answer += i;
            }
        }
        return answer;
    }
}