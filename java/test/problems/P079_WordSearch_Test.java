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
public class P079_WordSearch_Test {

	@Parameters(name = "P079_WordSearch_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{new String[]{"ABCE","SFCS","ADEE"}, "ABCCED", true},
				{new String[]{"ABCE","SFCS","ADEE"}, "SEE", true},
				{new String[]{"ABCE","SFCS","ADEE"}, "ABCB", false},
		});
	}
	
	@Parameter(value=0)
	public String[] boardStr;
	
	@Parameter(value=1)
	public String word;
	
	@Parameter(value=2)
	public boolean expected;
	
	@Test
	public void test() {
		int n = boardStr.length;
		char[][] board = new char[n][n];
		for(int i=0;i<n;i++)
			board[i] = boardStr[i].toCharArray();
		assertEquals(expected, P079_WordSearch.exist(board, word));
	}

}
