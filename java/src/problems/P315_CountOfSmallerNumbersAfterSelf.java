/**
 * 
 */
package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jiang.wen
 *
 */
public class P315_CountOfSmallerNumbersAfterSelf {
	
    public static List<Integer> countSmaller(int[] nums) {
    	int n = nums.length;
    	Integer[] count = new Integer[n];
    	if(n>0){
    		List<Integer> sorted = new ArrayList<Integer>();
    		for(int i=n-1;i>=0;i--){
    			count[i] = insertToSorted(sorted, nums[i]);
    		}
    		
    	}
    	return Arrays.asList(count);
    }
    
    private static int insertToSorted(List<Integer> sorted, int num){
    	int lo = 0, hi = sorted.size();
    	while(lo<hi){
    		int mid = lo + (hi-lo)/2;
    		int midVal = sorted.get(mid);
    		if(midVal<num) lo = mid+1;
    		else hi = mid;
    	}
    	sorted.add(lo, num);
    	return lo;
    }
}
