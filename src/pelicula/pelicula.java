/**
 * 
 */
package pelicula;

/**
 * @author Matias Machin
 *
 */
public class pelicula {
	
	// atributos
	
	private String codigo;
	private String nombre;
	private String genero;
	private int ano;
	private String protagonistas;
	
	
	
	// constructores
	
	public pelicula() {
		this("", "", "", 0, "");
		}
	/**
	 * @param codigo
	 * @param nombre
	 * @param genero
	 * @param ano
	 * @param protagonistas
	 */
	public pelicula(String codigo, String nombre, String genero, int ano, String protagonistas) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.genero = genero;
		this.ano = ano;
		this.protagonistas = protagonistas;
	}
	
	
	
	// Metodos
	
	
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
	 * Metodo getter del atributogenero
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * Metodo setter del atributo genero
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * Metodo getter del atributoano
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}
	/**
	 * Metodo setter del atributo ano
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}
	/**
	 * Metodo getter del atributoprotagonistas
	 * @return the protagonistas
	 */
	public String getProtagonistas() {
		return protagonistas;
	}
	/**
	 * Metodo setter del atributo protagonistas
	 * @param protagonistas the protagonistas to set
	 */
	public void setProtagonistas(String protagonistas) {
		this.protagonistas = protagonistas;
	}
	@Override
	public String toString() {
		return (" Datos de la Pelicula:  \n"+
				   "Codigo: " + codigo + " \n"+
				   "Nombre:  "+ nombre + " \n"+
				   "Genero: "+ genero + "\n" +
				   "Año: "+ ano+ "\n"+
				   "Protagonmistas:  "+ protagonistas+ " \n");
	}
	

	
	
	
	
	

	
	
	

}
