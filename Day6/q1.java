class Solution {
    public boolean exist(char[][] board, String word) {
         for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (helper(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
        
    }

    public static boolean helper(char[][] board,int row,int col,String word,int index){
        if(index==word.length()){
            return true;
        }
         int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
       
        if(!issafe(board,row,col,word,index)){
            return false;
        }
         char ch=board[row][col];
        board[row][col]=' ';
          for(int i=0;i<4;i++){
            if(helper(board,row+dr[i],col+dc[i],word,index+1)) return true;
          }
    
        board[row][col]=ch;
        return false;
    }

    public static boolean issafe(char[][] board,int row,int col,String word,int index){
       if(row>=0 && row<board.length && col>=0 && col<board[0].length && board[row][col]!=' ' && board[row][col]==word.charAt(index)) return true;
       return false;

    }
}