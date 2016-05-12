/**
 * http://leetcode.com/problems/power-of-two/
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P231_PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1))==0;
    }
}
