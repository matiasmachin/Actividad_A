package alumno;

public class alumno {
	
	// atributos
	
	
	private String dni ;
	private String nombre ;
	private String apellido;
	private String direccion;
	private int anonac;
	
	// Contructores
	
	public alumno() {
		this("","","","",0);
	}
	
	public alumno(String  dni, String nombre, String apellido, String direccion, int anonac ) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
		this.direccion=direccion;
		this.anonac=anonac;
		}

	
	
	// Metodos getters y setters
	
	
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the anonac
	 */
	public int getAnonac() {
		return anonac;
	}

	/**
	 * @param anonac the anonac to set
	 */
	public void setAnonac(int anonac) {
		this.anonac = anonac;
	}

	
	// Metodo toString
	
	@Override
	public String toString() {
		return "alumno [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", anonac=" + anonac + "]";
	}
	


	
	
	
	
	
	
	
	
	
	
	

}
