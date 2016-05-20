/**
 * 
 */
package problems;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author jiang.wen
 *
 */
public class P155_MinStack_Test {

	@Test
	public void test1() {
		P155_MinStack minStack = new P155_MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		assertEquals(-3, minStack.getMin());
		minStack.pop();
		assertEquals(0, minStack.top());
		assertEquals(-2, minStack.getMin());
	}
	
	@Test
	public void test2() {
		P155_MinStack minStack = new P155_MinStack();
		minStack.push(2147483646);
		minStack.push(2147483646);
		minStack.push(2147483647);
		assertEquals(2147483647, minStack.top());
		minStack.pop();
		assertEquals(2147483646, minStack.getMin());
		minStack.pop();
		assertEquals(2147483646, minStack.getMin());
		minStack.pop();
		minStack.push(2147483647);
		assertEquals(2147483647, minStack.top());
		assertEquals(2147483647, minStack.getMin());
		minStack.push(-2147483648);
		assertEquals(-2147483648, minStack.top());
		assertEquals(-2147483648, minStack.getMin());
		minStack.pop();
		assertEquals(2147483647, minStack.getMin());
	}

}
