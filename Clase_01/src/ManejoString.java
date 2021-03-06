

public class ManejoString {
	/**
	 * Cuenta los caracteres de la cadena. 
	 * @param s = Cadena de texto
	 * @return = Cantidad de caracteres
	 */
	public int contarCaracteres (String s) {
		return s.length();
	}
	
	public String cortarALaMitad(String s) {
		int posicionMitad = (int) Math.ceil(s.length() / 2);
		return s.substring(0, posicionMitad);
	}
	
	public char obtenerUltimoCaracter(String s) {
		return s.charAt(s.length() - 1);
	}
	
	public String invertir(String s) {
		String cadenaInvertida = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			cadenaInvertida += s.charAt(i);
		}
		
		return cadenaInvertida;		
	}
	
	public String separarConGuiones(String s) {
		String cadenaConGuiones = "";
		
		for(int i = 0; i < s.length() - 1; i++) {
			cadenaConGuiones = cadenaConGuiones + s.charAt(i) + '-';
		}
		
		cadenaConGuiones += s.charAt(s.length() - 1);
		
		return cadenaConGuiones;
	}
	
	public boolean verificarContenido(String s, String referencia) {
		return s.contains(referencia);
	}
	
}
