// git commit -m "code: Solve programmers 120822 문자열뒤집기 (jaehyeok)"

import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] num_list) {

        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = num_list.length-1 ; i>=0;i--){

            answer.add(num_list[i]);

        }

        return answer;
    }
}