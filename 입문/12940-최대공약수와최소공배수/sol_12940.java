// git commit -m "code: Solve programmers 12940 최대공약수와최소공배수 (sol)"

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int small;
        if(n > m) {
            small = m;

        } else {
            small = n;
        }
        for(int i = 1; i <= small; i++) {
            if(n % i == 0 && m % i == 0) {
                answer[0] = i;
            }
        }

        answer[1] = n * m / answer[0]; // 최소공배수 = 두 수를 곱한 값 / 최대공약수

        return answer;
    }
}