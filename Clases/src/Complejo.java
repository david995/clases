
public class Complejo {
	
	//Atributos
	
	public double pReal;
	public double pImag;

	//metodos
	
	public void asignar(double r, double i) {
		pReal = r;
		pImag = i;
	}
	
	public void sumar(Complejo n){
		pReal = pReal + n.pReal;
		pImag = pImag + n.pImag;
	}
	
public void sumar2(double r, double i){
	pReal = pReal + r;
	pImag = pImag + i;
	}
	
	public Complejo sumar3(double r, double i){
		Complejo n = new Complejo();
		n.pReal = pReal +r;
		n.pImag = pImag +i;
		return n;
	}
	
	public void imprimir(){
		System.out.println("pReal: "+pReal);
		System.out.println("pImag: "+pImag);
	}
		
		
	
}
