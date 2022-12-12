// git commit -m "code: Solve programmers 120907 OX퀴즈 (taewoong)"
class Solution {
    public String[] solution(String[] quiz) {
        String[] answerArr = new String[quiz.length];
        // 정답 배열 만들기
        for(int i =0; i<quiz.length; i++){
            String[] splitArr = quiz[i].split(" ");
            //공백으로 나누기
            if (splitArr[1].equals("+")){
                //+연산자일 경우
                int compare = Integer.parseInt(splitArr[0]) + Integer.parseInt(splitArr[2]);
                if (compare == Integer.parseInt(splitArr[4]))
                    answerArr[i] = "O";
                else answerArr[i] ="X";
            }
            else if(splitArr[1].equals("-")){
                //-연산자일 경우
                int compare = Integer.parseInt(splitArr[0]) - Integer.parseInt(splitArr[2]);
                if (compare == Integer.parseInt(splitArr[4]))
                    answerArr[i] = "O";
                else answerArr[i] ="X";
            }
        }
        return answerArr;
    }
}