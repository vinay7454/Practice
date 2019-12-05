import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> map = new HashMap<String, Integer>();
		map.put("Apple", 1000);
		map.put("Salesforce", 100);
		map.put("Microsoft", 800);
		map.put("Google", 750);
		map.put("FaceBook", 600);
		
//		for(Entry<String, Integer> mapLoop : map.entrySet()) {
//			System.out.println(mapLoop.toString());
//		}
		
		
		
		LinkedHashMap<String, Integer> treeMap = new LinkedHashMap<String, Integer>();
		treeMap.put("App", 1000);
		treeMap.put("Sales", 100);
		treeMap.put("Micro", 800);
		treeMap.put("Gaga", 750);
		treeMap.put("FB", 600);
		
		for(Entry<String, Integer> treeMap2 : treeMap.entrySet()) {
			System.out.println(treeMap2.toString());
		}
		
		
		
		
		
	}

}
