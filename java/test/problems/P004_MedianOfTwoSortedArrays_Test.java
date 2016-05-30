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
public class P004_MedianOfTwoSortedArrays_Test {

	@Parameters(name = "P004_MedianOfTwoSortedArrays_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new int[]{}, new int[]{}, 0},
				{new int[]{1}, new int[]{}, 1},
				{new int[]{}, new int[]{1}, 1},
				{new int[]{0}, new int[]{1}, 0.5},
				{new int[]{0, 1}, new int[]{1}, 1},
				{new int[]{0, 1}, new int[]{2, 2}, 1.5},
				{new int[]{0, 1, 1, 4, 7}, new int[]{2, 2, 5}, 2},
				{new int[]{0, 1, 1, 4, 7}, new int[]{2, 2, 5, 6}, 2},
		});
	}
	
	@Parameter(value=0)
	public int[] nums1;
	
	@Parameter(value=1)
	public int[] nums2;
	
	@Parameter(value=2)
	public double expected;
	
	@Test
	public void test() {
		assertEquals(expected, P004_MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2), 0.1);
	}

}
