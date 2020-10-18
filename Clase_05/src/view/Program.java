package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import logic.Persona;

public class Program {

	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<Persona>();
		
		Persona p = new Persona("Matias", "Ramos");
		Persona p1 = new Persona("Matias", "Ramos");
		Persona p2 = new Persona("Juan", "Perez");
		
		lista.add(p);
		lista.add(p1);
		lista.add(p2);
		
		Persona buscar = new Persona("Matias", "Ramos");
		
		if (lista.contains(buscar))
		{
			System.out.println("Está");
		}
		else
		{
			System.out.println("No está");
		}
		
		Collections.sort(lista);
	}
}
