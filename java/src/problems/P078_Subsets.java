/**
 * http://leetcode.com/problems/subsets/
 */
package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jiang.wen
 *
 */
public class P078_Subsets {

    public static List<List<Integer>> subsets(int[] nums) {
    	Arrays.sort(nums);
    	return subsets(nums, nums.length-1);
    }
    
    private static List<List<Integer>> subsets(int[] nums, int end) {
        List<List<Integer>> total_list;
        if(end<0){
        	total_list = new ArrayList<List<Integer>>();
        	List<Integer> list = new ArrayList<Integer>();
        	total_list.add(list);
        } else {
        	total_list = subsets(nums, end-1);
        	int n = total_list.size();
        	for(int i=0;i<n;i++){
        		List<Integer> new_list = new ArrayList<Integer>(total_list.get(i));
        		new_list.add(nums[end]);
        		total_list.add(new_list);
        	}
        }
        return total_list;
    }
}
