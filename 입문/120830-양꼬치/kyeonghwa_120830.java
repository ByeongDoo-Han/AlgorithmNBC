// git commit -m "code: Solve programmers 120830 양꼬치 (kyeonghwa)"
class Solution {
    public int solution(int n, int k) {
        int answer = 12000*n + 2000*(k-n/10);
        return answer;
    }
}