/**
 * 
 */
package problems;

import java.util.Arrays;

/**
 * @author jiang.wen
 *
 */
public class P215_KthLargestElementInAnArray {

    public static int findKthLargest(int[] nums, int k) {
    	int n = nums.length;
    	if(n==0 || k>n) return 0;
    	Arrays.sort(nums);
    	return nums[n-k];
    }
}
