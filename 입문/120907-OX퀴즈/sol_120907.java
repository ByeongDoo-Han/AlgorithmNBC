// git commit -m "code: Solve programmers 120907 OX퀴즈 (sol)"

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] tmp;
        int ans = 0;

        for(int i = 0; i < quiz.length; i++) {
            tmp = quiz[i].split(" ");
            if(tmp[1].equals("+")) {
                ans = Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[2]);
                if(ans == Integer.parseInt(tmp[4])) {
                    answer[i] = "O";
                }
                else answer[i] = "X";
            }
            else {
                ans = Integer.parseInt(tmp[0]) - Integer.parseInt(tmp[2]);
                if(ans == Integer.parseInt(tmp[4])) {
                    answer[i] = "O";
                }
                else answer[i] = "X";
            }
        }
        return answer;
    }
}