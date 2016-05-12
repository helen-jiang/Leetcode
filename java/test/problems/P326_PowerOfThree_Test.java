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
public class P326_PowerOfThree_Test {
	
	@Parameters(name = "P326_PowerOfThree_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{3, true},
				{9, true},
				{27, true},
				{81, true},
				{1, true},
				{0, false},
				{-1, false},
				{-3, false},
				{2147483647, false},
				{-2147483648, false}
		});
	}
	
	@Parameter(value=0)
	public int n;
	
	@Parameter(value=1)
	public boolean expected;

	@Test
	public void test() {
		assertEquals(expected, P326_PowerOfThree.isPowerOfThree(n));
	}

}
