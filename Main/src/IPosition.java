/**
 * @author Thabang Mamoloko
 */

/**
 * Interface contains method for the functionality of the singly linked list
 */
public interface IPosition<E> {
	/**
	 * Function return the size of the list
	 * @return size
	 */
	int size();
	
	
	/**
	 * This function checks if the list is empty or not
	 * @return boolean expression
	 */
	boolean isEmpty();
	
	
	/**
	 * This function inserts elements to the list
	 * @param element - an element to be inserted
	 * @return The element inserted
	 */
	void push(E element);
	
	
	/**
	 * This function removes the element at the header Node
	 * @return The removed element
	 */
	INode<E> pop();
	
	
	/**
	 * This function returns the element at the header
	 * @return header
	 */
	INode<E> top();

}
