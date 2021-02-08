package map;

import java.util.*;

public class E3 {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new TreeMap<>();
		map.put(1111, "Joaquin");
		map.put(2222, "Carlos");
		map.put(3333, "Joaquin");
		map.put(444, "Pedro");
		map.put(444, "Luis");
		
		System.out.println(map);
		

		
	}

}
