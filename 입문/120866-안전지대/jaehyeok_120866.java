// git commit -m "code: Solve programmers 120866 안전지대 (jaehyeok)"
class Solution {
    public int solution(int[][] board) {
        int countZero = 0;
        int boardN = board.length;
        int exceptionCase =0;
        if(boardN<3){
            for (int i =0;i<boardN;i++){
                for(int j=0;i<boardN;i++){
                    if(board[i][j]==1){
                        exceptionCase+=1;
                    }
                }
            }
        }
        if (boardN < 3 && exceptionCase != 0) {
            return countZero;
        } else if (boardN == 1) {         //case8은 크기가 1일때 case10은 크기가 2일때구나
            return 1;
        } else if(boardN==2){
            return 4;
        }

        // boardN이 2보다 큰경우부터 시작함
        for(int i = 0;i<boardN;i++){
            for(int j =0;j<boardN;j++){
                if(i==0&&j==0) { //이건 윗줄+왼쪽
                    if (board[0][0] == 1) {
                        board[0][1] += 2;
                        board[1][0] += 2;
                        board[1][1] += 2;
                    }
                } else if (i==0&&j==boardN-1) {//이건 윗줄 + 오른쪽
                    if(board[0][boardN-1]==1){
                        if(board[0][boardN-2]!=1) {
                            board[0][boardN - 2] += 2;
                        }
                        if(board[1][boardN-2]!=1) {
                            board[1][boardN - 2] += 2;
                        }
                        if(board[1][boardN-1]!=1) {
                            board[1][boardN - 1] += 2;
                        }
                    }
                } else if (i==0) { //이건 윗 줄
                    if(board[0][j]==1){
                        if( board[0][j-1]!=1) {
                            board[0][j - 1] += 2;
                        }
                        if( board[0][j + 1]!=1) {
                            board[0][j + 1] += 2;
                        }
                        if(board[1][j - 1]!=1) {
                            board[1][j - 1] += 2;
                        }
                        if( board[1][j] !=1) {
                            board[1][j] += 2;
                        }
                        if( board[1][j + 1] !=1) {
                            board[1][j + 1] += 2;
                        }
                    }
                } else if (j==0&&i!=boardN-1) {//이러면 아랫줄이 제외. 왼편.
                    if (board[i][0]==1){
                        if( board[i - 1][0] !=1) {
                            board[i - 1][0] += 2;
                        }
                        if(board[i + 1][0]!=1) {
                            board[i + 1][0] += 2;
                        }
                        if( board[i - 1][1]!=1) {
                            board[i - 1][1] += 2;
                        }
                        if(board[i][1]!=1) {
                            board[i][1] += 2;
                        }
                        if( board[i + 1][1]!=1) {
                            board[i + 1][1] += 2;
                        }
                    }
                } else if (j!=0&&board[i][j]==1&&j!=boardN-1&&i!=boardN-1) { //중간인데 오른쪽 제외.? 왼쪽도 제외해야하나..? 밑줄도 제외.?
                    if( board[i - 1][j - 1]!=1) {
                        board[i - 1][j - 1] += 2;
                    }
                    if(board[i - 1][j]!=1) {
                        board[i - 1][j] += 2;
                    }
                    if( board[i - 1][j + 1]!=1) {
                        board[i - 1][j + 1] += 2;
                    }
                    if(board[i][j + 1]!=1) {
                        board[i][j + 1] += 2;
                    }
                    if( board[i][j - 1]!=1) {
                        board[i][j - 1] += 2;
                    }
                    if( board[i + 1][j - 1]!=1) {
                        board[i + 1][j - 1] += 2;
                    }
                    if( board[i + 1][j]!=1) {
                        board[i + 1][j] += 2;
                    }
                    if( board[i + 1][j + 1]!=1) {
                        board[i + 1][j + 1] += 2;
                    }
                } else if (j==boardN-1&&i!=boardN-1) {//오른쪽줄 but 아랫줄 제외
                    if (board[i][boardN-1]==1){
                        if(board[i - 1][boardN - 1]!=1) {
                            board[i - 1][boardN - 1] += 2;
                        }
                        if( board[i - 1][boardN - 2]!=1) {
                            board[i - 1][boardN - 2] += 2;
                        }
                        if( board[i][boardN - 2]!=1) {
                            board[i][boardN - 2] += 2;
                        }
                        if( board[i + 1][boardN - 2]!=1) {
                            board[i + 1][boardN - 2] += 2;
                        }
                        if( board[i + 1][boardN - 1]!=1) {
                            board[i + 1][boardN - 1] += 2;
                        }
                    }
                }else if(i==boardN-1&&j==0){  //이건 아랫줄 왼쪽...
                    if(board[boardN-1][0]==1){
                        if( board[boardN - 2][0]!=1) {
                            board[boardN - 2][0] += 2;
                        }
                        if(board[boardN - 2][1]!=1) {
                            board[boardN - 2][1] += 2;
                        }
                        if( board[boardN - 1][1]!=1) {
                            board[boardN - 1][1] += 2;
                        }
                    }
                }else if(i==boardN-1 && j!=boardN-1){  //이건 아랫줄  + 오른쪽 제외
                    if(board[boardN-1][j]==1){
                        if(board[boardN - 1][j - 1]!=1) {
                            board[boardN - 1][j - 1] += 2;
                        }
                        if( board[boardN - 2][j - 1]!=1) {
                            board[boardN - 2][j - 1] += 2;
                        }
                        if( board[boardN - 2][j]!=1) {
                            board[boardN - 2][j] += 2;
                        }
                        if( board[boardN - 2][j + 1]!=1) {
                            board[boardN - 2][j + 1] += 2;
                        }
                        if( board[boardN - 1][j + 1]!=1) {
                            board[boardN - 1][j + 1] += 2;
                        }
                    }
                } else if (i==boardN-1 && j==boardN-1) { //이건 아랜줄+ 오른쪽
                    if(board[boardN-1][boardN-1]==1){
                        if( board[boardN - 2][boardN - 2]!=1) {
                            board[boardN - 2][boardN - 2] += 2;
                        }
                        if(board[boardN - 2][boardN - 1]!=1) {
                            board[boardN - 2][boardN - 1] += 2;
                        }
                        if( board[boardN - 1][boardN - 2]!=1) {
                            board[boardN - 1][boardN - 2] += 2;
                        }
                    }
                }
            }
        }

        for (int i =0;i<boardN;i++){
            for(int j=0;j<boardN;j++){
                if(board[i][j]==0){
                    countZero +=1;
                }
            }
        }
        return countZero;
    }
}