/**
 * 
 */
package problems;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author jiang.wen
 *
 */
public class P211_AddAndSearchWordDataStructureDesign_Test {

	@Test
	public void test01() {
		P211_AddAndSearchWordDataStructureDesign wordDict = new P211_AddAndSearchWordDataStructureDesign();
		wordDict.addWord("bad");
		wordDict.addWord("dad");
		wordDict.addWord("mad");
		assertEquals(true, wordDict.search("bad"));
		assertEquals(true, wordDict.search("dad"));
		assertEquals(true, wordDict.search("mad"));
		assertEquals(false, wordDict.search("pad"));
		assertEquals(true, wordDict.search(".ad"));
		assertEquals(true, wordDict.search("b.."));
		assertEquals(false, wordDict.search("ba"));
	}
	
	@Test
	public void test02() {
		P211_AddAndSearchWordDataStructureDesign wordDict = new P211_AddAndSearchWordDataStructureDesign();
		wordDict.addWord("a");
		wordDict.addWord("ab");
		assertEquals(true, wordDict.search("a"));
		assertEquals(true, wordDict.search("a."));
		assertEquals(true, wordDict.search("ab"));
		assertEquals(false, wordDict.search(".a"));
		assertEquals(true, wordDict.search(".b"));
		assertEquals(false, wordDict.search("ab."));
		assertEquals(true, wordDict.search("."));
	}

}
