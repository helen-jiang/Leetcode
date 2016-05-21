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
public class P306_AdditiveNumber_Test {
	
	@Parameters(name = "P306_AdditiveNumber_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{"112358", true},
				{"199100199", true},
				{"0112358", true},
				{"1090100199", false},
				{"1090100190", true}
		});
	}
	
	@Parameter(value=0)
	public String num;
	
	@Parameter(value=1)
	public boolean expected;

	@Test
	public void test() {
		assertEquals(expected, P306_AdditiveNumber.isAdditiveNumber(num));
	}

}
