// git commit -m "code: Solve programmers 120892 μνΈν΄λ (jaehyeok)"
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