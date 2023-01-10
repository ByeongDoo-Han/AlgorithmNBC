// git commit -m "code: Solve programmers 120899 가장큰수찾기 (sol)"

package programmers;

public class FindMaxNum { //프로그래머스 입문 <가장 큰 수 찾기>
    //https://school.programmers.co.kr/learn/courses/30/lessons/120899
    public static int[] solution(int[] array) {
        int[] answer = new int[2];

        for(int i = 0; i < array.length; i++) {
            if(array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

    }

}