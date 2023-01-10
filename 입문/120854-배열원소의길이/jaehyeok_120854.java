// git commit -m "code: Solve programmers 120854 배열원소의길이 (jaehyeok)"
import java.util.ArrayList;

class Solution {
    public  ArrayList<Integer> solution(String[] strlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (String s : strlist) {
            answer.add(s.length());
        }

        return answer;
    }
}