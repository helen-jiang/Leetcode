/**
 * 
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P036_ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
    	int n = board.length;
    	for(int i=0;i<n;i++){
    		boolean[] row = new boolean[9];
    		boolean[] column = new boolean[9];
    		boolean[] block = new boolean[9];
    		for(int j=0;j<n;j++){
    			if(isValidSudoku(board[i][j], row)==false) return false;
    			if(isValidSudoku(board[j][i], column)==false) return false;
    			if(isValidSudoku(board[i/3*3+j/3][i%3*3+j%3], block)==false) return false;
    		}
    	}
        return true;
    }
    
    private static boolean isValidSudoku(char cell, boolean[] existing){
    	if(cell=='.') return true;
		int v = cell - '1';
		if(existing[v]==true) return false;
		else {
			existing[v] = true;
			return true;
		}
    }
}
