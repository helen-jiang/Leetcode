/**
 * 
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P037_SudokuSolver {
		
    public static void solveSudoku(char[][] board) {
    	solveSudoku(board, 0);
    }
    
    private static boolean solveSudoku(char[][] board, int current) {
    	int n = board.length;
    	for(int c=current;c<n*n;c++){
    		int i = c/n, j = c%n;
    		if(board[i][j]=='.'){
    			for(int v=0;v<9;v++){
    				board[i][j]=(char)('1'+v);
    				if(isValidSudoku(board) && solveSudoku(board, c+1)) return true;
    				else board[i][j]='.';
    			}
    			return false;
    		}
    	}
    	return true;
    }
    
    private static boolean isValidSudoku(char[][] board) {
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
    


//    public static void solveSudoku(char[][] board) {
//    	int n = board.length;
//    	int[][] map = new int[n][n];
//    	for(int i=0;i<n;i++){
//    		for(int j=0;j<n;j++){
//    			if(board[i][j]!='.') {  				
//    				int v = board[i][j]-'1';
//    				map[i][j] = 1 << v;
//    				updateSudoku(board, map, i, j);
//    			}
//    		}
//    	}
//    	System.out.println();
//    }
//    
//    private static void updateSudoku(char[][] board, int[][] map, int i, int j){
//    	int n = board.length, v = map[i][j];
//    	for(int c=0;c<n;c++)
//    		updateCell(board, map, i, c, v);
//    	for(int r=0;r<n;r++)
//    		updateCell(board, map, r, j, v);
//    	for(int r=0;r<3;r++)
//    		for(int c=0;c<3;c++)
//        		updateCell(board, map, i/3*3+r, j/3*3+c, v);
//    }
//    
//    private static void updateCell(char[][] board, int[][] map, int i, int j, int v){
//    	if(board[i][j]=='.'){
//    		if(map[i][j]==0) map[i][j] = (1 << 9) -1;
//    		map[i][j] &= ~v;
//    		if((map[i][j]&(map[i][j]-1))==0) {
//    			board[i][j] = convert(map[i][j]);
//    			System.out.println("[" + i + ", " + j +"]="+board[i][j]);
//    			updateSudoku(board, map, i, j);
//    		}
//    	}
//    }
//    
//    private static char convert(int v){
//    	switch(v){
//    		case 1: return '1'; 
//    		case 1<<1: return '2';
//    		case 1<<2: return '3';
//    		case 1<<3: return '4';
//    		case 1<<4: return '5';
//    		case 1<<5: return '6';
//    		case 1<<6: return '7';
//    		case 1<<7: return '8';
//    		case 1<<8: return '9';
//    		default: return '.';
//    	}
//    }
}
