/**
 * http://leetcode.com/problems/majority-element/
 */
package problems;

import java.util.Arrays;

/**
 * @author jiang.wen
 *
 */
public class P169_MajorityElement {

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    
    public static int majorityElement_Vote(int[] nums){
    	int candidate = 0, count = 0;
    	for(int i:nums){
    		if(count==0){
    			candidate = i;
    			count++;
    		} else if(candidate==i){
    			count++;
    		} else {
    			count--;
    		}
    	}
    	return candidate;
    }
}
