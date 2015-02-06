
public class Cafetera {
	
	//atributos
	private int capacidadmax;
	private int cantidadactual;
	//constructor
	public Cafetera(){
		capacidadmax=1000;
		cantidadactual=0;
			
		
	}
	public Cafetera(int capacidadM){
		capacidadmax = capacidadM;
		cantidadactual = capacidadmax;
	}
	
	public Cafetera(int capacidadM, int cantidadA){
		
		cantidadactual=cantidadA;
		capacidadmax = capacidadM;
		
		if(cantidadactual>capacidadmax){
			cantidadactual=capacidadmax;
		}
	}
	
	//metodos
	
	public void llenarCafetera(){
		cantidadactual=capacidadmax;
	}
	
	public void servirTaza(int taza){
		cantidadactual=cantidadactual - taza;
		System.out.println("Se ha servido una taza de "+taza);
	}
	
	public void vaciarCafetera(){
		cantidadactual=0;
	}
	
	public void mostrarcapacact(){
		System.out.println("La cantidad actual es de:"+cantidadactual);
	}
	
	public void agregarCafe(int agregar){
		cantidadactual=cantidadactual+agregar;
		if(cantidadactual>capacidadmax){
			cantidadactual=capacidadmax;
		}
	}
	

}
