// git commit -m "code: Solve programmers 120911 문자열정렬하기2 (sol)"
class Solution {
    public static String solution(String my_string) {
        //우선 소문자로 바꾸고, sort 사용 ?
        String answer = "";
        char[] ch = my_string.toLowerCase().toCharArray();

        for(int i = 0; i < ch.length - 1; i++) {
            for(int j = i + 1; j < ch.length; j++) {
                if (ch[j] < ch[i]) {
                    char tmp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = tmp;
                }
            }
        }
        answer = String.valueOf(ch);

        return answer;
    }
}