/**
 * 
 * Interfaz de Stack con dato generico. Esta interfaz propone los metodos
 * basicos para insertar, eliminar, obtener y verificar el tamaño y si una
 * pila está vacía.s
 * 
 */
public interface Stack<E> {
   /**
    * Insertar un elemento
    * @param item el elemento que se va a insertar
    * @pre el item es agregado al estack. Sera el proximo en salir
    */
   public void push(E item);

   /**
    * para eliminar el ultimo elemento y obtenerlo al mismo tiempo
    * @return el ultimo elemento de la pila, el elemnto que se elimino
    * @pre stack no esta vacio
    * @post el elemento ingresado mas recientemente es retirado
    */
   public E pop();

   /**
    * Para obtener el ultimo elemento de la pila
    * @return El ultimo elemento de la pila
    * @pre stack no esta vacio
    * @post el valor mas reciente es retornado pero no es eliminado
    */
   public E peek();

   /**
    * Para verificar si una lista esta vacia
    * @return regresa true si la pila esta vacia
    */
   public boolean empty();

   /**
    * para conocer el tamaño de la pila
    * @return la cantidad de elementos en la pila
    */
   public int size();
}