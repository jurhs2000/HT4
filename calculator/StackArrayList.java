/**
 * Implementacion de Stack<E> utilizando ArrayList
 *
 * Parte del codigo obtenida por medio del capitulo 9
 * "Lists'Bailey, D. (2007). Java Structures. New York: McGraw-Hill"
 * Modificaciones de metodos, logica, implementaciones, estructura, etc
 * @author Julio Herrera
 * @author Jose Hurtarte
 */
import java.util.ArrayList;

public class StackArrayList<E> extends AbstractStack<E> {
	/**
	 * Estructura de datos para almacenar la informacion
	 * tambien utiliza generics al arraylist
	 */
	protected ArrayList<E> data;


	/**
	 * Constructor para un stack vacio
	 */
	public StackArrayList() {
		data = new ArrayList<E>();
	}

	/**
    * Insertar un elemento
    * @param item el elemento que se va a insertar
    * @pre el item es agregado al estack. Sera el proximo en salir
    */
	public void push(E item) {
		data.add(item);
	}

	/**
    * para eliminar el ultimo elemento y obtenerlo al mismo tiempo
    * @return el ultimo elemento de la pila, el elemnto que se elimino
    * @pre stack no esta vacio
    * @post el elemento ingresado mas recientemente es retirado
    */
	public E pop() {
		return data.remove(size()-1);
	}

	/**
    * Para obtener el ultimo elemento de la pila
    * @return El ultimo elemento de la pila
    * @pre stack no esta vacio
    * @post el valor mas reciente es retornado pero no es eliminado
    */
	public E peek() {
		return data.get(size() - 1);
	}
	
	/**
    * para conocer el tamaño de la pila
    * @return la cantidad de elementos en la pila
    */
	public int size() {
		return data.size();
	}
  
	
}