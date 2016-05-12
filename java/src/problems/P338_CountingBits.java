/**
 * http://leetcode.com/problems/counting-bits/
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P338_CountingBits {

    public static int[] countBits(int num) {
        int[] count = new int[num+1];
        int index = 1;
        while(index<=num){
        	int n = index;
        	for(int i=0;i<n&&index<=num;i++) 
        		count[index++] = count[i] + 1;
        }
        return count;
    }
}
