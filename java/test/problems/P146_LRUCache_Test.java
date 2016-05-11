/**
 * 
 */
package problems;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author jiang.wen
 *
 */
public class P146_LRUCache_Test {

	@Test
	public void P146_LRUCache_TC_1() {
		P146_LRUCache cache = new P146_LRUCache(1);
		cache.set(2, 1);
		assertEquals(1, cache.get(2));
		cache.set(3, 2);
		assertEquals(-1, cache.get(2));
		assertEquals(2, cache.get(3));
	}

	@Test
	public void P146_LRUCache_TC_2() {
		P146_LRUCache cache = new P146_LRUCache(2);
		assertEquals(-1, cache.get(2));
		cache.set(2, 6);
		assertEquals(-1, cache.get(1));
		cache.set(1, 5);
		cache.set(1, 2);
		assertEquals(2, cache.get(1));
		assertEquals(6, cache.get(2));
	}

}
