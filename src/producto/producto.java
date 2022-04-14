package producto;

import java.io.CharConversionException;

public class producto {
	
	//atributos
	
	private String codigo;
	private String nombre;
	private String descripcion;
	private  double costo;
	private double venta;
	private String proveedor ;
	private String familia;
	
	// constructores

	public producto() {
		this("","","",0,0,"","");
	}
	
	
	/**
	 * @param codigo
	 * @param nombre
	 * @param descripcion
	 * @param costo
	 * @param venta
	 * @param proveedor
	 * @param familia
	 */
	public producto(String codigo, String nombre, String descripcion, double costo, double venta, String proveedor,
			String familia) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.costo = costo;
		this.venta = venta;
		this.proveedor = proveedor;
		this.familia = familia;
	}


	/**
	 * Metodo getter del atributocodigo
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}


	/**
	 * Metodo setter del atributo codigo
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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


	/**
	 * Metodo getter del atributodescripcion
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}


	/**
	 * Metodo setter del atributo descripcion
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	/**
	 * Metodo getter del atributocosto
	 * @return the costo
	 */
	public double getCosto() {
		return costo;
	}


	/**
	 * Metodo setter del atributo costo
	 * @param costo the costo to set
	 */
	public void setCosto(double costo) {
		this.costo = costo;
	}


	/**
	 * Metodo getter del atributoventa
	 * @return the venta
	 */
	public double getVenta() {
		return venta;
	}


	/**
	 * Metodo setter del atributo venta
	 * @param venta the venta to set
	 */
	public void setVenta(double venta) {
		this.venta = venta;
	}


	/**
	 * Metodo getter del atributoproveedor
	 * @return the proveedor
	 */
	public String getProveedor() {
		return proveedor;
	}


	/**
	 * Metodo setter del atributo proveedor
	 * @param proveedor the proveedor to set
	 */
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}


	/**
	 * Metodo getter del atributofamilia
	 * @return the familia
	 */
	public String getFamilia() {
		return familia;
	}


	/**
	 * Metodo setter del atributo familia
	 * @param familia the familia to set
	 */
	public void setFamilia(String familia) {
		this.familia = familia;
	}


	@Override
	public String toString() {
		return (" Datos del Producto:  \n"+
				   "Codigo: " + codigo + " \n"+
				   "Nombre:  "+ nombre + " \n"+
				   "Descripcion: "+ descripcion + "\n" +
				   "Precio Costo: "+ costo+ " €\n"+
				   "Precio Venta: "+ venta+ " €\n"+
				   "Proveedor: "+ proveedor+ "\n"+
				   "Familia:  "+ familia+ " \n");
	}
	
	/*
	 * public static double con_pc (double costo) { double
	 * costo1=Math.round(costo*100.0)/100.0; // formato de dos decimales return
	 * costo1; }
	 */

}
