// git commit -m "code: Solve programmers 17681 비밀지도 (byeongdoo)"

public class byeongdoo_17681 {
    public static void main(String[] args) {

    }

}

class Solution {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]).replaceAll("0", " ").replaceAll("1", "#");
        }
        for (int i = 0; i < answer.length; i++) {
            if (answer[i].length() < n) {
                String repeated = " ".repeat(n - answer[i].length());
                answer[i] = repeated + answer[i];
            }
        }
        return answer;
    }
}