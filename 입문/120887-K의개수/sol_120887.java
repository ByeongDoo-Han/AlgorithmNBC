// git commit -m "code: Solve programmers 120887 K의개수 (sol)"

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int quotient = 0;
        int remainder = 0;
        for(int x = i; x <= j; x++) {
            quotient = x;
            while(quotient > 0) {
                remainder = quotient % 10;
                if(remainder == k)
                    answer++;
                quotient = quotient / 10;
            }
        }
        return answer;
    }
}
