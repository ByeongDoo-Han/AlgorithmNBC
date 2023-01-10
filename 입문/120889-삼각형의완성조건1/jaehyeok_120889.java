// git commit -m "code: Solve programmers 120889 삼각형의완성조건1 (jaehyeok)"

import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        if(sides[0]+sides[1]<=sides[2]){
            return 2;
        }else{
            return 1;
        }
    }
}