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
        ListFactory listFactory = new ListFactory();
        return listFactory.getStack(listType);
      default:
        return null;
    }
  }
}