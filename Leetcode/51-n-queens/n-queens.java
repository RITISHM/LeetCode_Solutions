class Solution {
    //Step 2 : place
    void solve(int row ,char [][] board,List<List<String>> res){
        if (row == board.length){
            res.add(constructBoard(board));
            return;
        }

        //Step 3 : place in every cell

        for (int col=0;col<board.length;col++){
            //check if the cell is valid cell
            if (isValidCell(board,row,col)){
                board[row][col]='Q';
                //try to place the remaing queens
                solve(row+1,board,res);
                board[row][col]='.';

            }
            

        } 

    }
    List<String> constructBoard(char [][]board){
        List <String> res=new ArrayList();
        for (char [] row :board){
            res.add(new String (row));
        }
        return res;
    }
    //Step 3 verify the cell 
    boolean isValidCell(char[][]board , int row ,int col){
        
        //check horizontally
        for (int i=0;i<board.length;i++){
          if (board[row][i]=='Q')return false ; 
        }

        //check vertically
        for (int i=0;i<board.length;i++){
            if (board[i][col]=='Q')return false ;
        }

        //check left upper diagonally 
        for(int i=row-1, j=col-1;i>=0&&j>=0;i--,j--){
            if (board[i][j]=='Q')return false;
        }

        //check right upper diagonally
        for(int i=row-1, j=col+1;i>=0&&j<board.length;i--,j++){
            if (board[i][j]=='Q')return false;
        }
        return true;
    }


    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();

        //Step1 : create 2d chessboard of nXn
        char [][] board=new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j]='.';
            }
        }

        solve(0,board,res);
        return res;
    }
}