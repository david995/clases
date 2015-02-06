
public class TicketMachine {
	
	
	//atributos
	private int price;//precio del ticket de la maquina
	
	private int balance;
	
	private int total;
	
	//constructor
	public TicketMachine(int ticketCost){
		price=ticketCost;
	}

	
	
	//metodos
	
	public int getPrice(){
		return price;
	}
	
	public int getBalance(){
		return balance;
	}

	public void insertMoney(int amount){
		if(amount>0){
			balance=balance+amount;
		}
	}
	
	public void printTicket(){
		if(balance>=price){
			//imprimir ticket
			balance = balance - price;
			total = total + price;
			System.out.println("Se ha imprimido el ticket");
		}else{
			//no se puede imprimir el ticket
			System.out.println("No se puede imprimir el ticket");
			System.out.println("La cantidad que le falta es: "+(price-balance));
		}
	}
		
	//public int refundBalance(){
		
	//}

	
}
