/**
 * 
 */
package pared;

/**
 * @author Matias Machin
 *
 */
public class pared {
	
	private double ancho;
	private double alto;
	private double espesor;
	private String color;
	private String material;
	
	//Constructores
	public pared() {
		this(0,0,0,"","");
	}
	
	
	public pared(double ancho, double alto, double espesor, String color, String material) {
		this.ancho = ancho;
		this.alto = alto;
		this.espesor = espesor;
		this.color = color;
		this.material = material;
	}

	
	//Metodos
	
	

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
	 * Metodo getter del atributoespesor
	 * @return the espesor
	 */
	public double getEspesor() {
		return espesor;
	}


	/**
	 * Metodo setter del atributo espesor
	 * @param espesor the espesor to set
	 */
	public void setEspesor(double espesor) {
		this.espesor = espesor;
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


	/**
	 * Metodo getter del atributomaterial
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}


	/**
	 * Metodo setter del atributo material
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}


	@Override
	public String toString() {
		return (" Datos de La Pared :  \n"+
				   " Ancho: " + ancho + "  metros \n"+
				   "Alto:  "+ alto + "  metros  \n"+
				   "Espesor: " +  espesor + "  metros \n"+
				   "Material: "+  material +"\n"+
				   "Color: "+ color + "\n" +
				   "Area:  "+ calculo_area(ancho, alto)+ "  metros cuadrados \n"+
				   "Volumen de la pared :  " + calculo_volumen(ancho, alto, espesor)+ "  metros cubicos \n" +
				   "Perimetro de la pared : " + perimetro(ancho, alto)+ "   metros");
	}

	public static double calculo_area (double ancho, double alto) {
		int i=1;
		double area1=0;
		area1= ancho*alto;
		double area=Math.round(area1*100.0)/100.0;    // formato de dos decimales
		return area;
	}	
	
	public static double calculo_volumen (double ancho, double alto, double espesor) {
		int i=1;
		double vol =0;
		vol= (ancho*alto)*espesor;
		double volumen=Math.round(vol*100.0)/100.0;  // formato de dos decimales
		return volumen;
	}	
	
	public static double perimetro (double ancho, double alto) {
		int i=1;
		double peri=0;
		peri= (ancho+alto)+(ancho+alto);
		double perimetro=Math.round(peri*100.0)/100.0;  // formato de dos decimales
		
		return perimetro;
	}	
	
	
}
