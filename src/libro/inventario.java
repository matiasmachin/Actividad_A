package libro;

import java.util.Scanner;

public class inventario {
public static void main(String[] args) {
		
		// Instanciar objetos
		libro libro1= new libro();
		libro1.setAutor("Miguel de Cervantes");
		libro1.setNombre("El Quijote de La Mancha");
		libro1.setEjemplares(2);
		libro1.setcantidadp(0);
		
		//System.out.println("libro 1 :" + libro1.toString());
		
		System.out.println("Autor del libro 1 :"+ libro1.getAutor()+ "\n" + ". Nombre del libro: " + libro1.getNombre()+ "\n"+" Nro. de Ejemplares: " + libro1.getEjemplares()+ "\n" + " Cantidad de libros Prestado: " + libro1.getcantidadp()+"\n");
		 pausa();
		//Instanciar objetos con parametros
		
		libro libro2= new libro("Arturo Perez Reverte", "El Capit�n Alatriste", 1,1);
		
		System.out.println("Autor del libro 2 :"+ libro2.getAutor()+ "\n" + ". Nombre del libro: " + libro2.getNombre()+ "\n"+" Nro. de Ejemplares: " + libro2.getEjemplares()+ "\n" + " Cantidad de libros Prestado: " + libro2.getcantidadp()+"\n");
		
		pausa();
		//System.out.println("libro 2 :" + libro2.toString());
		
		libro libro3= new libro("Mario Vargas Llosa", "La Ciudad y Los Perros", 0,0);
		
		//System.out.println("libro 3 :" + libro3.toString());
		System.out.println("Autor del libro 3 :"+ libro3.getAutor()+ "\n" + ". Nombre del libro: " + libro3.getNombre()+ "\n"+" Nro. de Ejemplares: " + libro3.getEjemplares()+ "\n" + " Cantidad de libros Prestado: " + libro3.getcantidadp()+"\n\n\n");
		pausa();
		
		System.out.println(" SIMULACION DE PRESTAMOS DE LIBROS " + "\n\n\n");
		
		//Simulacion de Prestamos libro1
		if(libro1.prestamo())
		{
			System.out.println("Se ha prestado el libro " + libro1.getNombre() + " Escrito por: "+ libro1.getAutor()+"\n");
			System.out.println("Cantidad Total de libros Prestados: "+ libro1.getcantidadp()+ " del " + libro1.getNombre() +"\n \n" );
		}
		else
		{
			System.out.println("No quedan ejemplares del libro: "+ libro1.getNombre()+"\n\n");
		}
		
		pausa();
		//Simulacion de Prestamos libro2
		if(libro2.prestamo())
		{
			System.out.println("Se ha prestado el libro " + libro2.getNombre() + " Escrito por: "+ libro2.getAutor()+"\n");
			System.out.println("Cantidad Total de libros Prestados: "+ libro2.getcantidadp()+ " del " + libro2.getNombre() +"\n \n" );		
		}
		else
		{
			System.out.println("No quedan ejemplares del libro: "+ libro2.getNombre()+"\n\n");
		}
		pausa();
		//Simulacion de Prestamos libr3
				
		if(libro3.prestamo())
				{
					System.out.println("Se ha prestado el libro " + libro3.getNombre() + " Escrito por: "+ libro3.getAutor()+"\n");
					System.out.println("Cantidad Total de libros Prestados: "+ libro3.getcantidadp()+ " del " + libro3.getNombre() +"\n \n" );		
				}
		else
				{
					System.out.println("No quedan ejemplares del libro: "+ libro3.getNombre()+"\n\n");
				}
		
		
		//simulacion de devoluciones
		pausa();
		System.out.println(" SIMULACION DE DEVOLUCION DE LIBROS " + "\n\n\n");

		//Devolucion de libro1
		
		if(libro1.devolucion()) {
			System.out.println("Se ha devuelto un ejemplar del libro: "+ libro1.getNombre() + " del autor: " + libro1.getAutor()+ "\n\n");
			System.out.println("Cantidad Total de libros Disponibles: "+ (libro1.getEjemplares()-libro1.getcantidadp())+ "\n \n" );
		}
		else
		{
			System.out.println("No existen ejemplares del libro " + libro1.getNombre() + " prestados" +" \n\n");
		}
		pausa();
		//Devolucion de libro2
		
				if(libro2.devolucion()) {
					System.out.println("Se ha devuelto un ejemplar del libro: "+ libro2.getNombre() + " del autor: " + libro2.getAutor()+ "\n\n");
					System.out.println("Cantidad Total de libros Disponibles: "+ (libro2.getEjemplares()-libro2.getcantidadp())+ "\n \n" );
				}
				else
				{
					System.out.println("No existen ejemplares del libro " + libro2.getNombre() + " prestados"+ " \n\n");
				}	
				//Devolucion de libro3
			pausa();
			
				if(libro3.devolucion()) {
					System.out.println("Se ha devuelto un ejemplar del libro: "+ libro3.getNombre() + " del autor: " + libro3.getAutor()+ "\n\n");
					System.out.println("Cantidad Total de libros Disponibles: "+ (libro3.getEjemplares()-libro3.getcantidadp())+ "\n \n" );
				}
				else
				{
					System.out.println("No existen ejemplares del libro " + libro3.getNombre() + " prestados "+ "\n\n");
				}
	}

public static void pausa() {
	
	String seguir;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Press Enter key to continue...");
    try
    {
        seguir = teclado.nextLine();
       
    }
    catch(Exception e)
    {}

}
}
