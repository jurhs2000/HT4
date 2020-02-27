/**
 * Esta clase abstracta implementa tanto a List<E> como a Stack<E>
 * para poder ser utilizada en la calculadora junto a todos los
 * demas tipos de estructuras de datos que devuelve el factory
 * 
 * @author Julio Herrera
 * @author Jose Hurtarte
 */
public abstract class abstractList<E> implements List<E>, Stack<E>{

	/**
	 * Constructor
	 */
	public abstractList() {}

	/**
    * Para verificar si una lista esta vacia
    * @return regresa true si la pila esta vacia
    */
	public boolean isEmpty()
	// post: returns true iff list has no elements
	{
		return size() == 0;
	}

	/**
	 * Verifica si la lista contiene el elemento indicado
	 * @param value el elemento del tipo generico que se comprobara si esta
	 * @return si sí está, devuelve true
	 * @pre value no debe de ser null
	 * @post true si la lista contiene un objeto igual al valor
	 */
	public boolean contains(E value) {
		return -1 != indexOf(value);
	}
	
	/**
    * Para verificar si una lista esta vacia
    * @return regresa true si la pila esta vacia
    */
	public boolean empty() {
		return size() == 0;
	}
	
}