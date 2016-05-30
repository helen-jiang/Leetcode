/**
 * 
 */
package problems;

import java.util.List;
import java.util.ArrayList;

/**
 * @author jiang.wen
 *
 */
public class P131_PalindromePartitioning {
	
    public static List<List<String>> partition(String s) {
        char[] ss = s.toCharArray();
        int n = ss.length;
        boolean[][] isPalindrome = new boolean[n][n];
        List<List<String>>[] res = new List[n+1];
        res[0] = new ArrayList<List<String>>();
        res[0].add(new ArrayList<String>());
        for(int j=0;j<n;j++){
            res[j+1] = new ArrayList<List<String>>();
        	for(int i=0;i<=j;i++){
        		if(ss[i]==ss[j] && ((i+1)>(j-1) || isPalindrome[i+1][j-1])) {
        			isPalindrome[i][j] = true;
        			for(List<String> list:res[i]){
        				List<String> new_list = new ArrayList<String>(list);
        				new_list.add(s.substring(i, j+1));
        				res[j+1].add(new_list);
        			}
        		}        			
        	}
        }
        return res[n];
    }

//    public static List<List<String>> partition(String s) {
//        List<List<String>> total_list = new ArrayList<List<String>>();
//        int len = s.length();
//        if(len==0) return total_list;
//        if(isPalindrome(s)){
//        	List<String> list = new ArrayList<String>();
//        	list.add(s);
//        	total_list.add(list);
//        }
//        for(int i=len-1;i>0;i--){
//        	String tail = s.substring(i);
//        	if(isPalindrome(tail)){
//        		String head = s.substring(0, i);
//        		List<List<String>> sub_list = partition(head);
//        		for(List<String> list:sub_list){
//        			list.add(tail);
//        			total_list.add(list);
//        		}
//        	}
//        }
//        return total_list;
//    }
//    
//    private static boolean isPalindrome(String s){
//    	int i=0, j=s.length()-1;
//    	while(i<j){
//    		if(s.charAt(i)!=s.charAt(j)) return false;
//    		i++;
//    		j--;
//    	}
//    	return true;
//    }
}
