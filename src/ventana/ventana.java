package ventana;

public class ventana {
	
	//atributos
	
	private double ancho;
	private double alto;
	private String material;
	private String tipo;
	
	//constructores
	
	
	public ventana() {
		this(0,0,"","");
	}
	
	
	/**
	 * @param ancho
	 * @param alto
	 * @param material
	 * @param tipo
	 */
	public ventana(double ancho, double alto, String material, String tipo) {
		this.ancho = ancho;
		this.alto = alto;
		this.material = material;
		this.tipo = tipo;
	}


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


	/**
	 * Metodo getter del atributotipo
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}


	/**
	 * Metodo setter del atributo tipo
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return (" Datos de la ventana :  \n"+
				   " Ancho: " + ancho + "  metros \n"+
				   "Alto:  "+ alto + "  metros  \n"+
				   "Material: "+ material + "\n" +
				   "Tipo: "+ tipo+ "\n"+
				   "Area:  "+ calculo_area(ancho, alto)+ "  metros cuadrados \n"+
				   "Precio por metro cuadradado: 4,00 €"+"\n"+
				   "Precio de la ventana: "+calculo_precio(ancho, alto)+ "€");
				
	}
	public static double calculo_area (double ancho, double alto) {
		int i=1;
		double area1=0;
		area1= ancho*alto;
		double area=Math.round(area1*100.0)/100.0;    // formato de dos decimales
		return area;
	}	
	
	public static double calculo_precio (double ancho, double alto) {
		int i=1;
		double area1=0;
		area1= ancho*alto;
		double area=Math.round(area1*100.0)/100.0;    // formato de dos decimales
		int precio = 0;
		return area*4;
	}	
	
	
	
}
