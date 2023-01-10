// git commit -m "code: Solve programmers 120841 점의위치구하기 (jaehyeok)"
class Solution {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];

        if(x>0&&y>0){
            return 1;
        }
        if(x<0&&y>0){
            return 2;
        }
        if(x<0&&y<0){
            return 3;
        }else{
            return 4;
        }
    }
}