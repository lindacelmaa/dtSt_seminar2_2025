package datastr;

import datastr.MyLInkedList;


public class MyService {

	public static void main(String[] args) {
		MyLInkedList<Integer> linkedListForInt = new MyLInkedList<Integer>();
		
		linkedListForInt.add(45);
		linkedListForInt.add(100);
		linkedListForInt.add(-200);
		linkedListForInt.add(1094);
		
		try {
			linkedListForInt.print();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
