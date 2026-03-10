/**
 * @author Thabang Mamoloko
 */

/**
 * Class implements INode methods
 */
public class Node<E> implements INode<E>{
	private E element;
	private Node<E> next;

	/**
	 * @param element
	 * @param next
	 */
	public Node(E element, Node<E> next) {
		this.element = element;
		this.next = next;
	}

	/**
	 * @param element the element to set
	 */
	public void setElement(E element) {
		this.element = element;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Node<E> next) {
		this.next = next;
	}

	@Override
	public E getElement() {
		// TODO Auto-generated method stub
		return this.element;
	}

	@Override
	public Node<E> getNext() {
		// TODO Auto-generated method stub
		return this.next;
	}

}
