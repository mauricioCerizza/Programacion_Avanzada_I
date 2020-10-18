package logic;

public class Persona implements Comparable<Persona> {
	private String nombre;
	private String apellido;
			
	public Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (obj.getClass() == Persona.class)
		{
			Persona persona = (Persona) obj;
			return this.nombre == persona.nombre && this.apellido == persona.apellido;			
		}
		
		return false;
	}
	
	@Override
	public int hashCode() 
	{
		final int prime = 31; 
		// La disperción multiplicando por un número primo siempre es más grande que la multiplicación por un número no-primo. 
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((nombre == null) ? 0: nombre.hashCode()); 
		return result;
	}

	@Override
	public int compareTo(Persona arg0) {
		return 0;
	}
}
