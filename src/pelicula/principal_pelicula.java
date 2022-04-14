/**
 * 
 */
package pelicula;

import java.util.Scanner;



/**
 * @author Matias Machin
 *
 */
public class principal_pelicula {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		pelicula  b1=new pelicula("A-01", "Pearl Harbor", "Accion",2002, "Ben Affleck y Kate Beckinsale" );
		pelicula  b2=new pelicula("AV-01", "El rey Leon", "Aventura",2011, "Matthew Broderick y Jonathan Taylor" );
		pelicula  b3=new pelicula("C-05", "La Vida es Bella", "Comedia - Drama",2000, "Roberto Benigni y Nicoletta Braschi" );

		
		System.out.println("MENU PRINCIPAL PELICULA	 \n \n");
		System.out.println("PELICULA	 Nº 1 \n \n");
		System.out.println(b1.toString() +"\n");
		pausa();
		System.out.println("PELICULA  Nº 2 \n \n");
		System.out.println(b2.toString()+"\n");
		pausa();
		System.out.println("PELICULA	 Nº 3 \n \n");
		System.out.println(b3.toString()+"\n"	);
		pausa();
		System.out.println("Fin del Programa");
	}
	
public static void pausa() {
		
		String seguir;
	    Scanner teclado = new Scanner(System.in);
	    System.out.println("Press Enter key to continue...");
	    try
	    {
	        seguir = teclado.nextLine();
	       
	    }
	    catch(Exception e)
	    {}

}
}
