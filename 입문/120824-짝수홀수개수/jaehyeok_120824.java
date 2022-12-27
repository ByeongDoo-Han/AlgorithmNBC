// git commit -m "code: Solve programmers 120824 짝수홀수개수 (jaehyeok)"

class Solution {
    public int[] solution(int[] num_list) {
        int countEven = 0;
        for (int i : num_list) {
            if(i%2==0){
                countEven++;
            }
        }
        int[] answer = {countEven,num_list.length-countEven};
        return  answer;
    }
}