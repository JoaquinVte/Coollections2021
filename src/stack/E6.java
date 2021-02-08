package stack;

import java.util.*;
import java.util.Stack;

public class E6 {

	public static void main(String[] args) {
	
		List<Integer> b = new ArrayList<>();
		
		Collections.shuffle(b);
		
		Deque<Integer> baraja = new LinkedList<>(b);
		baraja.peek();	
		
	}

}
