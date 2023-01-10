// git commit -m "code:class Solution {
//    publ Solve programmers 120929 각도기 (jaehyeok)"

class Solution {
    public int solution(int angle) {
        if(angle<90){
            return 1;
        }else if (angle==90){
            return 2;
        }else if (angle<180){
            return 3;
        }else
            return 4;
    }
}