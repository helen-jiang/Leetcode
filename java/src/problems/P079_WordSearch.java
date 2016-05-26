/**
 * 
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P079_WordSearch {

    public static boolean exist(char[][] board, String word) {
    	if(board.length==0 || board[0].length==0 || word.length()==0) return false;
    	int h = board.length, w = board[0].length;
    	char[] ss = word.toCharArray();
    	for(int i=0;i<h;i++){
    		for(int j=0;j<w;j++){
    			if(exist(board, i, j, ss, 0)) return true;
    		}
    	}
        return false;
    }
    
    private static boolean exist(char[][] board, int i, int j, char[] word, int c) {
    	if(board[i][j]!=word[c]) return false;
    	else if(c==word.length-1) return true;
    	else {
    		board[i][j] = '*';
    		if(i>0 && exist(board, i-1, j, word, c+1)) return true;
    		if(j>0 && exist(board, i, j-1, word, c+1)) return true;
    		if(i<board.length-1 && exist(board, i+1, j, word, c+1)) return true;
    		if(j<board[i].length-1 && exist(board, i, j+1, word, c+1)) return true;
    		board[i][j] = word[c];
    	}
        return false;
    }
}
