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
public class P179_LargestNumber_Test {

	@Parameters(name = "P179_LargestNumber_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new int[]{3, 30, 34, 5, 9}, "9534330"},
				{new int[]{3, 30, 312, 34, 5, 9}, "9534331230"},
				{new int[]{121,12}, "12121"},
				{new int[]{0,0}, "0"}
		});
	}
	
	@Parameter(value=0)
	public int[] nums;
	
	@Parameter(value=1)
	public String expected;
	
	@Test
	public void test() {
		assertEquals(expected, P179_LargestNumber.largestNumber(nums));
	}

}
