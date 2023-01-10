// git commit -m "code: Solve programmers 120833 배열자르기 (jaehyeok)"
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] numbers, int num1, int num2) {

        ArrayList<Integer> newAnswerList = new ArrayList();

        for(int i =num1 ; i<num2+1;i++){

            newAnswerList.add(numbers[i]);
        }
        return newAnswerList;
    }
}