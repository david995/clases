import java.util.*;


public class PruebaCalculadora {
	
	public static void main(String args[]){
		
		Calculadora c1 = new Calculadora(8,5);
		
		
		Scanner teclado = new Scanner(System.in);

		System.out.println(c1.printoperacion());
		c1.suma();
		System.out.println(c1.printoperacion());
		
		
	}

}
