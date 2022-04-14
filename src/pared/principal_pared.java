/**
 * 
 */
package pared;

import java.util.Scanner;




/**
 * @author Matias Machin
 *
 */
public class principal_pared {
	
	//variables y atributos
	
	
	double area;
	double perimetro;
	int i;
	static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciar
		
		pared b1=new pared(10.2,6.5,0.2,"Gris","Concreto");
		pared b2=new pared(30.2,9.5,0.2,"Marron","Madera");
		pared b3=new pared(50.2,6.5,0.15,"Gris","Bloques");
		
		System.out.println("MENU PRINCIPAL PARED	 \n \n");
		System.out.println("PARED	 Nº 1 \n \n");
		System.out.println(b1.toString() +"\n");
		pausa();
		System.out.println("PARED	 Nº 2 \n \n");
		System.out.println(b2.toString()+"\n");
		pausa();
		System.out.println("PARED	 Nº 3 \n \n");
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
