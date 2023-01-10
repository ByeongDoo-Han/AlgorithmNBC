// git commit -m "code: Solve programmers 120839 가위바위보 (sol)"

package programmers;

public class Rsp { //프로그래머스 입문 <가위 바위 보>
    // https://school.programmers.co.kr/learn/courses/30/lessons/120839

        /*
        가위 : 2 -> 0
        바위 : 0 -> 5
        보 : 5 - > 2
         */

    public static StringBuilder solution(String rsp) {
        StringBuilder answer = new StringBuilder("");

        for(int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == '2') {
                answer.append('0');
            }
            else if (rsp.charAt(i) == '0') {
                answer.append('5');
            }
            else
                answer.append('2');
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
