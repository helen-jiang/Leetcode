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
public class P342_PowerOfFour_Test {
	
	@Parameters(name = "P342_PowerOfFour_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{0, false},
				{1, true},
				{2, false},
				{4, true},
				{64, true},
				{536870912, false},
				{1073741824, true},
				{2147483647, false},
				{-1, false},
				{-2147483648, false},
		});
	}
	
	@Parameter(value=0)
	public int num;
	
	@Parameter(value=1)
	public boolean expected;

	@Test
	public void test() {
		assertEquals(expected, P342_PowerOfFour.isPowerOfFour(num));
	}

}
