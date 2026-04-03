class Solution {
    public boolean isValidSudoku(char[][] board) { 
        for(int i = 0; i < 9; i += 3){
            for(int j = 0; j < 9; j += 3){
                HashSet<Integer> block = new HashSet<>();
                for(int k = i; k < i + 3; k++){
                    for(int l = j; l < j + 3; l++){
                        if(block.contains((int)board[k][l])) return false;
                        else if(board[k][l] != '.') block.add((int)board[k][l]);
                        HashSet<Integer> row = new HashSet<>();
                        HashSet<Integer> column = new HashSet<>();
                        for(int m = 0; m < 9; m++){
                            System.out.println(i + "" + j + "" + k + "" + l + "" + m);
                            if(row.contains((int)board[k][m])) return false;
                            else if(board[k][m] != '.') row.add((int)board[k][m]);
                            if(column.contains((int)board[m][l])) return false;
                            else if(board[m][l] != '.') column.add((int)board[m][l]);
                        }
                    }
                }
            }
        }
        return true;
    }
}
