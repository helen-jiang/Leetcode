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

import utils.data.DataConvert;

/**
 * @author jiang.wen
 *
 */

@RunWith(Parameterized.class)
public class P036_ValidSudoku_Test {

	@Parameters(name = "P036_ValidSudoku_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new String[]{"53..7....","6..195...",".98....6.","8...6...3","4..8.3..1","7...2...6",".6....28.","...419..5","....8..79"}, true},
				{new String[]{"..9748...","7........",".2.1.9...","..7...24.",".64.1.59.",".98...3..","...8.3.2.","........6","...2759.."}, true}
		});
	}
	
	@Parameter(value=0)
	public String[] boardStr;
	
	@Parameter(value=1)
	public boolean expected;
	
	@Test
	public void test() {
		char[][] board = DataConvert.convertStringArrayToCharMatrix(boardStr);
		assertEquals(expected, P036_ValidSudoku.isValidSudoku(board));
	}

}
