/**
 * http://leetcode.com/problems/lru-cache/
 */
package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiang.wen
 *
 */
public class P146_LRUCache {
	
	protected class DoubleLinkedNode{
		
		protected int val;
		protected int key;
		protected DoubleLinkedNode pre;
		protected DoubleLinkedNode next;
		
		protected DoubleLinkedNode(int x, int y){
			this.val = x;
			this.key = y;
		}
	}
		
	private Map<Integer, DoubleLinkedNode> map;
	private DoubleLinkedNode head;
	private DoubleLinkedNode tail;
	private int capacity;
	    
    public P146_LRUCache(int capacity) {
    	this.map = new HashMap<Integer, DoubleLinkedNode>();
    	this.head = new DoubleLinkedNode(0,0);
    	this.tail = new DoubleLinkedNode(0,0);
    	this.head.next = this.tail;
    	this.tail.pre = this.head;
    	this.capacity = capacity;
    }
    
    public int get(int key) {
        DoubleLinkedNode node = this.map.get(key);
        if(node==null) return -1;
        else {
        	this.moveToHead(node);
        	return node.val;
        }
    }
    
    public void set(int key, int value) {
		DoubleLinkedNode node = this.map.get(key);
    	if(node==null){
        	if(this.capacity==0) {
        		this.removeFromTail();
        		this.capacity++;
        	}
    		node = new DoubleLinkedNode(value, key);
            this.map.put(key, node);
            this.capacity--;
    	} else{
    		node.val = value;
    	}
        this.moveToHead(node);
    }
    
    private void moveToHead(DoubleLinkedNode node){
    	if(node.pre!=null && node.next!=null){
    		node.pre.next = node.next;
    		node.next.pre = node.pre;
    	}
    	node.next = this.head.next;
    	this.head.next = node;
    	node.next.pre = node;
    	node.pre = this.head;
    }
    
    private void removeFromTail(){
    	DoubleLinkedNode node  = this.tail.pre;
    	node.pre.next = this.tail;
    	this.tail.pre = node.pre;
    	node.pre = null;
    	node.next = null;
    	map.remove(node.key);
    	
    }
}
