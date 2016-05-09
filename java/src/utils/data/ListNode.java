/**
 * 
 */
package utils.data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiang.wen
 *
 */
public class ListNode {
	
	public int val;
	public ListNode next;
	
	public ListNode(int x){
		this.val = x;
	}

	public static Integer[] Serialize(ListNode head){
		List<Integer> list = new ArrayList<Integer>();
		while(head!=null){
			list.add(head.val);
			head = head.next;
		}
		return list.toArray(new Integer[list.size()]);
	}
	
	public static ListNode Deserialize(Integer[] nodes){
		if(nodes.length==0) return null;
		ListNode head = new ListNode(nodes[0]);
		ListNode current  = head;
		for(int i=1;i<nodes.length;i++){
			current.next = new ListNode(nodes[i]);
			current = current.next;
		}
		return head;
	}
}
