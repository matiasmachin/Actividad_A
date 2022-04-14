package figura;

import java.util.Scanner;

public class figura {
	
	// atributos
	
	private int nrolados;
	private String nombre;
	static Scanner sc = new Scanner(System.in);
	
	
	// constructores
	
	public figura(int nrolados, String nombre) {
		this.nrolados = nrolados;
		this.nombre = nombre;
	}
	public figura() {
		this(0,"");
	}

	
	// Metodos getters y setters
	
	/**
	 * Metodo getter del atributonrolados
	 * @return the nrolados
	 */
	public int getNrolados() {
		return nrolados;
	}
	/**
	 * Metodo setter del atributo nrolados
	 * @param nrolados the nrolados to set
	 */
	public void setNrolados(int nrolados) {
		this.nrolados = nrolados;
	}
	/**
	 * Metodo getter del atributonombre
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo setter del atributo nombre
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return  "  Nombre de la Figura: " + nombre + "\n"+
				"  Nro de Lados : " + nrolados + "\n"+
				"  Perimetro: " + calculo_perimetro(nrolados, getNombre()) + "\n"+
				"  Area : " + calculo_area(getNrolados(), getNombre()) ;
	}
	
	
	public static double calculo_perimetro(int nrolados, String nombre) {
		int i=1;
		double peri=0;
		double peri1=0;
	    System.out.println("Calculo del Perimetro  "+  nombre + "\n\n");
	    if(nombre=="Cuadrado") {
	    	System.out.println("Introduzca la medida del lado:  " );
	    	int medida=sc.nextInt();
	    	peri1=4*medida;
	    }
	    if(nombre!="Cuadrado") {
		for (i=1;i<=nrolados; i++) {
			 System.out.println("Introduzca la medida del lado: " +  i  + " es: " );
			 int medida= sc.nextInt();
			 peri1=peri1+medida;
			
		}
	    }
		 peri=peri1;
	
		return peri;	
	}

	public static double calculo_area (int nrolados, String nombre) {
		int i=1;
		double area=0;
		System.out.println(" \nCalculo del Area  " + nombre + "  \n\n");
		if(nombre=="Triangulo") {
			 System.out.println("Introduzca la base: " );
			 Double base= sc.nextDouble();
			 System.out.println("Introduzca la Altura: " );
			 Double  altura= sc.nextDouble();
			 area=(base*altura)/2;
		}
		if(nombre=="Cuadrado"){
			 System.out.println("Introduzca la medida del lado: " );
			 Double  medida= sc.nextDouble();
			 area=(medida * medida);
		}
		if(nombre=="Rectangulo") {
		
				 System.out.println("Introduzca la medida de la base: " );
				 Double lado1=sc.nextDouble();
				 System.out.println("Introduzca la medida de la altura: " );
				 Double lado2=sc.nextDouble();
				 area=lado1*lado2;
	
	}
		return area;
}
}
