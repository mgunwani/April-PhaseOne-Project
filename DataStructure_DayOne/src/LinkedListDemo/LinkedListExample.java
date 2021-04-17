package LinkedListDemo;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(100);
		list.addLast(200);
		list.addFirst(50);
		System.out.println(list);
		
	}

}
