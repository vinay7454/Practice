import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class RandomizedSet {

	private List<Integer> list;
	private Map<Integer, Integer> map;
	private Random random;

	/** Initialize your data structure here. */
	public RandomizedSet() {
		list = new ArrayList<>();
		map = new HashMap<>();
		random = new Random();
	}

	/**
	 * Inserts a value to the set. Returns true if the set did not already contain
	 * the specified element.
	 */
	public boolean insert(int val) {
		boolean isPresent = map.containsKey(val);
		if (isPresent)
			return false;
		else {
			list.add(val);
			map.put(val, list.indexOf(val));
			return true;
		}
	}

	/**
	 * Removes a value from the set. Returns true if the set contained the specified
	 * element.
	 */
	public boolean remove(int val) {
		boolean isPresent = map.containsKey(val);
		if (!isPresent)
			return false;
		else {
			// Swap the index positions in list of the value to be deleted and the last element and update the map index of the last element
			int idx = list.indexOf(val);
			int lastElement = list.get(list.size() - 1);

			list.set(idx, lastElement); // Copied the last element into index of val
			list.remove(list.size() - 1); // Remove the last element from list

			map.put(lastElement, idx); // Update the index of the last element in map
			map.remove(val); // Delete the input val from the map
			return true;
		}
	}

	/** Get a random element from the set. */
	public int getRandom() {
		return list.get(random.nextInt(list.size()));
	}
	
	
	public static void main(String[] args) {
		RandomizedSet set = new RandomizedSet();
		set.insert(100);
		set.insert(200);
		set.insert(300);
		
		set.remove(100);
	}
}