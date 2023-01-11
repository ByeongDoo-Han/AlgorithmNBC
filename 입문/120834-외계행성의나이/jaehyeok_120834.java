// git commit -m "code: Solve programmers 120834 외계행성의나이 (jaehyeok)"
class Solution {
    public StringBuffer  solution(int age) {
        StringBuffer answer = new StringBuffer();

        String stringAge= age+"";

        char[] chars = stringAge.toCharArray();

        for (char c : chars) {
            answer.append((char)(c+49));
        }

        return answer;
    }
}