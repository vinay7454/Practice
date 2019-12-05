
public class TheQueue {
	
	private String[] queue;
	private int queueSize;
	private int front, rear, numberofItems = 0;

	
	public TheQueue(int size) {
		// TODO Auto-generated constructor stub
		queueSize = size;
		queue = new String[size];
	}
	
	public void insert(String value) {
		if(numberofItems + 1 <= queueSize) {
			queue[rear] = value;
			System.out.println("Added the element to the queue : " + queue[rear]);
			rear++;
			numberofItems++;
		} else {
			System.out.println("The queue is full");
		}
	}
	
	public void remove() {
		if(numberofItems > 0) {
			System.out.println("Removed the element from Queue: " + queue[front]);
			front++;
			numberofItems--;
		} else {
			System.out.println("The queue is empty.");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheQueue queue = new TheQueue(3);
		queue.insert("Vinay");
		queue.insert("Shan");
		queue.insert("Maneesh");
		queue.remove();
		

	}

}
