/**
 * 
 * Clase abstracta de Stack<E>. Su funcion es implementar el metodo
 * empty, ya que es igual para todas las clases que implementan Stack<E>,
 * ahora podran heredar de esta clase
 * 
 * @author Julio Herrera
 * @author Jose Hurtarte
 */
abstract public class AbstractStack<E> implements Stack<E> {

   /**
    * Para verificar si una lista esta vacia
    * @return regresa true si la pila esta vacia
    */
   public boolean empty() {
      return size() == 0;
   }
}