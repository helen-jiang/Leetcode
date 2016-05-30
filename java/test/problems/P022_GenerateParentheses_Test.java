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
public class P022_GenerateParentheses_Test {
	
	@Parameters(name = "P022_GenerateParentheses_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{1, Arrays.asList("()")},
				{2, Arrays.asList("(())","()()")},
				{3, Arrays.asList("((()))","(()())","(())()","()(())","()()()")},
				{4, Arrays.asList("(((())))","((()()))","((())())","((()))()","(()(()))","(()()())","(()())()","(())(())","(())()()","()((()))","()(()())","()(())()","()()(())","()()()()")},
		});
	}
	
	@Parameter(value=0)
	public int n;
	
	@Parameter(value=1)
	public List<String> expected;

	@Test
	public void test() {
		assertEquals(expected, P022_GenerateParentheses.generateParenthesis(n));
	}

}
