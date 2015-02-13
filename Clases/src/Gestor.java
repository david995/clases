import java.util.*;
import java.io.*;

public class Gestor {
	
	
	public static int menu(Scanner tec){
		
		System.out.println("***********	MENU	PRINCIPAL	***********");
		System.out.println("1.	Número	de	trabajadores");
		System.out.println("2.	Buscar	datos	de	un	trabajador");
		System.out.println("3.	Añadir	un	trabajador");
		System.out.println("4.	Borrar	un	trabajador");
		System.out.println("5.	Listar	trabajadores");
		System.out.println("6.	Histograma");
		System.out.println("0.	Terminar");
		System.out.println("*******************************************");
		
		System.out.printf("Elige una opción: ");
		int opcion = tec.nextInt();
		return opcion;
		}
	
	
		public static void main(String[] args) throws FileNotFoundException{
			
			Empresa e1 = new Empresa();
		
			Scanner tec = new Scanner(System.in);
			int opcionusuario;
			int dni;
			do{
			opcionusuario = menu(tec);
			//if (opcionusuario == 0){
			//}else{
			switch(opcionusuario){
			case 0:
				e1.guardar("trabajadore.txt");
			break;
			case 1:
				System.out.println("Numero de trabajadores");
					System.out.println(e1.getNumTrabajadores());
					break;
			
			case 2:
				System.out.println("Introduce el DNI de un trabajador");
				dni=tec.nextInt();
				if(e1.existeEmpleado(dni)==true){
					System.out.println(e1.getInfoEmpleado(dni));
				}else{
					System.out.println("Error al mostral al trabajador ( dni erroneo )");
				}
				break;
			case 3:
				
			System.out.println("Introduce el nombre de un trabajador: ");
				String nombre = tec.next();
				System.out.println("Introduce el DNI de un trabajador:");
				String dni1 = tec.next();
				System.out.println("Introduce la antiguedad de un trabajador:");
				int antiguedad = tec.nextInt();
				System.out.println("Introduce el salario de un trabajador:");
				int salario = tec.nextInt();
				System.out.println("Introduce el departamento de un trabajador:");
				String departamento = tec.next();
				
				Trabajadores t1 = new Trabajadores(nombre, dni1, antiguedad, salario, departamento);
				
				e1.anyadirEmpleado(t1);
				break;
			case 4:
				System.out.println("Introduce el DNI de un trabajador");
				dni=tec.nextInt();
				if(e1.existeEmpleado(dni)==true){
					e1.cancelarEmpleado(dni);
				}else{
					System.out.println("Error al mostral al trabajador ( dni erroneo )");
				}
				break;
			case 5:
				System.out.print(e1.listarEmpleados());
				break;
			case 6:
				System.out.println(e1.toHistograma());
				break;
			}
			//}
			}while(opcionusuario!=0);
		
			}
		}
	


