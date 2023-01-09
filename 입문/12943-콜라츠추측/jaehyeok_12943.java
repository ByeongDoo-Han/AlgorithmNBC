// git commit -m "code: Solve programmers 12943 콜라츠추측 (jaehyeok)"

class Solution {
    public int solution(int num) {
      /*  if(num==1){
            return 0;
        } 없어도 된다 이미 while에서 걸러주고 count를 0으로 초기화해주고 시작하니까
*/
        int count = 0;

        long numLong = num;

        while (numLong>1){

            if(numLong%2==0){
                numLong/=2;
            }else {
                numLong *=3;
                numLong ++;
            }

            count++;
        }

        if(count>500){
            return -1;
        }
        else{
            return count;
        }
    }
}