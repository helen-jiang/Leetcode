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
public class P260_SingleNumberIII_Test {

	@Parameters(name = "P260_SingleNumberIII_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new int[]{1,2,3,5,2,1}, new int[]{3,5}}
		});
	}
	
	@Parameter(value=0)
	public int[] nums;
	
	@Parameter(value=1)
	public int[] expected;
	
	@Test
	public void test() {
		int[] res = P260_SingleNumberIII.singleNumber(nums);
		Arrays.sort(res);
		assertArrayEquals(expected, res);
	}

}
