/**
 * 
 */
package problems;

import java.util.Stack;

/**
 * @author jiang.wen
 *
 */
public class P155_MinStack {
	
	private long min;
	private Stack<Long> stack;

    /** initialize your data structure here. */
    public P155_MinStack() {
        this.stack = new Stack<Long>();
    }
    
    public void push(int x) {
    	if(this.stack.isEmpty()) this.min = x;
    	this.stack.push((long)x-this.min);
    	if(x<this.min) this.min = x;
    }
    
    public void pop() {
        long x = this.stack.pop();
        if(x<0) this.min = this.min - x;
    }
    
    public int top() {
    	long x = this.stack.peek();
    	return x<0?(int)this.min:(int)(x+this.min);
    }
    
    public int getMin() {
        return (int)this.min;
    }
}
