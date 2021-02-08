package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class E1 {

	public static void main(String[] args) {
		
		List<Integer> lista = new LinkedList<Integer>();
		
		lista.add(2);
		lista.add(6);
		lista.add(6);
		lista.add(1, 7);
		
		System.out.println(lista);

	}

}
