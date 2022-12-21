// git commit -m "code: Solve programmers 120830 양꼬치 (jaehyeok)"
class Solution {
    public int solution(int n, int k) {
        int answer = n*12000 + (k-n/10)*2000;
        return answer;
    }
}