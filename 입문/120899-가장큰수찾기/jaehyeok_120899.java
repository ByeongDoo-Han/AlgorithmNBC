// git commit -m "code: Solve programmers 120899 가장큰수찾기 (jaehyeok)"
class Solution {
    public int[] solution(int[] array) {

        int maxValue = array[0];
        int countIndex = 0;

        for (int i : array) {
            if (i > maxValue) {
                maxValue=i;
            }
        }

        for (int i : array) {
            if(i==maxValue){
                break;
            }
            countIndex++;
        }

        int[] answer ={maxValue,countIndex};

        return answer;
    }
}