// git commit -m "code: Solve programmers 120895 인덱스바꾸기 (sol)"
public class Index { // 프로그래머스 입문 <인덱스 바꾸기>
    // https://school.programmers.co.kr/learn/courses/30/lessons/120895
    public static StringBuilder solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++) {
            if(i == num1) {
                answer.append(my_string.charAt(num2));
            } else if (i == num2) {
                answer.append(my_string.charAt(num1));
            } else
                answer.append(my_string.charAt(i));
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("hello",1,2));
    }
}
