/**
 * 
 */
package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiang.wen
 *
 */
public class P022_GenerateParentheses {

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        generateParenthesis("", n, n, list);
        return list;
    }
    
    private static void generateParenthesis(String prefix, int left, int right, List<String> list) {
        if(left==0 && right==0) list.add(prefix);
        else if(left==right) generateParenthesis(prefix+"(", left-1, right, list);
        else if(left<right){
        	if(left>0) generateParenthesis(prefix+"(", left-1, right, list);
        	generateParenthesis(prefix+")", left, right-1, list);
        }
    }
}
