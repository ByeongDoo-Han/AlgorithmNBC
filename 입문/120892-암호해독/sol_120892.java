// git commit -m "code: Solve programmers 120892 μνΈν΄λ (sol)"
class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();

        for(int i = code - 1; i < cipher.length(); i += code){
            answer.append(cipher.charAt(i));
        }
        //String answer = "";

        //return answer;
        return answer.toString();
    }
}