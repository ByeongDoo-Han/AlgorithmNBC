// git commit -m "code: Solve programmers 120892 μνΈν΄λ (taewoong)"

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] cipherArr = cipher.split("");

        for(int i =0; i<cipherArr.length; i++){
            if ((i+1) % code == 0) {
                answer += cipherArr[i];
            }
        }
        return answer;
    }
}


