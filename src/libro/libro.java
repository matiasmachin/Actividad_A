/**
 * 
 */
package libro;

/**
 * @author Matias Machin
 *
 */
public class libro {
	// Atributos

		private String Autor;
		private String Nombre;
		private int Ejemplares;
		private int cantidadp;
		
		//Constructor vacio
		
		public libro() {
			this.Autor="";
			this.Nombre="";
			this.Ejemplares=0;
			this.cantidadp=0;
			
		}
		
		//Metodo o constructor con parametros
		
		public libro(String Autor, String Nombre, int Ejemplares, int cantidadp) {
			this.Autor= Autor;
			this.Nombre = Nombre;
			this.Ejemplares = Ejemplares;
			this.cantidadp= cantidadp;
			
		}

		
		//Metodos getters y setters
		
		public String getAutor()  { // Muestra el autor
			return Autor;
		}

		public void setAutor(String autor) { // Captura el Autor
			Autor = autor;
		}

		public String getNombre() {
			return Nombre;
		}

		public void setNombre(String nombre) {
			Nombre = nombre;
		}

		public int getEjemplares() {
			return Ejemplares;
		}

		public void setEjemplares(int ejemplares) {
			Ejemplares = ejemplares;
		}
		public void setcantidadp(int Cantidadp) {
			cantidadp = Cantidadp;
		}

		public int getcantidadp() {
			return cantidadp;
		}

		
		//Metodo toString
		@Override
		public String toString() {
			return "libro [Autor=" + Autor + ", Nombre=" + Nombre + ", Ejemplares=" + Ejemplares + ", cantidadp="
					+ cantidadp + "]";
		}
		
		public boolean prestamo()
		{
			boolean prestado=true;
			if(cantidadp<Ejemplares) {
			cantidadp++;
		}
		else
		{
			prestado=false;
		}
			return prestado;
		}
		
		public boolean devolucion() {
			boolean entrega = true;
			if(cantidadp==0) {
				entrega=false;
			}
			else
			{
				cantidadp--;
			}
			return entrega;
			
		}
}
