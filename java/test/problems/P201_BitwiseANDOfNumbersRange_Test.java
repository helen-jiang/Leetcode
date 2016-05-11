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
public class P201_BitwiseANDOfNumbersRange_Test {
	
    @Parameters(name = "P201_BitwiseANDOfNumbersRange_TC_{index}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
        		{ 5, 7, 4 }        		
        });
    }
    
    @Parameter(value=0)
    public int m;
    
    @Parameter(value=1)
    public int n;
    
    @Parameter(value=2)
    public int expected;
    

	@Test
	public void test() {
		assertEquals(this.expected, P201_BitwiseANDOfNumbersRange.rangeBitwiseAnd(m, n));
	}

}
