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
public class P318_MaximumProductOfWordLengths_Test {
	
	@Parameters(name = "P318_MaximumProductOfWordLengths_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new String[]{}, 0},
				{new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}, 16},
				{new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"}, 4},
				{new String[]{"a", "aa", "aaa", "aaaa"}, 0}
		});
	}
	
	@Parameter(value=0)
	public String[] words;
	
	@Parameter(value=1)
	public int expected;

	@Test
	public void test() {
		assertEquals(expected, P318_MaximumProductOfWordLengths.maxProduct(words));
	}

}
