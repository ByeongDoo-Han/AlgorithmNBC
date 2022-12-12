// git commit -m "code: Solve programmers 17681 비밀지도 (byeongdoo)"

class Solution {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]).replace("0", " ").replace("1", "#");
        }
        return answer;
    }
}