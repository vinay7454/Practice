import java.beans.Expression;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.ProcessBuilder.Redirect;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ReadAndWrite {

	public static void main(String[] args) {
		readFile();
	}

	public static void readFile() {
		String str = null;
		TreeMap<String, Integer> map = new TreeMap<>();

		try {
			String filePath = "c:/Users/vinay/OneDrive/Desktop/test.txt";
			Scanner scanner = new Scanner(new File(filePath));
			while (scanner.hasNextLine()) {
				str = scanner.nextLine();
				String[] strArr = str.toLowerCase().split("\\s+");
				for (int i = 0; i < strArr.length; i++) {
					if (map.containsKey(strArr[i])) {
						map.put(strArr[i], map.get(strArr[i]) + 1);
					} else {
						map.put(strArr[i], 1);
					}
				}
			}
			
			for( Entry<String, Integer> newMap : map.entrySet()) {
				System.out.println(newMap.getKey() + " " + newMap.getValue());
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		
		finally {
			
		}
	}
}
