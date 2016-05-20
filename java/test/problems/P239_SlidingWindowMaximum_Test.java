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
public class P239_SlidingWindowMaximum_Test {
	
	@Parameters(name = "P239_SlidingWindowMaximum_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new int[]{1,3,-1,-3,5,3,6,7}, 3, new int[]{3,3,5,5,6,7}},
				{new int[]{}, 0, new int[]{}},
				{new int[]{1,-1}, 1, new int[]{1,-1}},
				{new int[]{7,2,4}, 2, new int[]{7,4}},
				{new int[]{9,10,9,-7,-4,-8,2,-6}, 5, new int[]{10,10,9,2}}
		});
	}
	
	@Parameter(value=0)
	public int[] nums;
	
	@Parameter(value=1)
	public int k;
	
	@Parameter(value=2)
	public int[] expected;

	@Test
	public void test() {
		assertArrayEquals(expected, P239_SlidingWindowMaximum.maxSlidingWindow(nums, k));
	}

}
