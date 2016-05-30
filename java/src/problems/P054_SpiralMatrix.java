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
public class P054_SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        if(matrix.length==0 || matrix[0].length==0) return list;
        int startX=0, endX=matrix.length-1, startY=0, endY=matrix[0].length-1;
        while(startX<=endX && startY<=endY){
        	if(startX==endX && startY==endY){
        		list.add(matrix[startX][startY]); 
        	} else if(startX==endX){
        		for(int i=startY;i<=endY;i++) list.add(matrix[startX][i]);
        	} else if(startY==endY){
        		for(int i=startX;i<=endX;i++) list.add(matrix[i][startY]);
        	} else {
	        	int i=startX, j=startY;
	        	do{
	        		if(i==startX && j<endY) list.add(matrix[i][j++]);
	        		else if(j==endY && i<endX) list.add(matrix[i++][j]);
	        		else if(i==endX && j>startY) list.add(matrix[i][j--]);
	        		else if(j==startY && i>startX) list.add(matrix[i--][j]);
	        	} while(i!=startX || j!=startY);
        	}
        	startX++;
        	startY++;
        	endX--;
        	endY--;
        }
        return list;
    }
}
