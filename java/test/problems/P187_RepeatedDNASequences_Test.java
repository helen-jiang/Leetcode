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
public class P187_RepeatedDNASequences_Test {

	@Parameters(name = "P187_RepeatedDNASequences_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{"AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT", Arrays.asList(new String[]{"AAAAACCCCC", "CCCCCAAAAA"})},
				{"AAAAAAAAAAA", Arrays.asList(new String[]{"AAAAAAAAAA"})},
		});
	}
	
	@Parameter(value=0)
	public String s;
	
	@Parameter(value=1)
	public List<String> expected;
	
	@Test
	public void test() {
		assertEquals(expected, P187_RepeatedDNASequences.findRepeatedDnaSequences(s));
	}

}
