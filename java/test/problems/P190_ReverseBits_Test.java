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
public class P190_ReverseBits_Test {
	
	@Parameters(name = "P190_ReverseBits_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{43261596, 964176192}
		});
	}
	
	@Parameter(value=0)
	public int n;
	
	@Parameter(value=1)
	public int expected;

	@Test
	public void test() {
		assertEquals(expected, P190_ReverseBits.reverseBits(n));
	}

}
