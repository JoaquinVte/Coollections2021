package common;

import java.util.Comparator;

public class Persona implements Comparable<Persona>{

	private int dni;
	private String nombre;
	private String apellidos;
	
	public static final Comparator COMPARE_BY_SURNAME = new Comparator<Persona>() {
		@Override
		public int compare(Persona p0, Persona p1) {
			
			return p0.getApellidos().compareTo(p1.getApellidos());
		}			
	};

	public Persona(int dni, String nombre, String apellidos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Persona) {
			Persona p = (Persona) o;
			return p.dni == this.dni;
		} else
			return false;
	}
	
	@Override
	public int hashCode() {
		return dni;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + "]\n";
	}

	@Override
	public int compareTo(Persona p) {
		
		return dni-p.dni;
	}
}
