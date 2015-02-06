
public class Circulo {
	
	//atributo
	
	double radio;
	
	//metodos
	
	public void asignaRadio(double valor){
		radio = valor;
	}
	
	
	public double daRadio(){
		return radio;
	}
	
	public double longitud(){
		return (2*3.14*radio);
	}
	
	
	public double area(){
		double area = 3.14*radio*radio;
		return (area);
	}
	
	public boolean mayorQue(Circulo otroCirculo){
		boolean mayor = false;
		if(this.area() > otroCirculo.area()){
			mayor = true;
		}
		return(mayor);
	}
	
}
