// git commit -m "code: Solve programmers 120806 두수의나눗셈 (kyeonghwa)"
class Solution {
    public int solution(int num1, int num2) {
        double answer = (double) num1 / num2 * 1000;
        return (int) answer;
    }
}