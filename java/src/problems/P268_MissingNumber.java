/**
 * http://leetcode.com/problems/missing-number/
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P268_MissingNumber {
	
	public static int missingNumber(int[] nums) {
		int res = 0;
		for(int i=0;i<nums.length;i++){
			res ^= i^nums[i];
		}
		return res^nums.length;
	}

}
