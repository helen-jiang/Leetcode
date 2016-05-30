/**
 * 
 */
package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiang.wen
 *
 */
public class P128_LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	int max = 0;
    	for(int i:nums){
    		if(!map.containsKey(i)){
    			Integer left = map.get(i-1), right = map.get(i+1);
    			left = left==null?0:left;
    			right = right==null?0:right;
    			int len = left+right+1;
    			map.put(i, len);
    			map.put(i-left, len);
    			map.put(i+right, len);
    			max = max>len?max:len;
    		}
    	}
        return max;
    }
}
