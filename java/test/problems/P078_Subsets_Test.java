/**
 * 
 */
package problems;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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
public class P078_Subsets_Test {
	
	/***NOT DONE***/

	@Parameters(name = "P078_Subsets_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new int[]{1,2,3}, Arrays.asList(new int[][]{{},{1},{2},{1,2},{3},{1,3},{2,3},{1,2,3}})}
		});
	}
	
	@Parameter(value=0)
	public int[] nums;
	
	@Parameter(value=1)
	public List<List<Integer>> expected;	
	
	@Test
	public void test() {
		assertEquals(expected, P078_Subsets.subsets(nums));
	}

}
