/**
 * 
 */
package utils.data;

/**
 * @author jiang.wen
 *
 */
public class DataConvert {
	
	public static char[][] convertStringArrayToCharMatrix(String[] ss){
		if(ss.length==0) return new char[0][0];
		int h = ss.length, w = ss[0].length();
		char[][] cc = new char[h][w];
		for(int i=0;i<h;i++) cc[i] = ss[i].toCharArray();
		return cc;
	}
}
