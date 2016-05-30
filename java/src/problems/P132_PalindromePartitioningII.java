/**
 * 
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P132_PalindromePartitioningII {

    public static int minCut(String s) {
    	char[] ss = s.toCharArray();
    	int n = ss.length;
    	boolean[][] isPalindrome = new boolean[n][n];
    	int[] minCut = new int[n+1];
    	minCut[0] = -1;
    	for(int j=0;j<n;j++){
    		minCut[j+1] = j;
    		for(int i=0;i<=j;i++){
    			if(ss[i]==ss[j] && ((i+1)>(j-1) || isPalindrome[i+1][j-1])){
    				isPalindrome[i][j] = true;
    				minCut[j+1] = Math.min(minCut[j+1], minCut[i]+1);
    			}
    		}
    	}
        return minCut[n];
    }
}
