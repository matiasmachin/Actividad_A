/**
 * 
 */
package cliente;

/**
 * @author Matias Machin
 *
 */
public class principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cliente a1= new cliente("B12345678", "Jose Medina", "C/ Arrecife", "La Laguna", "S/C de Tenerife","123@gmail.com",38320);
		cliente a2= new cliente("A11342678", "Alberto Perez", "C/  Frontera", "El Pinar de El Hierro", "S/C de Tenerife","AP@gmail.com",38914);

		System.out.println(a1.toString());
		System.out.println(a2.toString());
	}

}
