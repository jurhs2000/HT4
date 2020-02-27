/**
 * La clase nodo de lista doblemente enlazada es similar a la de nodo,
 * es utilizada solo por la lista doblemente enlazada y representa al dato en si
 * al siguiente nodo y al anterior tambien
 * 
 * 
 * Parte del codigo obtenida por medio del capitulo 9
 * "Lists'Bailey, D. (2007). Java Structures. New York: McGraw-Hill"
 * Modificaciones de metodos, logica, implementaciones, estructura, etc
 * @author Julio Herrera
 * @author Jose Hurtarte
 */
public class DoublyLinkedNode<E> {
    /**
     * El tipo de dato generico E, es el tipo de dato que se guardara
     */
    protected E data;
    /**
     * El siguiente nodo que marca el nodo actual
     */
    protected DoublyLinkedNode<E> nextElement;
    /**
     * El nodo anterior que marca el nodo actual
     */
    protected DoublyLinkedNode<E> previousElement;

    public DoublyLinkedNode(E v,
                            DoublyLinkedNode<E> next,
                            DoublyLinkedNode<E> previous) {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    public DoublyLinkedNode(E v)
    // post: constructs a single element
    {
        this(v,null,null);
    }
    public DoublyLinkedNode<E> previous(){
        return previousElement;
    }

    public E value()
    // post: returns value associated with this element
    {
    return data;
    }

    public void setNext(DoublyLinkedNode<E> next){
        nextElement = next;
    }
}