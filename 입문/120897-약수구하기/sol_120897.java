// git commit -m "code: Solve programmers 120897 약수구하기 (sol)"

import java.util.ArrayList;

public class Divisor { //프로그래머스 입문 <약수 구하기>
    // https://school.programmers.co.kr/learn/courses/30/lessons/120897

    public static ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            if(n % i == 0)
                answer.add(i);
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}