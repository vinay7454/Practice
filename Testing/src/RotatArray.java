
public class RotatArray {

	public void rotate(int[] input, int step) {
	    step = step % input.length;
	    reverse(input, 0, input.length - 1);
	    for (int i : input) {
			System.out.print(i + " ");
		}
	    reverse(input, 0, step - 1);
	    System.out.println();
	    for (int i : input) {
			System.out.print(i + " ");
		}
	    reverse(input, step, input.length - 1);
	    System.out.println();
	    for (int i : input) {
			System.out.print(i + " ");
		}
	}
	 
	private void reverse(int[] input, int start, int end) {
	    while (start < end) {
	        int temp = input[start];
	        input[start] = input[end];
	        input[end] = temp;
	        start++;
	        end--;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1, 2, 3, 4, 5, 6, 7};
		int step = 4;
		
		RotatArray array = new RotatArray();
		array.rotate(input, step);
	}

}
