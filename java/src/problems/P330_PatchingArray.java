/**
 * 
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P330_PatchingArray {
	
    public static int minPatches(int[] nums, int n) {
    	long sum = 0;
    	int count = 0, i = 0;
    	while(i<nums.length){
    		if(nums[i]<=sum+1) {
    			sum += nums[i];
    			i++;
    		} else {
    			sum += sum+1;
    			count++;
    		}
    		if(sum>=n) break;
    	}
    	while(sum<n){
			sum += sum+1;
			count++;
    	}
    	return count;
    }
}
