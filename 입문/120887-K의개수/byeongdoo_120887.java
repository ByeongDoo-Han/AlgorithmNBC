// git commit -m "code: Solve programmers 120887 K의개수 (byeongdoo)"

class Solution {
    public static int solution(int i, int j, int k) {
        int answer = 0;
        String sk = String.valueOf(k);
        for (int x = i; x < j + 1; x++) {
            String s = String.valueOf(x);
            String[] sp = s.split("");
            for (String y : sp) {
                if (y.equals(sk))
                    answer += 1;
            }
        }
        return answer;
    }
}