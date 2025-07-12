import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		//Creamos un objeto Scanner para recibir datos del teclado
		Scanner sc = new Scanner(System.in);
		
		//Creamos un objeto del tipo MaestroRepository para usar los métodos de la interfaz MaestroRepository
		MaestroRepositoryImpl maestroRepositoryImpl = new MaestroRepositoryImpl();
		
		//Preguntamos cuantas maestros queremos agregar a la lista
		System.out.print("Cuántos maestros quieres agregar?");
		int cantidad = sc.nextInt();
		System.out.println();
		
		//Preguntamos los datos de cada maestro
		for(int i = 1; i<=cantidad; i++){
			
			System.out.print("Dame el nombre del maestro #" + i + ": ");
			String nombre = sc.next();
			
			System.out.print("Dame el primer apellido del maestro #" + i + ": ");
			String primerApellido = sc.next();
			
			System.out.print("Dame el segundo apellido del maestro #" + i + ": ");
			String segundoApellido = sc.next();
			
			System.out.print("Dame la edad del maestro #" + i + ": ");
			int edad = sc.nextInt();
			
			System.out.print("Dame el ID del maestro #" + i + ": ");
			int id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("Dame el correo del maestro #" + i + ": ");
			String correo = sc.next();
			
			System.out.print("Dame el departamento del maestro #" + i + ": ");
			String departamento = sc.next();
			
			sc.nextLine();
			
			System.out.print("Dame el salario del maestro #" + i + ": ");
			double salario = sc.nextDouble();
			
			//Usamos el método guardar del objeto para guardar una instancia de la clase Maestro en el ArrayList
			maestroRepositoryImpl.guardar(new Maestro(nombre,primerApellido,segundoApellido,edad,id,correo,departamento,salario));
			
			//Avisamos que los datos se han guardado
			System.out.println("Maestro #" + i + " guardado.");
			System.out.println();
		}//for 
		
		
		//Usamos el método mostrarTodos para mostrar los maestro del ArrayList
		maestroRepositoryImpl.mostrarTodos();
		
		sc.close();
		
	}//main
	
}//Main
