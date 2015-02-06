
public class PruebaCirculo {
	
	public static void main(String args[]){
		
		
		//Crear el objeto
		Circulo c = new Circulo();
		
		//Dar valores a los atributos
		
		//c.radio = 2;
		c.asignaRadio(2);
		
		//operaciones -->se llama a los métodos
		System.out.println("La longitud del circulo es:");
		System.out.println(c.longitud());
		
	}//main

}
