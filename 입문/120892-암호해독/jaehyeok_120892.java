// git commit -m "code: Solve programmers 120892 암호해독 (jaehyeok)"
class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        int count =0;
        char[] cipherToChar = cipher.toCharArray();
        for (char c :cipherToChar ) {
            ++count;
            if (count%code==0){
                answer.append(Character.toString(c));
            }
        }


        return answer.toString();
    }
}