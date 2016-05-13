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
public class P241_DifferentWaysToAddParentheses_Test {

	@Parameters(name = "P241_DifferentWaysToAddParentheses_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{"2-1-1", new Integer[]{0,2}},
				{"2*3-4*5", new Integer[]{-34, -14, -10, -10, 10}}
		});
	}
	
	@Parameter(value=0)
	public String input;
	
	@Parameter(value=1)
	public Integer[] expected;
	
	@Test
	public void test() {
		List<Integer> res = P241_DifferentWaysToAddParentheses.diffWaysToCompute(input);
		Integer[] resArray = res.toArray(new Integer[res.size()]);
		Arrays.sort(resArray);
		assertArrayEquals(expected, resArray);
	}

}
