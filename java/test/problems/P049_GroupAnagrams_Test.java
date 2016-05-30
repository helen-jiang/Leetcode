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
public class P049_GroupAnagrams_Test {
	
	@Parameters(name = "P049_GroupAnagrams_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}, Arrays.asList(Arrays.asList("ate", "eat","tea"), Arrays.asList("bat"), Arrays.asList("nat","tan"))}
		});
	}
	
	@Parameter(value=0)
	public String[] strs;
	
	@Parameter(value=1)
	public List<List<String>> expected;

	@Test
	public void test() {
		assertEquals(expected, P049_GroupAnagrams.groupAnagrams(strs));
	}

}
