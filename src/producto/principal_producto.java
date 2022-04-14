/**
 * 
 */
package producto;

import java.util.Scanner;

import producto.producto;

/**
 * @author Matias Machin
 *
 */
public class principal_producto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		producto  b1=new producto("P-01","Harina PAN","Harina de Maiz Precocida",1.50, 2.50, "Empresas Polar", "Harinas" );
		producto  b2=new producto("P-02","Atun Pescador", "Atun en aceite de oliva 150g", 2.20,2.60,"Distribuidora del Mar", "Enlatados" );
		producto  b3=new producto("P-03", "Oreo Maxi", "Galleta de chocolate y vainilla",1.10, 2.00	, "Nestle", "Galletas" );

		
		System.out.println("MENU PRINCIPAL PRODUCTO	 \n \n");
		System.out.println("PRODUCTO	 Nº 1 \n \n");
		System.out.println(b1.toString() +"\n");
		pausa();
		
		System.out.println("PRODUCTO  Nº 2 \n \n");
		System.out.println(b2.toString()+"\n");
		pausa();
		System.out.println("PRODUCTO	 Nº 3 \n \n");
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
