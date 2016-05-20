/**
 * 
 */
package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jiang.wen
 *
 */
public class P030_SubstringWithConcatenationOfAllWords {

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<Integer>();
    	if(words.length==0 || words[0].length()==0) return list;
    	int wordCount = words.length, wordLen = words[0].length(), totalLen = wordLen * wordCount;
    	int n = s.length();
    	if(n<totalLen) return list;
    	Map<String, Integer> wordsSet = new HashMap<String, Integer>();
    	for(int i=0;i<words.length;i++) {
    		Integer count = wordsSet.get(words[i]);
    		if(count==null) count=0;
    		wordsSet.put(words[i], count+1);
    	}
    	for(int t=0;t<wordLen;t++){
			Map<String, List<Integer>> existing = new HashMap<String, List<Integer>>();
	    	int i=t, existingWordCount = 0;
	    	while(i<=n-totalLen){
	    		if(existingWordCount==wordCount){
	    			list.add(i);
	    			existing.get(s.substring(i, i+wordLen)).remove(0);
	    			existingWordCount--;
	    			i+=wordLen;
	    		} else {
	    			int curLen = wordLen * existingWordCount;
		    		for(int j=i+curLen;j<i+totalLen;j+=wordLen){
		    			String current = s.substring(j, j+wordLen);
		    			Integer count = wordsSet.get(current);
		    			if(count!=null){
		    				List<Integer> pList = existing.get(current);
		    				if(pList==null){
		    					pList = new ArrayList<Integer>();
		    					pList.add(j);
		    					existing.put(current, pList);
		    					existingWordCount++;
		    				} else {
		    					int curCount = pList.size();
		    					if(curCount>=count){
		    						int p = pList.remove(0);
		    						pList.add(j);
			    					for(int x=i;x<p;x+=wordLen) {
			    						existing.get(s.substring(x, x+wordLen)).remove(0);
			    						existingWordCount--;
			    					}
			    					i = p+wordLen; 
			    					break;
		    					} else {
		    						pList.add(j);
			    					existingWordCount++;
		    					}
		    				}
		    			} else {
		    				existing.clear();
		    				existingWordCount = 0;
		    				i=j+wordLen;
		    				break;
		    			}
		    		}
	    		}
	    	}
    	}
        return list;
    }
}
