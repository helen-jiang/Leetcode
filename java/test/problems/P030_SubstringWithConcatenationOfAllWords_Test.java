/**
 * 
 */
package problems;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
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
public class P030_SubstringWithConcatenationOfAllWords_Test {
	
	@Parameters(name = "P030_SubstringWithConcatenationOfAllWords_TC_{index}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{"barfoothefoobarman", new String[]{"bar", "foo"}, Arrays.asList(0,9)},
				{"barfoobarfoobarman", new String[]{"bar", "foo"}, Arrays.asList(0,3,6,9)},
				{"barfoobarfoobarman", new String[]{"bar", "foo", "man"}, Arrays.asList(9)},
				{"barfoofoobarthefoobarman", new String[]{"bar","foo","the"}, Arrays.asList(6,9,12)},
				{"testleetcodetestleet", new String[]{"leet", "code"}, Arrays.asList(4)},
				{"wordgoodgoodgoodbestword", new String[]{"word","good","best","good"}, Arrays.asList(8)},
				{"lingmindraboofooowingdingbarrwingmonkeypoundcake", new String[]{"fooo","barr","wing","ding","wing"}, Arrays.asList(13)},
				{"aaaaaaaa", new String[]{"aa","aa","aa"}, Arrays.asList(0,1,2)}
		});
	}
	
	@Parameter(value=0)
	public String s;
	
	@Parameter(value=1)
	public String[] words;
	
	@Parameter(value=2)
	public List<Integer> expected;

	@Test
	public void test() {
		List<Integer> res = P030_SubstringWithConcatenationOfAllWords.findSubstring(s, words);
		res.sort(new Comparator<Integer>(){
			@Override
			public int compare(Integer i, Integer j) {
				// TODO Auto-generated method stub
				return i.compareTo(j);
			}
			
		});
		assertEquals(expected, res);
	}

}
