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
public class P315_CountOfSmallerNumbersAfterSelf_Test {
	
	@Parameters(name = "P315_CountOfSmallerNumbersAfterSelf_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new int[]{5, 2, 6, 1}, Arrays.asList(2, 1, 1, 0)}
		});
	}
	
	@Parameter(value=0)
	public static int[] nums;
	
	@Parameter(value=1)
	public static List<Integer> expected;

	@Test
	public void test() {
		assertEquals(expected, P315_CountOfSmallerNumbersAfterSelf.countSmaller(nums));
	}

}
