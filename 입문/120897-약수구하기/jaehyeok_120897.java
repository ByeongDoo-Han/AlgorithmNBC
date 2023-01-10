// git commit -m "code: Solve programmers 120897 약수구하기 (jaehyeok)"

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer =new ArrayList<>();
        for(int i =1;i<n+1;i++){
            if(n%i==0){
                answer.add(i);
            }
        }
        return answer;
    }
}