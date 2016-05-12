/**
 * http://leetcode.com/problems/single-number/
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P136_SingleNumber {

    public static int singleNumber(int[] nums) {
        int res = 0;
        for(int i:nums) res ^= i;
        return res;
    }
}
