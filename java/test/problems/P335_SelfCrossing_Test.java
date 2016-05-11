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
public class P335_SelfCrossing_Test {

    @Parameters(name = "P335_SelfCrossing_TC_{index}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
	             { new int[]{2,1,1,2}, true },
	             { new int[]{1,2,3,4}, false },
	             { new int[]{1,1,1,1}, true },
	             { new int[]{1,2,3,4,2,3}, true},
	             { new int[]{1,1,2,1,1}, true},
	             { new int[]{3,3,3,2,1,1}, false},
	             { new int[]{1,1,2,2,3,3,4,4,10,4,4,3,3,2,2,1,1}, false}             
        });
    }
    
    @Parameter(value=0)
    public int[] x;
    
    @Parameter(value=1)
    public boolean expected;

	@Test
	public void test() {
		assertEquals(this.expected, P335_SelfCrossing.isSelfCrossing(x));
	}

}
