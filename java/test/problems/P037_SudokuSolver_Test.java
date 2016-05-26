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
public class P037_SudokuSolver_Test {

	@Parameters(name = "P037_SudokuSolver_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new String[]{"53..7....","6..195...",".98....6.","8...6...3","4..8.3..1","7...2...6",".6....28.","...419..5","....8..79"}, new String[]{"534678912","672195348","198342567","859761423","426853791","713924856","961537284","287419635","345286179"}},
				{new String[]{"..9748...","7........",".2.1.9...","..7...24.",".64.1.59.",".98...3..","...8.3.2.","........6","...2759.."}, new String[]{"519748632","783652419","426139875","357986241","264317598","198524367","975863124","832491756","641275983"}}
		});
	}
	
	@Parameter(value=0)
	public String[] boardStr;
	
	@Parameter(value=1)
	public String[] expectedStr;
	
	@Test
	public void test() {
		char[][] board = DataConvert.convertStringArrayToCharMatrix(boardStr);
		char[][] expected = DataConvert.convertStringArrayToCharMatrix(expectedStr);
		P037_SudokuSolver.solveSudoku(board);
		assertArrayEquals(expected, board);
	}

}
