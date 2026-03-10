/**
 * @author Thabang Mamoloko
 */

/**
 * Class implements IPostion methods
 */
public class PositionalList<E> implements IPosition<E>{
	private Node<E> header = null;
	private int size = 0;

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public void push(E element) {
		// TODO Auto-generated method stub
		Node<E> newNode = new Node<>(element, header);
		header = newNode;
		size++;
	}

	@Override
	public INode<E> pop() {
		// TODO Auto-generated method stub
		if(header == null) {
			throw new IllegalArgumentException("The header node is null");
		}else if(header != null) {
			header = header.getNext();
			return header;
		}
		return null;
	}

	@Override
	public INode<E> top() {
		// TODO Auto-generated method stub
		if(header == null) {
			throw new IllegalArgumentException("The header node is null");
		}
		return header;
	}
	
	/**
	 * This method prints the list
	 */
	public void printVoid() {
		Node<E> currentNode = header;
		while(currentNode != null) {
			System.out.print(currentNode.getElement() + " - > ");
			currentNode = currentNode.getNext();
		}
		System.out.println("null");
	}

}
