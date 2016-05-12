/**
 * http://leetcode.com/problems/bitwise-and-of-numbers-range/
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P201_BitwiseANDOfNumbersRange {
	
    public static int rangeBitwiseAnd(int m, int n) {
        int i = Integer.MAX_VALUE;
        while((m&i)!=(n&i)) i<<=1;
        return (m&i);
    }
}
