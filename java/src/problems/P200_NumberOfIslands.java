/**
 * 
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P200_NumberOfIslands {

    public static int numIslands(char[][] grid) {
    	if(grid.length==0 || grid[0].length==0) return 0;
    	int m = grid.length, n = grid[0].length;
    	int num = 0;
    	for(int i=0;i<m;i++){
    		for(int j=0;j<n;j++){
    			if(grid[i][j]=='1'){
    				num++;
    				markCompleteIsland(grid, i, j);
    			}
    		}
    	}
        return num;
    }
    
    private static void markCompleteIsland(char[][] grid, int i, int j){
    	int m = grid.length, n = grid[0].length;
    	grid[i][j] = '2';
    	if(i>0 && grid[i-1][j]=='1') markCompleteIsland(grid, i-1, j);
    	if(j>0 && grid[i][j-1]=='1') markCompleteIsland(grid, i, j-1);
    	if(i<m-1 && grid[i+1][j]=='1') markCompleteIsland(grid, i+1, j);
    	if(j<n-1 && grid[i][j+1]=='1') markCompleteIsland(grid, i, j+1);
    }
}
