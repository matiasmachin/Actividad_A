package cliente;



public class cliente {
	
	// Atributos
	
	public String cif;
	public String nombre;
	public String direccion;
	public String municipio;
	public String telefono;
	public String email;
	public int codigop;
	
	
	// Constructores
	
	public cliente() {
		this("","","","","","",0);
	}

	public cliente(String cif, String nonbre, String direccion, String municipio, String telefono, String email, int codigop) {
		this.cif=cif;
		this.nombre=nonbre;
		this.direccion=direccion;
		this.municipio=municipio;
		this.telefono=telefono;
		this.email=email;
		this.codigop=codigop;
		}

	
	
	// Metodos getter y setter
	/**
	 * @return the cif
	 */
	public String getCif() {
		return cif;
	}

	/**
	 * @param cif the cif to set
	 */
	public void setCif(String cif) {
		this.cif = cif;
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
	 * @return the municipio
	 */
	public String getMunicipio() {
		return municipio;
	}

	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the codigop
	 */
	public int getCodigop() {
		return codigop;
	}

	/**
	 * @param codigop the codigop to set
	 */
	public void setCodigop(int codigop) {
		this.codigop = codigop;
	}

	
	// Metodo toString 
	
	
	@Override
	public String toString() {
		return "cliente [cif=" + cif + ", nombre=" + nombre + ", direccion=" + direccion + ", municipio=" + municipio
				+ ", telefono=" + telefono + ", email=" + email + ", codigop=" + codigop + "]";
	}

	
	

}
