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
public class P282_ExpressionAddOperators_Test {
	
	@Parameters(name = "P282_ExpressionAddOperators_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{"123", 6, Arrays.asList(new String[]{"1+2+3", "1*2*3"})},
				{"232", 8, Arrays.asList(new String[]{"2*3+2", "2+3*2"})},
				{"105", 5, Arrays.asList(new String[]{"1*0+5","10-5"})},
				{"00", 0, Arrays.asList(new String[]{"0+0", "0-0", "0*0"})},
				{"3456237490", 9191, Arrays.asList(new String[]{})},
		});
	}
	
	@Parameter(value=0)
	public String num;
	
	@Parameter(value=1)
	public int target;
	
	@Parameter(value=2)
	public List<String> expected;

	@Test
	public void test() {
		assertEquals(expected, P282_ExpressionAddOperators.addOperators(num, target));
	}

}
