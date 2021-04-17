package LinkedListDemo;

class LinkedList {
	
	private class Node {
		int value;
		Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	Node first;
	Node last;
	
	public void addLast(int item) {
		Node node = new Node(item);
		if(isEmpty()) {
			first = last = node;
		} else {
			last.next = node;
			last = node;
		}
	}
	
	public void addFirst(int item) {
		Node node = new Node(item);
		if(isEmpty()) {
			first = last = node;
		} else {
			node.next = first;
			first = node;
		}
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int indexOf(int item) {
		int index = 0;
		Node current = first;
		while(current!= null) {
			if(current.value == item) {
				return index;
			}
			current = current.next;
			index++;
		}
		return -1;
	}
	
}

public class CustomLinkedListExample {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(100);
		list.addLast(200);
		list.addFirst(50);
		System.out.println(list.isEmpty() ? "Empty": "Not Empty");
		var index = list.indexOf(250);
		System.out.println((index!= -1) ? index : "Item is not there.");
	}
	
}
