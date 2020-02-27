/**
 * 
 * Factory de Stack<E>. Este Factory devuelve ya sea Stack<E> utilizando
 * ArrayList, Vector o Lista, que se decide por el parametro stackType.
 * En el caso de lista puede ser enlazada, doblemente enlazada o circular,
 * esta se retorna por medio de un Factory de lista y se decide por el 
 * parametro listType.
 * 
 * @author Julio Herrera
 * @author Jose Hurtarte
 * 
 */
class StackFactory<E> {
  //se utiliza el patron Factory
  
  /**
   * Selecciona la implementacion a utilizar para un stack
   * @param stackType tipo de pila a utilizar: arraylist, vector o lista
   * @param listType tipo de lista a utilizar: enlazada, doble enlazada o circular
   * @return una pila de cualquier tipo
   */
  public Stack<E> getStack(int stackType, int listType) {
    switch (stackType) {
      case 1:
        return new StackArrayList<E>();
      case 2:
        return new StackVector<E>();
      case 3:
        ListFactory<E> listFactory = new ListFactory<E>();
        return listFactory.getStack(listType);
      default:
        return null;
    }
  }
}