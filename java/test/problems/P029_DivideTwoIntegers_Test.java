/**
 * 
 */
package problems;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author jiang.wen
 *
 */

@RunWith(Parameterized.class)
public class P029_DivideTwoIntegers_Test {
	
	@Parameters(name = "P029_DivideTwoIntegers_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{-1010369383, -2147483648, 0 },
				{-2147483648, -1, 2147483647 },
				{-2147483648, -3457, 621198 },
				{2147483647, 1, 2147483647 },
				{2147483647, -1, -2147483647 },
				{345, 56, 6 },
				{345, -56, -6 },
				{-345, -56, 6 },
				{-345, 56, -6 },
				{0, 1, 0 },
		});
	}
	
	@Parameter(value=0)
	public int dividend;
	
	@Parameter(value=1)
	public int divisor;
	
	@Parameter(value=2)
	public int expected;

	@Test
	public void test() {
		assertEquals(expected, P029_DivideTwoIntegers.divide(dividend, divisor));
	}

}
