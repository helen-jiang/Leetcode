/**
 * 
 */
package problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jiang.wen
 *
 */
public class P211_AddAndSearchWordDataStructureDesign {
	
	protected class TrieNode{
		protected TrieNode[] children;
		protected boolean isWord;
		public TrieNode(){
			this.children = new TrieNode[26];
			this.isWord = false;
		}
		public boolean search(String word){
			if(word.equals("")) return this.isWord==true;
			char c = word.charAt(0);
			String remainig = word.substring(1);
			if(c!='.') return this.children[c-'a']!=null && this.children[c-'a'].search(remainig);
			else {
				for(TrieNode node:this.children){
					if(node!=null && node.search(remainig)==true) return true;
				}
				return false;
			}
		}
	}
	
	private TrieNode root;
	
	public P211_AddAndSearchWordDataStructureDesign(){
		this.root = new TrieNode();
	}

    // Adds a word into the data structure.
    public void addWord(String word) {
    	char[] w = word.toCharArray();
    	TrieNode current = this.root;
    	for(char c:w){
    		if(current.children[c-'a']==null) current.children[c-'a'] = new TrieNode();
    		current = current.children[c-'a'];
    	}
    	current.isWord = true;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
    	return this.root.search(word);
    }

}
