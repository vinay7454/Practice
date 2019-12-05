import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("aaa", 2);
		if(map.containsKey("aaa")){
			System.out.println(map.get("aaa"));
			System.out.println();
		}
	}

}
