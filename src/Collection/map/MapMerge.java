package Collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMerge {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(2, 50);
		map.put(3, null);
		
		System.out.println(map);
		
		
		map.merge(1, 3, (a,b) -> a+b);
		
		map.merge(2, null, (a,b) -> a+b);
		map.merge(3, 3, (a,b) -> a+b);
		
		System.out.println(map);
		
		
	}

}
