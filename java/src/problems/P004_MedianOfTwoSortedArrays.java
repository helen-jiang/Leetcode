/**
 * 
 */
package problems;

/**
 * @author jiang.wen
 *
 */
public class P004_MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int m = nums1.length, n = nums2.length;
    	int i=0, j=0;
    	int mid = (m+n-1)/2;
    	double median1=0, median2=0;
    	while(i+j<=mid){
    		if(i<m && j<n){
    			if(nums1[i]<=nums2[j]) median1=nums1[i++];
    			else median1=nums2[j++];
    		} else if(i<m) median1=nums1[i++];
    		else if(j<n) median1=nums2[j++];
    		else break;
    	}
    	if((m+n)%2==1) median2 = median1;
    	else {
    		if(i<m && j<n){
    			if(nums1[i]<=nums2[j]) median2=nums1[i++];
    			else median2=nums2[j++];
    		} else if(i<m) median2=nums1[i++];
    		else if(j<n) median2=nums2[j++];
    	}
        return (median1+median2)/2;
    }
}
