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
public class P054_SpiralMatrix_Test {
	
	@Parameters(name = "P054_SpiralMatrix_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new int[][]{}, Arrays.asList()},
				{new int[][]{{1}}, Arrays.asList(1)},
				{new int[][]{{1, 2}, {3, 4}}, Arrays.asList(1, 2, 4, 3)},
				{new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5)},
				{new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}, Arrays.asList(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10)},
				{new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}, Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)},
				{new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}, Arrays.asList(1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8)},
		});
	}
	
	@Parameter(value=0)
	public int[][] matrix;
	
	@Parameter(value=1)
	public List<Integer> expected;

	@Test
	public void test() {
		assertEquals(expected, P054_SpiralMatrix.spiralOrder(matrix));
	}

}
