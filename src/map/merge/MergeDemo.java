package map.merge;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MergeDemo {

	public static BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
	
	public static void main(String[] args) {
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", "Tram");
		
		String jenny = favorites.merge("Jenny", "Skyride", mapper);
		String tom = favorites.merge("Tom", "Skyride", mapper);
		
		System.out.println(favorites);
		System.out.println(jenny);
		System.out.println(tom);
	}

}
