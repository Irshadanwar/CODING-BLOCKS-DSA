package Lec_38;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<String, Integer> map = new HashMap<>():

		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Ankit", 77);
		map.put("Kunal", 67);
		map.put("Aditya", 32);
		map.put("raju", 17);
		map.put("mohan", 87);
		map.put("Amisha", 57);
		map.put("Sunil", 97);
		map.put("Shivani", 77);
		map.put("Shivani", 47);
		map.put("Shivani", 147);
		map.put("Bklol", 89);
		map.put(null, 89);
		System.out.println(map);
		//System.out.println(map.keySet());
		for (String s : map.keySet()) {
			System.out.println(s + " " + map.get(s));
		}
//		// Search
//		System.out.println(map.containsKey("Anku"));
//		System.out.println(map.containsKey("Amisha"));
//		System.out.println(map.containsValue(67));
//		// get
//		System.out.println(map.get("Aditya"));
//		System.out.println(map.get("Adi"));
//		System.out.println(map.get(null));
//		// remove
//		System.out.println(map.remove("mohan"));
//		System.out.println(map);
//		System.out.println(map.remove(null));
//		System.out.println(map);
		TreeMap<String, Integer> map1 = new TreeMap<>();
		map1.put("Ankit", 77);
		map1.put("Kunal", 67);
		map1.put("Aditya", 32);
		map1.put("raju", 17);
		map1.put("mohan", 87);
		map1.put("Amisha", 57);
		map1.put("Sunil", 97);
		map1.put("Ankita", 67);
		map1.put("Shivani", 77);
		map1.put("Shivani", 47);
		map1.put("Shivani", 147);
		map1.put("Bklol", 89);
		System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		map2.put("Ankit", 77);
		map2.put("Kunal", 67);
		map2.put("Aditya", 32);
		map2.put("raju", 17);
		map2.put("mohan", 87);
		map2.put("Amisha", 57);
		map2.put("Sunil", 97);
		map2.put("Ankita", 67);
		map2.put("Shivani", 77);
		map2.put("Shivani", 47);
		map2.put("Shivani", 147);
		map2.put("Bklol", 89);
		System.out.println(map2);

	}

}
