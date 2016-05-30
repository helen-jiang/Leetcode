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
public class P215_KthLargestElementInAnArray_Test {
	
	@Parameters(name = "P215_KthLargestElementInAnArray_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new int[]{3,2,1,5,6,4}, 2, 5},
				{new int[]{3}, 1, 3},
				{new int[]{3, 2}, 2, 2},
				{new int[]{3, 2, 7}, 2, 3}
		});
	}
	
	@Parameter(value=0)
	public int[] nums;
	
	@Parameter(value=1)
	public int k;
	
	@Parameter(value=2)
	public int expected;

	@Test
	public void test() {
		assertEquals(expected, P215_KthLargestElementInAnArray.findKthLargest(nums, k));
	}

}
