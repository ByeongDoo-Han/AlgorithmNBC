class Solution {
    public int solution(int[] sides) {
        int max=sides[0];
        int sum = 0;
        for (int i = 0; i < sides.length; i++){      
            if (max < sides[i]){
                max = sides[i];
            }
            sum += sides[i];
        }
        if(sum - max > max){
            return 1;
        }else{
            return 2;
        }
    }
}
