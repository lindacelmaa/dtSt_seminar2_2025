package datastr;

public class MyLInkedList {
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
}
