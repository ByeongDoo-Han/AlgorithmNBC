// git commit -m "code: Solve programmers 120875 평행 (jaehyeok)"

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


class Solution120875 {

    public int solution(int[][] dots) {
        int answer = 0;

        ArrayList<Double> xDots = new ArrayList<>(Arrays.asList((double)dots[0][0],(double)dots[1][0],(double)dots[2][0],(double)dots[3][0]));
        ArrayList<Double> yDots = new ArrayList<>(Arrays.asList((double)dots[0][1],(double)dots[1][1],(double)dots[2][1],(double)dots[3][1]));

        xDots.sort(Comparator.naturalOrder());
        yDots.sort(Comparator.naturalOrder());

        double gradientCaseOne = (yDots.get(3)- yDots.get(0))/(xDots.get(1)-xDots.get(0));
        double gradientCaseTwo = (yDots.get(2)- yDots.get(1))/(xDots.get(3)-xDots.get(2));

        double gradientCaseThree = (yDots.get(3)- yDots.get(2))/(xDots.get(3)-xDots.get(1));
        double gradientCaseFlour = (yDots.get(1)- yDots.get(0))/(xDots.get(2)-xDots.get(0));

        double gradientCaseNine = (yDots.get(1)- yDots.get(0))/(xDots.get(1)-xDots.get(0));
        double gradientCaseTen = (yDots.get(3)- yDots.get(2))/(xDots.get(3)-xDots.get(2));

        if(gradientCaseOne==(gradientCaseTwo)||gradientCaseThree==(gradientCaseFlour)||(gradientCaseNine==(gradientCaseTen))){
            ++answer;
        }
        return answer;
    }
}