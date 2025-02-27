package datastr;

public class MyLInkedList<Ttype>{
	private MyNode firstNode = null;
	private MyNode lastNode = null;
	private int counter = 0;
	
	public int length() {
		return counter;
	}
	
	private boolean isEmpty() {
		return (counter == 0);
	}
	
	public boolean isFull() {
		try {
			new MyNode<Integer>(45);
			return false;
		}
		catch (OutOfMemoryError e) {
			return true;
		}
	}
	
	public void add(Ttype element) throws NullPointerException{
		if(element == null) {
			throw new NullPointerException("Elementa v'ert'iba nevar b'ut null");
		}
		if(!isFull()) {
			if(isEmpty()) {
				MyNode newNode = new MyNode(element);
				lastNode = newNode;
				firstNode = newNode;
				counter++;
			}
			else {
				MyNode newNode = new MyNode(element);
				newNode.setPrevious(lastNode);
				lastNode.setNext(newNode);
				lastNode = newNode;
				counter++;
			}
		}
	}
	
	public void print() throws Exception{
		if(isEmpty()) {
			throw new Exception("List is empty");
		}
		
		MyNode currentNode = firstNode;
		
		while(currentNode != null) {
			System.out.print(currentNode.getElement() + " ");
			currentNode = currentNode.getNext();
		}
		
	}
}










