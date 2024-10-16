package tamilnadu.coimbatore;

public class Theatre {

	public static void main(String[] args) {
		Theatre raja=new Theatre();
		int balance=raja.bookTicket(200);
		System.out.println("After booking ticket " + balance);

	}
	public int bookTicket(int amount)
	{
		int ticket_price=120;
		int balance=amount-ticket_price;	
		return balance;
	}
}
