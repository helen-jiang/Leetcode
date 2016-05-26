/**
 * 
 */
package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiang.wen
 *
 */
public class P212_WordSearchII {
	
	protected static class TrieNode{
		protected TrieNode[] children;
		protected boolean isWord;
		public TrieNode(){
			this.children = new TrieNode[26];
			this.isWord = false;
		}
	}
	
	protected static class WordDict{
		protected TrieNode root;
		public WordDict(){
			this.root = new TrieNode();
		}
		public void addWord(String word){
			char[] w = word.toCharArray();
			TrieNode current = this.root;
			for(char c:w){
				if(current.children[c-'a']==null) current.children[c-'a'] = new TrieNode();
				current = current.children[c-'a'];
			}
			current.isWord = true;
		}
	}
	
    public static List<String> findWords(char[][] board, String[] words) {
    	List<String> list = new ArrayList<String>();
    	if(board.length==0 || board[0].length==0 || words.length==0) return list;
    	int h = board.length, w = board[0].length;
    	WordDict wd = new WordDict();
    	for(String word:words) wd.addWord(word);
    	for(int i=0;i<h;i++){
    		for(int j=0;j<w;j++){
    			List<String> sub = findWords(board, i, j, wd.root);
    			for(String s:sub) list.add(s);
    		}
    	}
    	return list;
    }
    
    private static List<String> findWords(char[][] board, int i, int j, TrieNode root){
    	List<String> list = new ArrayList<String>();
    	if(board[i][j]=='*' || root.children[board[i][j]-'a']==null) return list;
    	else {
    		char c = board[i][j];
    		board[i][j] = '*';
    		if(root.children[c-'a'].isWord==true) {
    			list.add(""+c);
    			root.children[c-'a'].isWord = false;
    		}
    		if(i>0){
    			List<String> sub = findWords(board, i-1, j, root.children[c-'a']);
    			for(String s:sub) list.add("" + c + s);
    		}
    		if(j>0){
    			List<String> sub = findWords(board, i, j-1, root.children[c-'a']);
    			for(String s:sub) list.add("" + c + s);
    		}
    		if(i<board.length-1){
    			List<String> sub = findWords(board, i+1, j, root.children[c-'a']);
    			for(String s:sub) list.add("" + c + s);
    		}
    		if(j<board[i].length-1){
    			List<String> sub = findWords(board, i, j+1, root.children[c-'a']);
    			for(String s:sub) list.add("" + c + s);
    		} 
    		board[i][j] = c;
    	} 
    	return list;
    }
}
