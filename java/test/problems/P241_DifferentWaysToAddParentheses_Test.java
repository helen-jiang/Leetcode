/**
 * 
 */
package problems;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
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
				{"2-1-1", Arrays.asList(0,2)},
				{"2*3-4*5", Arrays.asList(-34, -14, -10, -10, 10)}
		});
	}
	
	@Parameter(value=0)
	public String input;
	
	@Parameter(value=1)
	public List<Integer> expected;
	
	@Test
	public void test() {
		List<Integer> res = P241_DifferentWaysToAddParentheses.diffWaysToCompute(input);
		res.sort(new Comparator<Integer>(){

			@Override
			public int compare(Integer i, Integer j) {
				// TODO Auto-generated method stub
				return i.compareTo(j);
			}
			
		});
		assertEquals(expected, res);
	}

}
