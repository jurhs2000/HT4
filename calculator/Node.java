/**
 * La clase nodo es utilizada para las listas, tanto enlazada y circular,
 * representa un dato y la direccion que marca al siguiente
 * utiliza recursividad para tener todos los nodos en si misma.
 * 
 *
 * Parte del codigo obtenida por medio del capitulo 9
 * "Lists'Bailey, D. (2007). Java Structures. New York: McGraw-Hill"
 * Modificaciones de metodos, logica, implementaciones, estructura, etc
 * @author Julio Herrera
 * @author Jose Hurtarte
 */
public class Node<E> {
   /**
    * El tipo de dato generico E, es el tipo de dato que se guardara
    */
   protected E data;
   /**
    * El siguiente nodo que marca el nodo actual
    */
   protected Node<E> nextElement;

   public Node(E v, Node<E> next)
   // pre: v is a value, next is a reference to 
   //      remainder of list
   // post: an element is constructed as the new 
   //      head of list
   {
       data = v;
       nextElement = next;
   }

   public Node(E v)
   // post: constructs a new tail of a list with value v
   {
      this(v,null);
   }

   public Node<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }

   public void setNext(Node<E> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }

   public E value()
   // post: returns value associated with this element
   {
      return data;
   }

   public void setValue(E value)
   // post: sets value associated with this element
   {
      data = value;
   }
}
//Bailey, D. (2007). Java structures. New York: McGraw-Hill.