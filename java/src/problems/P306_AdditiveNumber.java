/**
 * 
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P306_AdditiveNumber {

    public static boolean isAdditiveNumber(String num) {
    	int n = num.length();
    	if(n<3) return false;
		for(int i=2;(i+1)/2<=(n-i);i++){
			String remaining = num.substring(i);
			for(int j=1;j<=i-1;j++){
				String left = num.substring(0, j);
				if(left.startsWith("0") && !left.equals("0")) break;
				String right = num.substring(j, i);
				if(right.startsWith("0") && !right.equals("0")) continue;
				if(isAdditiveNumber(left, right, remaining)) return true;
    		}
    	}
        return false;
    }
    
    private static boolean isAdditiveNumber(String left, String right, String remaining){
		String res = Long.toString(Long.parseLong(left)+Long.parseLong(right));
		if(remaining.equals(res)) return true;
		else if(remaining.startsWith(res)) {
			return isAdditiveNumber(right, res, remaining.substring(res.length()));
		} else return false;    	
    }
}
