// git commit -m "code: Solve programmers 120887 K의개수 (byeongdoo)"
// 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 정수 i, j, k가 매개변수로 주어질 때,
// i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.

class Solution {
    public static int solution(int i, int j, int k) {
        int answer = 0;
        String sk = String.valueOf(k); // 찾고싶은 수를 String 으로 저장
        for (int x = i; x < j + 1; x++) {
            String s = String.valueOf(x);
            String[] sp = s.split(""); // 비교할 수들을 split해서
            for (String y : sp) { // array에서 수를 비교
                if (y.equals(sk)) // 찾고싶은 수와 일치하면
                    answer += 1; // 갯수에 추가
            }
        }
        return answer;
    }
}