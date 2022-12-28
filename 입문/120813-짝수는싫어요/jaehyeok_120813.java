// git commit -m "code: Solve programmers 120813 짝수는싫어요 (jaehyeok)"
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n) {

        ArrayList<Integer> answer = new ArrayList<>();

        for(int i =1 ; i<n+1;i+=2){
            answer.add(i);
        }

        return answer;
    }
}