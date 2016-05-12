/**
 * https://leetcode.com/problems/reverse-bits/
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P190_ReverseBits {

    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
    	int res = 0;
    	for(int i=0;i<32;i++){
    		res = (res<<1) | (n&1);
    		n >>= 1;
    	}
        return res;
    }
}
