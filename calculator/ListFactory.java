/**
 * 
 * Factory de Stack<E>. Devuelve una List<E> de cualquier tipo:
 * enlazada, doblemente enlazada o circular. Esta se decide por el paramtero
 * listType.
 * 
 * @author Julio Herrera
 * @author Jose Hurtarte
 * 
 */
class ListFactory<E> {
    //se utiliza el patron Factory
  
  /**
   * Selecciona la implementacion a utilizar para un stack
   * @param listType tipo de lista a utilizar: enlazada, doble enlazada o circular
   * @return una pila de cualquier tipo
   */
  public Stack<E> getStack(int listType) {
    switch (listType) {
      case 1:
        return new SinglyLinkedList<E>();
      case 2:
        return new DoublyLinkedList<E>();
      case 3:
        return new CircularList<E>();
      default:
        return null;
    }
  }
}