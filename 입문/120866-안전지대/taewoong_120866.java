// git commit -m "code: Solve programmers 120866 안전지대 (taewoong)"


class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int[][] newboard = new int[n+2][n+2];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1) {
                    newboard[i+1][j+1] = 1;
                    newboard[i+1][j+2] =1;
                    newboard[i+1][j] =1;
                    newboard[i][j+1] =1;
                    newboard[i][j] =1;
                    newboard[i][j+2] =1;
                    newboard[i+2][j+1] =1;
                    newboard[i+2][j+2] =1;
                    newboard[i+2][j] =1;
                }
            }
        }
        int safety = 0;
        for(int i = 1; i < n+1 ; i++){
            for(int j = 1; j < n+1; j++){
                if(newboard[i][j] == 0) {
                    safety += 1;
                }
            }
        }

        return safety;
    }
}