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
public class P200_NumberOfIslands_Test {
	
	@Parameters(name = "P200_NumberOfIslands_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new char[][]{{'1','1','1','1','0'}, {'1','1','0','1','0'}, {'1','1','0','0','0'}, {'0','0','0','0','0'}}, 1},
				{new char[][]{{'1','1','0','0','0'}, {'1','1','0','0','0'}, {'0','0','1','0','0'}, {'0','0','0','1','1'}}, 3},
				{new char[][]{{'1','0','1','0','0'}, {'1','0','0','0','0'}, {'1','1','1','1','0'}, {'0','0','0','0','1'}}, 3}
		});
	}
	
	@Parameter(value=0)
	public static char[][] grid;
	
	@Parameter(value=1)
	public int expected;

	@Test
	public void test() {
		assertEquals(expected, P200_NumberOfIslands.numIslands(grid));
	}

}
