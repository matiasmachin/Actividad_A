package figura;

import java.util.*;

public class principal {
	
	double area;
	double perimetro;
	int i;
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		figura a1=new figura(4, "Cuadrado");
		figura a2=new figura(3,"Triangulo");
		figura a3=new figura(4,"Rectangulo");
		
				
	
		System.out.println("MENU PRINCIPAL FIGURA \n \n");
		
		System.out.println(a1.toString());
		pausa();
		System.out.println(a2.toString());
		pausa();
		System.out.println(a3.toString());
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
