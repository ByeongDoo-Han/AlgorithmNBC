// git commit -m "code: Solve programmers 120891 369게임 (jaehyeok)"

class Solution {
    public int solution(int order) {
        int count = 0 ;

        while (order>0){

            if((order%10)%3==0 && order%10!=0){
                ++count;
            }
            order/=10;
        }

        return count;
    }
}