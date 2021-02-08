package list;

import java.util.*;

import common.Persona;

public class E11 {

	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<>();
		
		lista.add(new Persona(1111,"Joaquin","Alonso"));
		lista.add(new Persona(4444,"Carlos","Gimenez"));
		lista.add(new Persona(2222,"Pedor","Martinez"));
		lista.add(new Persona(3333,"Luis","Rodriguez"));
		
		lista.sort(Persona.COMPARE_BY_SURNAME);
		
		lista.sort((p,p1)->p.getApellidos().compareTo(p1.getApellidos()));
		
		lista.sort((p1,p2)->p1.getNombre().compareTo(p2.getNombre()));
		System.out.println(lista);
		
		for(Persona p : lista) {
			System.out.println(p.getDni());	
		}
		
		Persona pi;		
		Iterator<Persona> it = lista.iterator();
		
		while(it.hasNext()) {
			pi = it.next();
			if(pi.getDni()%2==0)
				it.remove();			
		}
		
		System.out.println(lista);

	}

}
