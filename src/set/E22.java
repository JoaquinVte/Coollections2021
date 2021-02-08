package set;

import java.util.*;

import common.Persona;

public class E22 {
	public static void main (String[] args) {
		
		Set<Persona> set = new TreeSet<Persona>();
				
		set.add(new Persona(1111,"Joaquin","Alonso"));
		set.add(new Persona(4444,"Carlos","Gimenez"));
		set.add(new Persona(2222,"Pedor","Martinez"));
		set.add(new Persona(3333,"Luis","Rodriguez"));
		
		//System.out.println(set);
		
		Set<Persona> set2 = new TreeSet<Persona>( new Comparator<Persona>() {
			@Override
			public int compare(Persona p0, Persona p1) {
				
				return p0.getApellidos().compareTo(p1.getApellidos());
			}			
		});		
		
		Set<Persona> set4 = new TreeSet<Persona>(
				(p0, p1) -> p0.getApellidos().compareTo(p1.getApellidos()));
		
		Set<Persona> set3 = new TreeSet<Persona>(Persona.COMPARE_BY_SURNAME);
		
		set2.addAll(set);
		
		System.out.println(set2);
		
	}

}







