// git commit -m "code: Solve programmers 120583 중복된숫자개수 (jaehyeok)"

class Solution {
    public int solution(int[] array, int n) {
        int count = 0;
        for(int i : array){
            if (i ==n){
                count +=1;
            }
        }
        return count;
    }
}