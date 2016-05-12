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
public class P338_CountingBits_Test {
	
	@Parameters(name = "P338_CountingBits_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{5, new int[]{0,1,1,2,1,2}},
				{10, new int[]{0,1,1,2,1,2,2,3,1,2,2}}
		});
	}
	
	@Parameter(value=0)
	public int num;
	
	@Parameter(value=1)
	public int[] expected;

	@Test
	public void test() {
		assertArrayEquals(expected, P338_CountingBits.countBits(num));
	}

}
