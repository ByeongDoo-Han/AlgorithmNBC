// git commit -m "code: Solve programmers 68935 3진법뒤집기 (sol)"
class Solution {
    public static int solution(int n) {
        int answer = 0;
        StringBuilder tmp = new StringBuilder();

        while(n > 0) {
            tmp.append((char)(n%3 + 48));
            n = n / 3;
        } //뒤집어진 3진법 수 구함

        for(int i = 0; i < tmp.length(); i++) {
            answer += Math.pow(3, tmp.length() - i - 1) * Character.getNumericValue(tmp.charAt(i));
        }

        return answer;
    }
}