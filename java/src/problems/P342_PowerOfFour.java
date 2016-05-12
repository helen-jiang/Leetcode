/**
 * http://leetcode.com/problems/power-of-four/
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P342_PowerOfFour {

    public static boolean isPowerOfFour(int num) {
    	// There is only one 1 bit and it is on the odd position
        return num>0 && (num&(num-1))==0 && (num&0xAAAAAAAA)==0;
    	//return num>0 && (num&(num-1))==0 && (num&0x55555555)!=0;
    }
}
