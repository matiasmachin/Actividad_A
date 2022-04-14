/**
 * 
 */
package rectangulo;

import java.util.Scanner;



/**
 * @author Matias Machin
 *
 */
public class principal_rectangulo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangulo  b1=new rectangulo(10.2,6.5,"Gris");
		rectangulo b2=new rectangulo(30.2,9.5,"Marron");
		rectangulo b3=new rectangulo(50.2,6.5,"Gris");
		
		System.out.println("MENU PRINCIPAL RECTANGULO	 \n \n");
		System.out.println("RECTANGULO	 Nº 1 \n \n");
		System.out.println(b1.toString() +"\n");
		pausa();
		System.out.println("RECTANGULO	 Nº 2 \n \n");
		System.out.println(b2.toString()+"\n");
		pausa();
		System.out.println("RECTANGULO	 Nº 3 \n \n");
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
