
public class Program {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona("Matias", "Ramos");
		
		p1.setApellido("Cerizza");
		p1.setNombre("Mauricio");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		// Ejercicio 03
		ManejoString manejoString = new ManejoString();
		String prueba = "chauMundo!";

		System.out.println(manejoString.contarCaracteres(prueba));
		System.out.println(manejoString.cortarALaMitad(prueba));
		System.out.println(manejoString.obtenerUltimoCaracter(prueba));
		System.out.println(manejoString.invertir(prueba));
		System.out.println(manejoString.separarConGuiones(prueba));
		System.out.println(manejoString.verificarContenido(prueba, "hola"));		
	}
}
