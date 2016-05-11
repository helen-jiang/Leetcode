/**
 * https://leetcode.com/problems/divide-two-integers/
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P029_DivideTwoIntegers {

    public static int divide(int dividend, int divisor) {
    	if(divisor==0 || (dividend==Integer.MIN_VALUE && divisor==-1)) return Integer.MAX_VALUE;
        return divide((long) dividend, (long) divisor);
    }
    
    private static int divide(long dividend, long divisor){
    	int sign = ((dividend>0)^(divisor>0))?-1:1;
    	dividend = dividend>0?dividend:-dividend;
    	divisor = divisor>0?divisor:-divisor;
    	int res = 0;
    	while(dividend>=divisor){
    		long curDivisor = divisor;
    		int curRes = 1;
    		while(dividend>=(curDivisor+curDivisor)){
    			curDivisor += curDivisor;
    			curRes += curRes;
    		}
    		dividend -= curDivisor;
    		res += curRes;
    	}
    	return sign==1?res:-res;
    }
}
