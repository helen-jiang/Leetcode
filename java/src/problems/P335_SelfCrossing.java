/**
 * https://leetcode.com/problems/self-crossing/
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P335_SelfCrossing {

    public static boolean isSelfCrossing(int[] x) {
    	for(int i=0;i<x.length;i++){
    		if((i>=3 && x[i]>=x[i-2] && x[i-1]<=x[i-3]) ||
    		   (i>=4 && x[i-1]==x[i-3] && x[i]+x[i-4]>=x[i-2]) ||
    		   (i>=5 && x[i]<=x[i-2] && x[i-4]<=x[i-2] && x[i]+x[i-4]>=x[i-2] && x[i-1]<=x[i-3] && x[i-5]<=x[i-3] && x[i-1]+x[i-5]>=x[i-3])) 
    			return true;
    	}
        return false;
    }
}
