class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int countZzaq = 0;
        int countHol = 0;
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0){
                countZzaq++;}
            else {countHol++;}
        }
        answer[0] = countZzaq;
        answer[1] = countHol;
        return answer;
    }
}
