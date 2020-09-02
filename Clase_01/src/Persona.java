
public class Persona {
	private String nombre;
	private String apellido;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String apellido) {
		this.apellido = apellido;
		this.nombre = nombre;		
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public String toString() {
		return this.nombre + " " + this.apellido;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o != null && o.getClass().equals(this.getClass())) {
			Persona p = (Persona) o;
			return this.apellido.equals(p.apellido) && this.nombre.equals(p.nombre);			
		}
		
		return false;
	}	
	
	@Override
	public int hashCode() {
		int primo = 31;
		int resultado = 0;
		resultado += primo * this.nombre.hashCode(); 
		resultado += primo * this.apellido.hashCode(); 
		
		return resultado;
	}
}
