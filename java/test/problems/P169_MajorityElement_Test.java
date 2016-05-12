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
public class P169_MajorityElement_Test {
	
	@Parameters(name = "P169_MajorityElement_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new int[]{1}, 1},
				{new int[]{1,1}, 1},
				{new int[]{1,1,2}, 1},
				{new int[]{1,1,1,2}, 1},
		});
	}
	
	@Parameter(value=0)
	public int[] nums;
	
	@Parameter(value=1)
	public int expected;

	@Test
	public void test() {
		assertEquals(expected, P169_MajorityElement.majorityElement(nums));
		assertEquals(expected, P169_MajorityElement.majorityElement_Vote(nums));
	}

}
