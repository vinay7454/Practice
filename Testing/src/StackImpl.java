import java.util.Stack;

public class StackImpl {
	private int[] arr;
	private int top;
	private int capacity;
	
	public StackImpl(int size) {
		// TODO Auto-generated constructor stub
		arr = new int[size];
		capacity = size;
		top = -1;
	}
	
	public void push(int data) {
		if(top + 1 < capacity) {
			arr[++top] = data;
		} else {
			System.out.println("Stack is full");
		}
		
	}
	
	public int pop() {
		return arr[top--];
	}
	
	
	public static void main(String[] args) {
		StackImpl stack = new StackImpl(3);
		
		stack.push(5);
		stack.push(2);
		System.out.println(stack.pop());
	}

}
