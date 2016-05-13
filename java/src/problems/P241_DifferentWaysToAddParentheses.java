/**
 * http://leetcode.com/problems/different-ways-to-add-parentheses/
 */
package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiang.wen
 *
 */
public class P241_DifferentWaysToAddParentheses {

    public static List<Integer> diffWaysToCompute(String input) {
        List<Integer> list = new ArrayList<Integer>();
        char[] ss = input.toCharArray();
        for(int i=0;i<ss.length;i++){
        	if(ss[i]=='+' || ss[i]=='-' || ss[i]=='*'){
        		List<Integer> left = diffWaysToCompute(input.substring(0, i));
        		List<Integer> right = diffWaysToCompute(input.substring(i+1));
        		for(int l:left){
        			for(int r:right){
        				switch(ss[i]){
        					case '+': list.add(l+r);break;
        					case '-': list.add(l-r);break;
        					case '*': list.add(l*r);break;
        					default: break;
        				}
        			}
        		}
        	}
        }
        if(list.size()==0) list.add(Integer.parseInt(input));
        return list;
    }
}
