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
public class P132_PalindromePartitioningII_Test {
	
	@Parameters(name = "P132_PalindromePartitioningII_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{"aab", 1}
		});
	}
	
	@Parameter(value=0)
	public String s;
	
	@Parameter(value=1)
	public int expected;

	@Test
	public void test() {
		assertEquals(expected, P132_PalindromePartitioningII.minCut(s));
	}
}
