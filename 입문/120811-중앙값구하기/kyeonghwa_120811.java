import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int midIdx = Math.round(array.length/2);
        int answer = 0;
        Arrays.sort(array);
        answer = array[midIdx];
        return answer;
    }
} //한 방에 풀었다..... 감덩..............