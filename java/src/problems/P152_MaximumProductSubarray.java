/**
 * 
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P152_MaximumProductSubarray {
	
    public static int maxProduct(int[] nums) {
    	int n = nums.length;
    	if(n<=0) return 0;
    	int max = nums[0];
    	int min = nums[0];
    	int globalMax = nums[0];
    	for(int i=1;i<n;i++){
    		int curMax = Math.max(Math.max(max*nums[i], min*nums[i]), nums[i]);
    		int curMin = Math.min(Math.min(max*nums[i], min*nums[i]), nums[i]);
    		max = curMax;
    		min = curMin;
    		globalMax = Math.max(globalMax, max);
    	}
    	return globalMax;
    }

//    public static int maxProduct(int[] nums) {
//    	int n = nums.length;
//    	if(n<=0) return 0;
//    	int[] max = new int[n];
//    	int[] min = new int[n];
//    	max[0] = nums[0];
//    	min[0] = nums[0];
//    	int globalMax = max[0];
//    	for(int i=1;i<n;i++){
//    		max[i] = Math.max(Math.max(max[i-1]*nums[i], min[i-1]*nums[i]), nums[i]);
//    		min[i] = Math.min(Math.min(max[i-1]*nums[i], min[i-1]*nums[i]), nums[i]);
//    		globalMax = Math.max(globalMax, max[i]);
//    	}
//    	return globalMax;
//    }
}
