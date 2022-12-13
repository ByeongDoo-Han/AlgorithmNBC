// git commit -m "code: Solve programmers 120866 안전지대 (byeongdoo)"

class Solution {
    public static int solution(int[][] board) {
        int n = board.length;
        int[][] answer = new int[n + 2][n + 2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer[i][j] = 1;
                    answer[i][j + 1] = 1;
                    answer[i][j + 2] = 1;
                    answer[i + 1][j] = 1;
                    answer[i + 1][j + 1] = 1;
                    answer[i + 1][j + 2] = 1;
                    answer[i + 2][j] = 1;
                    answer[i + 2][j + 1] = 1;
                    answer[i + 2][j + 2] = 1;
                }
            }
        }
        int a = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (answer[i][j] == 1) {
                    a += 1;
                }
            }
        }
        return n * n - a;
    }
}