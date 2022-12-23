// git commit -m "code: Solve programmers 12918 문자열다루기기본 (kyeonghwa)"
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Char[] arr = s.toCharArray();
        for (int number : numbers){
            for (int com : arr){
                if (number != com){
                    boolean answer = false;
                }
            }
        }

        return answer;
    }
}