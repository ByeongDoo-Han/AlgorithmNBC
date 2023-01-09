// git commit -m "code: Solve programmers 120893 대문자와소문자 (sol)"

public class MyString { //프로그래머스 입문 <대문자와 소문자>
    //https://school.programmers.co.kr/learn/courses/30/lessons/120893

    public static String solution(String myString) {
        String answer = "";

        for(char x : myString.toCharArray()) {
            if (x >= 65 && x <= 90) { //대문자일 때
                answer += (char)(x + 32);
            }
            else {
                answer += (char)(x - 32);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String myString = "cccCCC";
        System.out.println(solution(myString));
    }
}