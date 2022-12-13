// git commit -m "code: Solve programmers 120866 안전지대 (sol)"

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int[] dx = {-1, 0, 1}; //x축으로 이동해주는 배열
        int[] dy = {-1, 0, 1}; //y축으로 이동해주는 배열

        int[][] extendBoard = new int[n+2][n+2]; //board 의 가장자리를 0으로 씌운 extendBoard 생성

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 1) {
                    extendBoard[i + 1 + dx[0]][j + 1 + dy[0]] = 1;
                    extendBoard[i + 1 + dx[0]][j + 1 + dy[1]] = 1;
                    extendBoard[i + 1 + dx[0]][j + 1 + dy[2]] = 1;
                    extendBoard[i + 1 + dx[1]][j + 1 + dy[0]] = 1;
                    extendBoard[i + 1 + dx[1]][j + 1 + dy[1]] = 1;
                    extendBoard[i + 1 + dx[1]][j + 1 + dy[2]] = 1;
                    extendBoard[i + 1 + dx[2]][j + 1 + dy[0]] = 1;
                    extendBoard[i + 1 + dx[2]][j + 1 + dy[1]] = 1;
                    extendBoard[i + 1 + dx[2]][j + 1 + dy[2]] = 1;
                }
            }
        } //위험 지역을 1로 표시

        for(int i = 1; i < extendBoard.length-1; i++) {
            for(int j = 1; j < extendBoard.length-1; j++) {
                if(extendBoard[i][j] == 0) {
                    answer++;
                }
            }
        } //안전지대 수를 카운트

        return answer;
    }
}