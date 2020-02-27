import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDataImplementations {

	
	/**
	 * Test con Pila tipo vector
	 */
	@Test
	void testVector() {
		CircularList<Integer> data = new CircularList<Integer>();
		
		data.push(2);
		data.push(67);
		data.push(34);
		data.push(4);
		data.push(3);
		data.pop();
		assertEquals(4, data.peek());
	}
	
	/**
	 * Test con Pila tipo StackArrayList
	 */
	@Test
	void testStackArrayList() {
		StackArrayList<Integer> data = new StackArrayList<Integer>();
		data.push(2);
		data.push(3);
		data.pop();
		assertEquals(2, data.peek());
	}
	
	/**
	 * Test con Lista tipo SinglyLinked
	 */
	@Test
	void testSinglyLinked() {
		SinglyLinkedList<Integer> data = new SinglyLinkedList<Integer>();
		data.push(2);
		data.push(3);
		data.pop();
		assertEquals(2, data.peek());
	}
	/**
	 * Test con Lista tipo DoublyLinked
	 */
	@Test
	void testDoublyLinked() {
		DoublyLinkedList<Integer> data = new DoublyLinkedList<Integer>();
		data.push(1);
		data.push(3);
		data.push(2);
		data.push(56);
		data.pop();
		assertEquals(2, data.peek());
	}
	
	/**
	 * Test con Lista tipo Circular
	 */
	@Test
	void testCircular() {
		CircularList<Integer> data = new CircularList<Integer>();
		data.push(1);
		data.push(3);
		data.push(44);
		data.push(56);
		data.pop();
		assertEquals(44, data.peek());
	}

}
