
public class Calculadora {
	
	//atributos
	
	private int n1;
	private int n2;
	private int resultado;
	
	//constructor
	
	public Calculadora(int valorn1, int valorn2){
		n1=valorn1;
		n2=valorn2;
				
	}

	//metodos
	
	public void suma(){
		resultado=n1+n2;
		
	}
	
	public void resta(){
		resultado=n1-n2;
	}
	
	public void multiplicacion(){
		resultado=n1*n2;
	}

	public void division(){
		resultado=n1/n2;
	}
	
	public int printoperacion(){
		return resultado;
	}
	
	
}//class
