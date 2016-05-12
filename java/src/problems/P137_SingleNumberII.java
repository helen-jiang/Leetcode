/**
 * http://leetcode.com/problems/single-number-ii/
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P137_SingleNumberII {

    public static int singleNumber(int[] nums) {
        int one = 0, two = 0;
        for(int i:nums){
        	// x^x=0; x^0=x; x^1=~x; x&~x=0; x&0=0; x&1=x;
        	one = (one^i) & (~two);
        	two = (two^i) & (~one);
        }
        return one;
    }
}
