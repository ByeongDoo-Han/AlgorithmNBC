// git commit -m "code: Solve programmers 120822 문자열뒤집기 (kyeonghwa)"
class Solution {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer(my_string);
        String answer = sb.reverse().toString();
        return answer;
    }
}