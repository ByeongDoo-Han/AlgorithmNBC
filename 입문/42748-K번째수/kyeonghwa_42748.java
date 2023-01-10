import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int num = 0;
        for(int i=0; i<commands.length; i++){
            int[] arr = new int[array.length];
            arr = Arrays.copyOfRange(array,array[i][0]-1,array[i][1]); //ArrayList에서는 안되나..
            Arrays.sort(arr);
            answer.add(arr.arr[i][2]);
        }
        return answer;
    }
}