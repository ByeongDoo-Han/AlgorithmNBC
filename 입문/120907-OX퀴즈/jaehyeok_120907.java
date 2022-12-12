// git commit -m "code: Solve programmers 120907 OX퀴즈 (jaehyeok)"

class Solution {
    //OX퀴즈
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