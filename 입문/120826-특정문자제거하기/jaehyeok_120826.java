// git commit -m "code: Solve programmers 120826 특정문자제거하기 (jaehyeok)"
class Solution {
    public String solution(String my_string, String letter) {
        String answer = my_string.replace(letter,"");
        return answer;
    }
}