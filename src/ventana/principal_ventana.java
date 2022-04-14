/**
 * 
 */
package ventana;

import java.util.Scanner;

import ventana.ventana;

/**
 * @author Matias Machin
 *
 */
public class principal_ventana {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ventana  b1=new ventana(10.2,6.5,"Madera","Basculante");
		ventana b2=new ventana(30.2,9.5,"Aluminio","Deslizante");
		ventana b3=new ventana(50.2,6.5,"PVC","Abatible");
		
		System.out.println("MENU PRINCIPAL VENTANA	 \n \n");
		System.out.println("VENTANA	 Nº 1 \n \n");
		System.out.println(b1.toString() +"\n");
		pausa();
		System.out.println("VENTANA  Nº 2 \n \n");
		System.out.println(b2.toString()+"\n");
		pausa();
		System.out.println("VENTANA	 Nº 3 \n \n");
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
