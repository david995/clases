import java.io.*;
import java.util.Scanner;


public class Empresa {
	
	//atributos
	
	private String nombre;
	private int antiguedadEmpresa;
	private int maxTrabajadores;
	private int numTrabajadores;
	private Trabajadores[] trabajadores;

	/*Un	constructor	que	lee	del	fichero	“TrabajadoresEmpresa.txt”	el	número	de	
trabajadores	e	inicializa	el	array/vector de	trabajadores	con	la	información	
de	cada	trabajador	que	aparece	en	el	fichero.*/
	
	public Empresa() throws FileNotFoundException{
		
		nombre = "PCCOMPONENTES";
		antiguedadEmpresa = 8;
		
		Scanner in = new Scanner(new FileReader("trabajadoresEmpresa.txt"));
		
		Scanner teclado = new Scanner(System.in);
		
		maxTrabajadores=in.nextInt();
		
		 trabajadores = new Trabajadores[maxTrabajadores];
		
		 int i=0;
		 while(in.hasNext()){

			 String tnombre = in.next();
			 String dni = in.next();
			 int antiguedad = in.nextInt();
			 int salario = in.nextInt();
			 String departamento = in.next();
			 
			 
			 Trabajadores t1 = new Trabajadores(tnombre,dni,antiguedad,salario,departamento);
			 
			 trabajadores[i] = t1; 
			 
			 i++; 
				 
	    }//while
		
		numTrabajadores = i;
	}//constructor empresa
	
	//metodos
	
	public int getNumMáximoTrabajadores(){
		return maxTrabajadores;
	}
	
	public int getNumTrabajadores(){
		return numTrabajadores;
	}
	
	public String getNombreEmpresa(){
		return nombre;
	}
	public void anyadirEmpleado(Trabajadores e){
		boolean existe =existeEmpleado(Integer.parseInt(e.getDNI()));
		boolean insertado=false;
		if(existe==true && numTrabajadores!=maxTrabajadores){
		for (int i = 0; i < maxTrabajadores && insertado==false; i++) {
			if(trabajadores[i]==null){
		trabajadores[i]=e;
		numTrabajadores=numTrabajadores+1;
		insertado=true;
			}
		}
		}
	}
	public String cancelarEmpleado(int numDni){
		String cadenatrue="Empleado	borrado	del	sistema";
		String cadenafalse="Imposible realizar la cancelacion: el DNI numDni no existe";
		boolean borrado = false;
		for (int i = 0; i < maxTrabajadores && borrado==true; i++) {
			if(existeEmpleado(numDni)==true){
				trabajadores[i]=null;
				numTrabajadores=numTrabajadores-1;
				borrado=true;
				return cadenatrue;
			}else{
				return cadenafalse;
			}//else
		}//for
		return cadenafalse;
	}
	
	
	public boolean existeEmpleado(int numDni){
		String cadenaDni = String.valueOf(numDni);//si es un String se cambia a String y si es cualquier otro al otro.
		boolean existe=false;
		//Integer.parseInt(cadena); cambia cadena a int 
		for (int i = 0; i < maxTrabajadores && existe==false; i++) {
			if(trabajadores[i]!=null){
			if(cadenaDni.equals(trabajadores[i].getDNI())){
				existe=true;
			}
			}
		}
		return existe;
	}
	public int getIdEmpleado(int numDni){
		String cadenadni = String.valueOf(numDni);
		int posicion=-1;
		boolean encontrado = false;
		for (int i = 0; i < trabajadores.length && !encontrado; i++) {
			if(cadenadni.equals(trabajadores[i].getDNI())){
				posicion = i;
				encontrado = true;
			}else{
			System.out.println("Imposible de mostrar la información (DNI no válido o no encontrado)");
			}
			
		}//for
		return posicion;
	}
	public String getInfoEmpleado(int numDni){
		int posicion = getIdEmpleado(numDni);
		String cadena = trabajadores[posicion].toString();
		return cadena;
	}
	public String listarEmpleados(){
		String lista=" ";
		for (int i = 0; i < trabajadores.length; i++) {
			if(trabajadores[i]!=null){
			lista = lista + trabajadores[i].toString()+"\n";
		
			}
		}
		return lista;
	}
	public void guardar(String fich) throws FileNotFoundException{
		PrintWriter out = new PrintWriter(fich);
		out.println(listarEmpleados());
		out.close();
		System.out.println("Se ha escrito en el fichero");
	}
	public String toHistograma(){
		String cadenahistograma="";
		int[] histograma = new int[antiguedadEmpresa+1];
		for (int i = 0; i < trabajadores.length; i++) {
			if(trabajadores[i]!=null){
			histograma[trabajadores[i].getAntiguedad()]++;
			}
		}
		for (int i = 0; i < histograma.length; i++) {
			cadenahistograma=cadenahistograma+i+"años: ";
			for (int j = 0; j < histograma[i]; j++) {
				cadenahistograma=cadenahistograma+" *";	
			}
			cadenahistograma=cadenahistograma+"\n";	
		}
		return cadenahistograma;
	}
	
}
