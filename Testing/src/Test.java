import java.security.acl.LastOwnerException;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		String strA = "abppplee";
		String[] D = {"able", "ale", "apple", "bale", "kangaroo"};
		

		TreeMap treeMap = new TreeMap();
		
		for (int i = 0; i < D.length; i++) {
			char[] chrA = strA.toCharArray();
			char[] chrB = D[i].toCharArray();
			
			int k = 0, j = 0;
			while (k < chrA.length && j < chrB.length) {
				if (chrA[k] == chrB[j]) {
					k++;
					j++;
				} else {
					k++;
				}

			}
			
			if(j == chrB.length) {
				treeMap.put(j, D[i]);
			}
		}
		
		
		System.out.println(treeMap.get(treeMap.lastKey()));
		
		
	}

}
