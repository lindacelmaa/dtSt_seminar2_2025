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
		System.out.println("");
	}
	
	public void add_index(Ttype element, int position) throws Exception{
		if(element == null) {
			throw new NullPointerException("Elementa v'ert'iba nevar b'ut null");
		}
		
		if(position == 1) {
			MyNode newNode = new MyNode(element);
			newNode.setNext(firstNode);
			firstNode.setPrevious(newNode);
			firstNode = newNode;
			counter++;
		} else if (position == counter + 1) {
			add(element);
		} else if(position > 1 && position <= counter ) {
			MyNode currentNode = firstNode;
			
			for(int i = 0; i < position; i++) {
				currentNode = currentNode.getNext();
			}
			MyNode currentNodePrevious = currentNode.getPrevious();
			
			MyNode newNode = new MyNode(element);
			newNode.setNext(currentNode);
			currentNode.setPrevious(newNode);
			
			currentNodePrevious.setNext(newNode);
			newNode.setPrevious(currentNodePrevious);
				
			counter++;
			
			
		}else {
			throw new Exception("The position is not accepted");
		}
		
	}
	public void remove(int position) throws Exception{
		if (position < 0 || position > counter) {
			throw new Exception("The index is not accepted");
		}
		if(position == 1) {
			firstNode = firstNode.getNext();
			firstNode.setPrevious(null);
			System.gc();
			counter --;
			
		}else if(position == counter) {
			lastNode = lastNode.getPrevious();
			lastNode.setNext(null);
			System.gc();
			counter--;
		}else {
			MyNode currentNode = firstNode;
			for(int i = 0; i < position-1; i++) {
				currentNode = currentNode.getPrevious();
			}
			MyNode currentNodeNext = currentNode.getNext();
			MyNode currentNodePrevious = currentNode.getPrevious();
			
			currentNodeNext.setPrevious(currentNodePrevious);
			currentNodePrevious.setNext(currentNodeNext);
			
			currentNode = null;
			System.gc();
			counter--;
;		}
	}
}










