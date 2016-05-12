/**
 * http://leetcode.com/problems/missing-number/
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P268_MissingNumber {

    public int missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
        	if(nums[i]==i || nums[i]>=nums.length) i++;
        	else swap(nums, i, nums[i]);
        }
        for(i=0;i<nums.length;i++){
        	if(nums[i]!=i) return i;
        }
        return nums.length;
    }
    
    private void swap(int[] nums, int i, int j){
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
}
