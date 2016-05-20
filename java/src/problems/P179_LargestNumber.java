/**
 * 
 */
package problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author jiang.wen
 *
 */
public class P179_LargestNumber {

    public static String largestNumber(int[] nums) {
    	List<String> list = new ArrayList<String>();
    	for(int i:nums) list.add(Integer.toString(i));
    	list.sort(new Comparator<String>(){

			@Override
			public int compare(String s1, String s2) {
				if(s1.charAt(0)==s2.charAt(0) && s1.length()!=s2.length()){
					String temp = s1;
					s1 = s1 + s2;
					s2 = s2 + temp;
				}
				return -s1.compareTo(s2);
			}
    		
    	});
    	if(list.get(0).equals("0")) return "0";
    	String res = "";
    	for(String s:list) res += s;
        return res;
    }
}
