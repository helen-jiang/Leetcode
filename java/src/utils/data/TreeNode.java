/**
 * 
 */
package utils.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author jiang.wen
 *
 */
public class TreeNode {
	
	public int val;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode(int x){
		this.val = x;
	}
	
	public static Integer[] Serialize(TreeNode root){
		List<Integer> list = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while(!queue.isEmpty()){
			TreeNode current = queue.poll();
			if(current==null){
				list.add(null);
			} else {
				list.add(current.val);
				queue.offer(current.left);
				queue.offer(current.right);
			}
		}
		return list.toArray(new Integer[list.size()]);
	}
	
	public static TreeNode Deserialize(Integer[] nodes){
		if(nodes.length==0) return null;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode root = nodes[0]==null?null:new TreeNode(nodes[0]);
		queue.offer(root);
		int i = 1;
		while(i<nodes.length && !queue.isEmpty()){
			TreeNode current = queue.poll();
			if(current!=null){
				current.left = nodes[i]==null?null:new TreeNode(nodes[i]);
				queue.offer(current.left);
				current.right = ((i+1>=nodes.length)||nodes[i+1]==null)?null:new TreeNode(nodes[i+1]);
				queue.offer(current.right);
				i += 2;
			}
		}
		return root;
	}
}
