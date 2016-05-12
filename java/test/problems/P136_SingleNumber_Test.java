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
public class P136_SingleNumber_Test {
	
	@Parameters(name = "P136_SingleNumber_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new int[]{1,2,3,2,3}, 1}
		});
	}
	
	@Parameter(value=0)
	public int[] nums;
	
	@Parameter(value=1)
	public int expected;

	@Test
	public void test() {
		assertEquals(expected, P136_SingleNumber.singleNumber(nums));
	}

}
