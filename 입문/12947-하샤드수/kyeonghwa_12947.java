class Solution {
    public boolean solution(int x) {

        boolean answer = true;
        int div = (x / 10) + (x % 10);

        // if (x % div == 0){
        //     return answer = true;
        // }
        // else {
        //     return answer = false; }
        int x % div == 0 ? answer = true ; answer = false;
        return answer;
    }
}