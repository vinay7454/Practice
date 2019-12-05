
public class LinkedListImpl {
	Node head;
		
	public static class Node {
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
		}		
	}
	
	public void addElement(int value) {
		if (head == null) {
			head = new Node(value);
			return;
		}
		
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}

		current.next = new Node(value);

	}
	
	public int size() {
		int size = 0;
		Node current = head;
		if (head == null) {
			return 0;
		} else {
			while(current != null) {
				current = current.next;
				size++;
			}
		}	
		return size;
	}
	
	public void deleteElement(int data) {
		if(head.data == data) {
			head = head.next;
			return;
		}
		if(head == null) {
			return;
		} else {
			Node current = head;
			while(current.next != null){
				if(current.next.data == data) {
					current.next = current.next.next;
					return;
				}
				current = current.next;
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListImpl list = new LinkedListImpl();
		list.addElement(10);
		list.deleteElement(10);
		System.out.println(list.size());
	}

}
