/**
 * http://leetcode.com/problems/repeated-dna-sequences/
 */
package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author jiang.wen
 *
 */
public class P187_RepeatedDNASequences {
	
    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<String>();
        int n = s.length();
        if(n<=10) return list;
        Set<String> once = new HashSet<String>();
        Set<String> twice = new HashSet<String>();
        for(int i=0;i<=n-10;i++){
        	String c = s.substring(i, i+10);
        	if(!once.add(c) && twice.add(c)) list.add(c);
        }
        return list;
    }
    
    // Take a look at this solution later
    // http://leetcode.com/discuss/24478/i-did-it-in-10-lines-of-c
}
