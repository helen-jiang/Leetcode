/**
 * 
 */
package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiang.wen
 *
 */
public class P239_SlidingWindowMaximum {
	
	public static int[] maxSlidingWindow(int[] nums, int k){
		if(nums.length==0 || k==0) return new int[0];
		int n = nums.length;
		int[] max = new int[n-k+1];
		for(int i=k-2;i>=1;i--){
			if(nums[i]>nums[i-1]) nums[i-1] = nums[i];
		}
		for(int i=0;i<=n-k;i++){
			for(int j=i+k-1;j>=i+1;j--){
				if(nums[j]>nums[j-1]) nums[j-1] = nums[j];
				else break;
			}
			max[i] = nums[i];
		}
		return max;
	}
}
