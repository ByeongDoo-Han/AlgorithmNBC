// git commit -m "code: Solve programmers 12090 OX퀴즈 (jaehyeok)"

import java.util.ArrayList;

public class jaehyeok_12090 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        System.out.println(solution.solution(quiz));
        //..! 실행이 안된다 ..!
    }
}
class Solution {
    public ArrayList<String> solution(String[] quiz) {
        ArrayList<String> OXList = new ArrayList<>();

        for(int i=0;i<quiz.length;i++ ){
            String[] new_quiz=quiz[i].split(" ");
            int fistValue = Integer.parseInt(new_quiz[0]);
            int secondValue = Integer.parseInt(new_quiz[2]);
            int resultValue = Integer.parseInt(new_quiz[4]);

            int result;
            if(new_quiz[1].equals("+")){
                result = fistValue + secondValue;
            }else {
                result = fistValue - secondValue;
            }

            if(result == resultValue){
                OXList.add("O");
            }else {
                OXList.add("X");
            }
        }
        return OXList;
    }
}