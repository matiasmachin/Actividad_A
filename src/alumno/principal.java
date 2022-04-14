package alumno;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		alumno a = new alumno("79606996Z","Matias", "Machin", "Calle Los Pinos 7",1976);
		alumno b= new alumno("11111111A","Jose", "Rodriguez", "Calle Los Almendros",1993);
		alumno c = new alumno("22222222B","Ana", "Perez", "Calle Los Corchos ",2000);
			
		System.out.println(a.toString()+"\n\n");
		System.out.println(b.toString()+"\n\n");
		System.out.println(c.toString()+"\n\n");
		
		}
	}

