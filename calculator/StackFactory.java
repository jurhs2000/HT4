class StackFactory<E> {
  //se utiliza el patron Factory
  
  /**
   * Selecciona la implementacion a utilizar para un stack
   * @param stackType tipo de pila a utilizar: arraylist, vector o lista
   * @param listType tipo de lista a utilizar: enlazada, doble enlazada o circular
   * @return una pila de cualquier tipo
   */
  public Stack<E> getStack(int stackType, int listType) {
  // seleccion de la implementacion a utilizar:
  /*if (entry.equals("AL"))
    return new StackArrayList<E>(); //regresa ArrayList
  else*/
    return new StackVector<E>(); //regresa Vector
  }
}