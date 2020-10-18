package view;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * File file = new File("prueba.txt"); 
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Ingrese texto:"); 
		 * writeFile(file, scanner.next());
		 */

		File origen = new File("apunte.pdf");
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(origen);
		
			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
			
			File copia = new File("copia.pdf");
			FileOutputStream fileOutputStream = new FileOutputStream(copia);
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			
			byte[] buffer = new byte[1024];
			
			int cantidadCaracteresLeidos = 0;
			while((cantidadCaracteresLeidos = bufferedInputStream.read(buffer)) > -1) // si devuelve -1 ya leyó todo.
			{
				bufferedOutputStream.write(buffer, 0, cantidadCaracteresLeidos);			
			}
			
			bufferedOutputStream.flush();
			bufferedInputStream.close();
			bufferedOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeFile (File file, String texto)
	{
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true)))
		{
			// El buffer acumula en memoria todo lo posible y luego pasa todo junto a disco.
			bufferedWriter.write(texto);
			bufferedWriter.flush(); // Baja a disco todo. 
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void readLine (File file)
	{
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) // try con recursos. 
		{
			String line = null;
			do
			{
				line = bufferedReader.readLine();
				System.out.println(line);
			} while (line != null);			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
