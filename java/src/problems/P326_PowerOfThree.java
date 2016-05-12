/**
 * http://leetcode.com/problems/power-of-three/
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P326_PowerOfThree {

    public static boolean isPowerOfThree(int n) {
    	return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
