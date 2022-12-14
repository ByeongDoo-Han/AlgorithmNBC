// git commit -m "code: Solve programmers 120875 평행 (jaehyeok)"

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        ArrayList<Integer> xDots = new ArrayList<>(Arrays.asList(dots[0][0],dots[1][0],dots[2][0],dots[3][0]));
        ArrayList<Integer> yDots = new ArrayList<>(Arrays.asList(dots[0][1],dots[1][1],dots[2][1],dots[3][1]));

        ArrayList<Double> doubleXdots = new ArrayList<>();
        ArrayList<Double> doubleYdots = new ArrayList<>();

        xDots.sort(Comparator.naturalOrder());
        yDots.sort(Comparator.naturalOrder());

        for (Integer xDot : xDots) {
            doubleXdots.add(xDot.doubleValue());
        }
        for (Integer yDot : yDots) {
            doubleYdots.add(yDot.doubleValue());
        }

        double gradientCaseOne = (doubleYdots.get(3)- doubleYdots.get(0))/(doubleXdots.get(1)-doubleXdots.get(0));
        double gradientCaseTwo = (doubleYdots.get(2)- doubleYdots.get(1))/(doubleXdots.get(3)-doubleXdots.get(2));

        double gradientCaseThree = (doubleYdots.get(3)- doubleYdots.get(2))/(doubleXdots.get(3)-doubleXdots.get(1));
        double gradientCaseFlour = (doubleYdots.get(1)- doubleYdots.get(0))/(doubleXdots.get(2)-doubleXdots.get(0));

        double gradientCaseNine = (doubleYdots.get(1)- doubleYdots.get(0))/(doubleXdots.get(1)-doubleXdots.get(0));
        double gradientCaseTen = (doubleYdots.get(3)- doubleYdots.get(2))/(doubleXdots.get(3)-doubleXdots.get(0));

        String restrictCaseOne = String.format("%5f", gradientCaseOne);
        String restrictCaseTwo = String.format("%5f", gradientCaseTwo);

        String restrictCaseThree = String.format("%5f", gradientCaseThree);
        String restrictCaseFlour = String.format("%5f", gradientCaseFlour);


        String restrictCaseNine = String.format("%5f", gradientCaseNine);
        String restrictCaseTen = String.format("%5f", gradientCaseTen);

        if(restrictCaseOne.equals(restrictCaseTwo)||restrictCaseThree.equals(restrictCaseFlour)||(restrictCaseNine.equals(restrictCaseTen))){
            ++answer;
        }
        return answer;
    }
}