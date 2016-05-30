/**
 * 
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P130_SurroundedRegions {

    public static void solve(char[][] board) {
    	if(board.length==0 || board[0].length==0) return;
    	int h = board.length, w = board[0].length;
    	for(int i=0;i<h;i++){
    		mark(board, i, 0);
    		if(w>1) mark(board, i, w-1);
    	}
    	for(int i=1;i<w-1;i++){
    		mark(board, 0, i);
    		if(h>1) mark(board, h-1, i);
    	}
    	for(int i=0;i<h;i++){
    		for(int j=0;j<w;j++){
    			if(board[i][j]=='O') board[i][j] = 'X';
    		}
    	}
    	for(int i=0;i<h;i++){
    		for(int j=0;j<w;j++){
    			if(board[i][j]=='*') board[i][j] = 'O';
    		}
    	}
    }
    
    private static void mark(char[][] board, int i, int j){
    	if(board[i][j]=='O'){
    		board[i][j] = '*';
    		if(i>1) mark(board, i-1, j);
    		if(j>1) mark(board, i, j-1);
    		if(i<board.length-1) mark(board, i+1, j);
    		if(j<board[i].length-1) mark(board, i, j+1);
    	}
    }
}
