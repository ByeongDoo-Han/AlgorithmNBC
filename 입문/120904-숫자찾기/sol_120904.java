// git commit -m "code: Solve programmers 120904 숫자찾기 (sol)"

class Solution {
    public static int solution(int num, int k) {
        int answer = -1;
        String tmp = String.valueOf(num);
        for(int i = 0; i < tmp.length(); i++) {
            if(tmp.charAt(i) == (char)(k+48))
                return i+1;
        }
        return answer;
    }
}