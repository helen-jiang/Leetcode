/**
 * http://leetcode.com/problems/maximum-product-of-word-lengths/
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P318_MaximumProductOfWordLengths {

    public static int maxProduct(String[] words) {
    	int n = words.length;
    	int[] bits = new int[n];
    	int[] length = new int[n];
    	for(int i=0;i<n;i++){
    		char[] word = words[i].toCharArray();
    		length[i] = word.length;
    		for(int j=0;j<word.length;j++)
    			bits[i] |= 1<<(word[j]-'a');
    	}
    	int max = 0;
    	for(int i=0;i<n-1;i++){
    		for(int j=i;j<n;j++){
    			if((bits[i]&bits[j])==0) max=Math.max(max, length[i]*length[j]);
    		}
    	}
        return max;
    }
}
