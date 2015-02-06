import java.util.*;
import java.io.*;

public class pruebaTicketMachine {
	
	public static void main(String args[]){
		
		int precioTicket = 10;
		TicketMachine miMaquina = new TicketMachine(precioTicket);
		System.out.println("El precio del tricket es: "+miMaquina.getPrice());
		System.out.println("El balance es: "+miMaquina.getBalance());
		//Scanner teclado = new Scanner(System.in);
		//System.out.println("Introduce una moneda: ");
		//moneda = teclado.nextInt();
		miMaquina.insertMoney(20);
		System.out.println("El balance es: "+miMaquina.getBalance());
		miMaquina.printTicket();
	}

}
