/**
 * 
 */
package rectangulo;

/**
 * @author Matias Machin
 *
 */
public class rectangulo {
	
	//atributos
	
	private double ancho;
	private double alto;
	private String color;
	
	//Constructores 
	
	public rectangulo() {
		this(0,0,"");
	}

	/**
	 * @param ancho
	 * @param alto
	 * @param color
	 */
	public rectangulo(double ancho, double alto, String color) {
		this.ancho = ancho;
		this.alto = alto;
		this.color = color;

	}

	
	// Metodos
	
	
	
	/**
	 * Metodo getter del atributoancho
	 * @return the ancho
	 */
	public double getAncho() {
		return ancho;
	}

	/**
	 * Metodo setter del atributo ancho
	 * @param ancho the ancho to set
	 */
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	/**
	 * Metodo getter del atributoalto
	 * @return the alto
	 */
	public double getAlto() {
		return alto;
	}

	/**
	 * Metodo setter del atributo alto
	 * @param alto the alto to set
	 */
	public void setAlto(double alto) {
		this.alto = alto;
	}

	/**
	 * Metodo getter del atributocolor
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Metodo setter del atributo color
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return (" Datos del Rectangulo :  \n"+
				   " Ancho: " + ancho + "  metros \n"+
				   "Alto:  "+ alto + "  metros  \n"+
				   "Color: "+ color + "\n" +
				   "Area:  "+ calculo_area(ancho, alto)+ "  metros cuadrados \n"+
				    "Perimetro : " + perimetro(ancho, alto)+ "   metros");
	}

	public static double calculo_area (double ancho, double alto) {
		int i=1;
		double area1=0;
		area1= ancho*alto;
		double area=Math.round(area1*100.0)/100.0;    // formato de dos decimales
		return area;
	}	
	

	public static double perimetro (double ancho, double alto) {
		int i=1;
		double peri=0;
		peri= (ancho+alto)+(ancho+alto);
		double perimetro=Math.round(peri*100.0)/100.0;  // formato de dos decimales
		
		return perimetro;
	}	
	

}
