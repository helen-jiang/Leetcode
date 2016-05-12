/**
 * http://leetcode.com/problems/number-of-1-bits/
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P191_NumberOf1Bits {

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
    	int count = 0;
    	while(n!=0){
    		n &= (n-1);
    		count++;
    	}
        return count;
    }
}
