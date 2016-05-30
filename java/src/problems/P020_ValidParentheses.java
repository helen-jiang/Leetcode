/**
 * 
 */
package problems;

import java.util.Stack;

/**
 * @author jiang.wen
 *
 */
public class P020_ValidParentheses {

    public static boolean isValid(String s) {
    	char[] ss = s.toCharArray();
    	Stack<Character> stack = new Stack<Character>();
    	for(char c:ss){
    		if(c=='(' || c=='{' || c=='[') stack.push(c);
    		else if(stack.isEmpty()) return false;
    		else {
    			char p = stack.pop();
    			if((p=='(' && c==')') || (p=='{' && c=='}') || (p=='[' && c==']')) continue;
    			else return false;
    		}
    	}
        return stack.isEmpty();
    }
}
