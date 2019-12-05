import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashSetTest {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		List list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(1);
		System.out.println("Index of 1 in list : " + list.indexOf(1));
		
		map.put(1, 100);
		map.put(2, 200);
		map.put(3, 300);
		
		for(Entry<Integer, Integer>  entry : map.entrySet()) {
			if(entry.getValue().equals(300)) {
				System.out.println("Get index of 300 : " + entry.getKey());
			}
			
		}
		
	}
	
}
