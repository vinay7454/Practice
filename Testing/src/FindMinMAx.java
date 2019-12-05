import java.util.ArrayList;
import java.util.List;

public class FindMinMAx {
	
	public static void main(String[] args) {
		
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> smallList = new ArrayList<Integer>();
		List<Integer> smallList1 = new ArrayList<Integer>();
		List<Integer> smallList2 = new ArrayList<Integer>();
		List<Integer> smallList3 = new ArrayList<Integer>();
		
		smallList.add(10);
		smallList.add(20);
		list.add(smallList);
		
		smallList1.add(100);
		smallList1.add(150);
		list.add(smallList1);
		
		
		smallList2.add(200);
		smallList2.add(240);
		list.add(smallList2);
		
		smallList3.add(200);
		smallList3.add(300);
		list.add(smallList3);
		
		
		printMinMax(list);
		
	}
	
	public static void printMinMax(List<List<Integer>> list) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		System.out.println("Min:  " + min +  " Max: " + max);
		
		for(int i = 0; i < list.size(); i++) {
			List<Integer> newList = list.get(i);
			int firstElement = newList.get(0);
			int secondElement = newList.get(1);
			
			if(min > firstElement) {
				min = firstElement;
			}
			
			if(min > secondElement) {
				min = secondElement;
			}
			
			if(max < firstElement) {
				max = firstElement;
			}
			
			if(max < secondElement) {
				max = secondElement;
			}
		}
		
		System.out.println("Min:  " + min +  " Max: " + max);
	
}

}