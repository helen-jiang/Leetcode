/**
 * 
 */
package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jiang.wen
 *
 */
public class P049_GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
    	Map<String, List<String>> map = new HashMap<String, List<String>>();
    	for(String s:strs){
    		String key = convert(s);
    		List<String> list = map.get(key);
    		if(list==null) list = new ArrayList<String>();
    		addToList(list, s);
    		map.put(key, list);
    	}
        return new ArrayList<List<String>>(map.values());
    }
    
    private static void addToList(List<String> list, String s){
    	int lo=0, hi=list.size();
    	while(lo<hi){
    		int mid = lo+(hi-lo)/2;
    		if(s.compareTo(list.get(mid))>0) lo=mid+1;
    		else hi=mid;
    	}
    	list.add(lo, s);
    }
    
    private static String convert(String s){
    	char[] ss = s.toCharArray();
    	Arrays.sort(ss);
    	return String.valueOf(ss);
    }
}
