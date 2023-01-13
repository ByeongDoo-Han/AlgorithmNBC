// git commit -m "code: Solve programmers 120834 외계행성의나이 (sol)"

class Solution {
    public StringBuilder solution(int age) {
        StringBuilder answer = new StringBuilder();
        while(age > 0) {
            int remain = age % 10;
            answer.append((char)(remain + 97));
            age = age / 10;
        }

        return answer.reverse();
    }
}