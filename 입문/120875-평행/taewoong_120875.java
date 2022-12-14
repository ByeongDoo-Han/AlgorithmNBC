// git commit -m "code: Solve programmers 120875 평행 (taewoong)"

import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        Set<Double> lines = new HashSet<>();
        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) { //i를 제외하고 다시 for문
                double line = (double)(dots[i][1] - dots[j][1]) / (double)(dots[i][0] - dots[j][0]);  //기울기
                if (lines.contains(line)) {  //같은 기울기가 해시셋 안에 있으면 리턴 1 없으면 추가해가면서 비교
                    return 1;
                }
                lines.add(line);
            }
        }
        return 0;
    }
}
