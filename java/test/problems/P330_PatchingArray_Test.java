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
public class P330_PatchingArray_Test {
	
	@Parameters(name = "P330_PatchingArray_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new int[]{1,3}, 6, 1},
				{new int[]{1,5,10}, 20, 2},
				{new int[]{1,2,2}, 5, 0},
				{new int[]{1,2,31,33}, 2147483647, 28}
		});
	}
	
	@Parameter(value=0)
	public int[] nums;
	
	@Parameter(value=1)
	public int n;
	
	@Parameter(value=2)
	public int expected;

	@Test
	public void test() {
		assertEquals(expected, P330_PatchingArray.minPatches(nums, n));
	}

}
