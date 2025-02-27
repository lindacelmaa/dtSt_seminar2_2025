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
			linkedListForInt.add_index(-222, 1);
			linkedListForInt.print();
			linkedListForInt.add_index(-222, 6);
			linkedListForInt.print();
			linkedListForInt.remove(6);
			linkedListForInt.print();
			linkedListForInt.remove(1);
			linkedListForInt.print();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
