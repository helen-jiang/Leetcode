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
public class P231_PowerOfTwo_Test {
	
	@Parameters(name = "P231_PowerOfTwo_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{0, false},
				{1, true},
				{2, true},
				{64, true},
				{1073741824, true},
				{2147483647, false},
				{-1, false},
				{-2147483648, false},
		});
	}
	
	@Parameter(value=0)
	public int n;
	
	@Parameter(value=1)
	public boolean expected;

	@Test
	public void test() {
		assertEquals(expected, P231_PowerOfTwo.isPowerOfTwo(n));
	}

}
