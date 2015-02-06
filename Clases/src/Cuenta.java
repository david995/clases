
public class Cuenta {
	
	//atributos
	private long ncuenta;
	private long DNI;
	private int saldo;
	private int interes;
	
	//constructor
	
	public Cuenta(){
		ncuenta=324324797;
		DNI=45654546;
		saldo=5000;
		
	}
	
	//metodos

	public void ingresar(int valorx){
		saldo=saldo + valorx;
	}
	
	public void retirar(int valorx){
		saldo=saldo-valorx;
	}
	
	public void mostrardatos(){
		System.out.println("numero de cuenta: "+ncuenta);
		System.out.println("DNI :"+DNI);
		System.out.println("saldo"+saldo);
	}
	
}
