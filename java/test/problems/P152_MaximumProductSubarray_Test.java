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
public class P152_MaximumProductSubarray_Test {
	
	@Parameters(name = "P152_MaximumProductSubarray_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new int[]{2,3,-2,4}, 6},
				{new int[]{2,3,-2,4,-1}, 48},
				{new int[]{-1}, -1},
				{new int[]{2,3,0,9,-1}, 9},
				{new int[]{-1, 0}, 0},
				{new int[]{1,2,6}, 12},
				{new int[]{3,-1,4}, 4},
		});
	}
	
	@Parameter(value=0)
	public int[] nums;
	
	@Parameter(value=1)
	public int expected;

	@Test
	public void test() {
		assertEquals(expected, P152_MaximumProductSubarray.maxProduct(nums));
	}

}
