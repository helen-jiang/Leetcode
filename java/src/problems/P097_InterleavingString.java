/**
 * 
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P097_InterleavingString {
	
    public static boolean isInterleave(String s1, String s2, String s3) {
    	int n1 = s1.length(), n2 = s2.length(), n3 = s3.length();
    	if((n1+n2)!=n3) return false;
    	char[] c1 = s1.toCharArray(), c2 = s2.toCharArray(), c3 = s3.toCharArray();
    	// can[i][j] : isInterleave(s1.substring(0,i), s2.substring(0, j), s3.substring(0, i+j))
    	// can[i][j] = (i>1 && can[i-1][j] && s1.charAt(i-1)==s3.charAt(i+j-1)) || (j>1 && can[i][j-1] && s1.charAt(j-1)==s3.charAt(i+j-1)) 
    	boolean[][] can = new boolean[n1+1][n2+1]; 
    	can[0][0] = true;
    	for(int i=1;i<=n1;i++){
    		can[i][0] = can[i-1][0] && c1[i-1]==c3[i-1];
    	} 
		for(int j=1;j<=n2;j++){
			can[0][j] = can[0][j-1] && c2[j-1]==c3[j-1];
		}
    	for(int i=1;i<=n1;i++){
    		for(int j=1;j<=n2;j++){
    			can[i][j] = (can[i-1][j] && c1[i-1]==c3[i+j-1]) || (can[i][j-1] && c2[j-1]==c3[i+j-1]);
    		}
    	}    	
    	return can[n1][n2];
    }

//    public static boolean isInterleave(String s1, String s2, String s3) {
//    	int n1 = s1.length(), n2 = s2.length(), n3 = s3.length();
//    	if((n1+n2)!=n3) return false;
//    	char[] c1 = s1.toCharArray(), c2 = s2.toCharArray(), c3 = s3.toCharArray();
//    	// can[i][j] : isInterleave(s1.substring(0,i), s2.substring(0, j), s3.substring(0, i+j))
//    	// can[i][j] = (i>1 && can[i-1][j] && s1.charAt(i-1)==s3.charAt(i+j-1)) || (j>1 && can[i][j-1] && s1.charAt(j-1)==s3.charAt(i+j-1)) 
//    	boolean[][] can = new boolean[n1+1][n2+1]; 
//    	for(int i=0;i<=n1;i++){
//    		for(int j=0;j<=n2;j++){
//    			if(i==0&&j==0) can[i][j] = true;
//    			else can[i][j] = (i>0 && can[i-1][j] && c1[i-1]==c3[i+j-1]) || (j>0 && can[i][j-1] && c2[j-1]==c3[i+j-1]);
//    		}
//    	}    	
//    	return can[n1][n2];
//    }
}
