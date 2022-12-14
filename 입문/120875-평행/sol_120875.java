// git commit -m "code: Solve programmers 120875 평행 (sol)"

class Solution {
    public static double getInclination(int[] dot1, int[] dot2) {
        double inclination = (double)(dot1[1] - dot2[1]) / (dot1[0] - dot2[0]); //하나라도 double로 형변환 해주면 double형으로 연산수행(확대형변환 자동으로 수행됨)
        return inclination;
    }
    public int solution(int[][] dots) {
        if(getInclination(dots[0], dots[1]) == getInclination(dots[2], dots[3]))
            return 1;
        else if(getInclination(dots[0], dots[2]) == getInclination(dots[1], dots[3]))
            return 1;
        else if (getInclination(dots[0], dots[3]) == getInclination(dots[1], dots[2]))
            return 1;
        return 0;
    }
}