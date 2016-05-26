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
public class P097_InterleavingString_Test {
	
	@Parameters(name = "P097_InterleavingString_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{"aabcc", "dbbca", "aadbbcbcac", true},		//TC_01
				{"aabcc", "dbbca", "aadbbbaccc", false},	//TC_02
				{"aabc", "dbbca", "aadbbcbca", true}		//TC_03
		});
	}
	
	@Parameter(value=0)
	public String s1;
	
	@Parameter(value=1)
	public String s2;
	
	@Parameter(value=2)
	public String s3;
	
	@Parameter(value=3)
	public boolean expected;

	@Test
	public void test() {
		assertEquals(expected, P097_InterleavingString.isInterleave(s1, s2, s3));
	}

}
