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
public class P131_PalindromePartitioning_Test {
	
	@Parameters(name = "P131_PalindromePartitioning_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{"aab", Arrays.asList(Arrays.asList("aa", "b"), Arrays.asList("a", "a", "b"))}
		});
	}
	
	@Parameter(value=0)
	public String s;
	
	@Parameter(value=1)
	public List<List<String>> expected;

	@Test
	public void test() {
		assertEquals(expected, P131_PalindromePartitioning.partition(s));
	}

}
