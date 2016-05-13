/**
 * http://leetcode.com/problems/single-number-iii/
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P260_SingleNumberIII {

    public static int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int diff = 0;
        // first to find out res[0] ^ res[1], all the different bits (which is 1)
        for(int i:nums) diff ^= i;
        // to find out the last different bit (last 1)
        // x^(x-1) :  to remove the last 1
        // x&(~x+1) : to save the last 1
        diff &= -diff; //diff &= (~diff+1)
        for(int i:nums){
        	if((i&diff)==0) res[0] ^= i;
        	else res[1] ^= i;
        }
        return res;
    }
}
