/**
 * 
 */
package problems;

import java.util.Arrays;

/**
 * @author jiang.wen
 *
 */
public class P287_FindTheDuplicateNumber {

    public static int findDuplicate(int[] nums) {
    	int n = nums.length;
    	if(n<2) return 0;
    	Arrays.sort(nums);
    	for(int i=0;i<n-1;i++)
    		if(nums[i]==nums[i+1]) return nums[i];
    	return nums[n-1];
    }
}
