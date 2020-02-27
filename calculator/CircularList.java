/**
 * Parte del codigo obtenida por medio del capitulo 9
 * "Lists'Bailey, D. (2007). Java Structures. New York: McGraw-Hill"
 * Modificaciones de metodos, logica, implementaciones, estructura, etc
 * @author Julio Herrera
 * @author Jose Hurtarte
 */
import java.util.Iterator;

public class CircularList<E> extends abstractList<E>{

	protected Node<E> tail; 
	protected int count;

	public CircularList()
	// pre: constructs a new circular list
	{
		tail = null;
		count = 0;
	}

	public void addFirst(E value)
	// pre: value non-null
	// post: adds element to head of list
	{
		Node<E> temp = new Node<E>(value);
		if (tail == null) { // first value added
			tail = temp;
			tail.setNext(tail);
		} else { // element exists in list
			temp.setNext(tail.next());
			tail.setNext(temp);
		}
		count++;
	}

	// Necesario implementar para Stack
	public void addLast(E value)
	// pre: value non-null
	// post: adds element to tail of list
	{
		// new entry:
		addFirst(value);
		tail = tail.next();
	}
	/**
	 * 
	 */
	public void push(E value) {
		addLast(value);
	}

	/**
	 * 
	 */
	public E peek() {
		return tail.value();
	}

	// Necesario implementar para Stack

	public E removeLast()
	// pre: !isEmpty()
	// post: returns and removes value from tail of list
	{
		Node<E> finger = tail;
		while (finger.next() != tail) {
			finger = finger.next();
		}
		// finger now points to second-to-last value
		Node<E> temp = tail;
		if (finger == tail)
		{
			tail = null;
		} else {
			finger.setNext(tail.next());
			tail = finger;
		}
		count--;
		return temp.value();
	}
	
	public E pop() {
		return removeLast();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return null;
	}
	// Necesario implementar para Stack
	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(E value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(E value) {
		// TODO Auto-generated method stub

	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int i, E o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int i, E o) {
		// TODO Auto-generated method stub

	}

	@Override
	public E remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}