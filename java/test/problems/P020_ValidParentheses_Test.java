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
public class P020_ValidParentheses_Test {
	
	@Parameters(name = "P020_ValidParentheses_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{"()", true},
				{"()[]{}", true},
				{"(]", false},
				{"([)]", false}
		});
	}
	
	@Parameter(value=0)
	public String s;
	
	@Parameter(value=1)
	public boolean expected;

	@Test
	public void test() {
		assertEquals(expected, P020_ValidParentheses.isValid(s));
	}

}
