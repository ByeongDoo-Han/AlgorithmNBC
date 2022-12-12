// git commit -m "code: Solve programmers 120907 OX퀴즈 (byeongdoo)"

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] string = quiz[i].split(" ");
            String firstNum = string[0];
            String m = string[1];
            String secondNum = string[2];
            String result = string[4];
            Integer f = Integer.parseInt(firstNum);
            Integer s = Integer.parseInt(secondNum);
            Integer r = Integer.parseInt(result);
            if (m.equals('-')) {
                if ((f - s) == r) {
                    answer[i] = "O";
                    continue;
                } else {
                    answer[i] = "X";
                    continue;
                }
            } else {
                if ((f + s) == r) {
                    answer[i] = "O";
                    continue;
                } else {
                    answer[i] = "X";
                    continue;
                }
            }
        }
        return answer;
    }
}