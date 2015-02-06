
public class Trabajadores {
	
	//atributos
	
	private String Nombre;
	private String DNI;
	private int Antiguedad;
	private int Salario;
	private String Departamento;
	
	//constructores: Constructor	que	recibe	como	parámetros	de	entrada	el	nombre,	el	DNI,	la	
	//antiguedad,	el	salario,	y	el	departamento.
	
	public Trabajadores(String valornombre,String valordni, int valorant, int valorsalario, String valordepartamento){
		Nombre = valornombre;
		DNI = valordni;
		Antiguedad = valorant;
		Salario = valorsalario;
		Departamento = valordepartamento;
		
	}
	
	//metodos

	public String getNombre(){
		return Nombre;
	}
	public String getDNI(){
		return DNI;
	}
	public int getAntiguedad(){
		return Antiguedad;
	}
	public int getSalario(){
		return Salario;
	}
	public String getDepartamento(){
		return Departamento;
	}
	public String toString(){
		String Trabajador = Nombre+" "+DNI+" "+Long.toString(Antiguedad)+" "+Long.toString(Salario)+" "+Departamento;
		return Trabajador;
	}
	
	
}
