package t2ex3;



public class Main {
	
	public static void main(String[] args) {
		
		Adress address=new Adress("Brașov","13 Decembrie",90);
		PaymentMethod pm= new PaymentMethod("Cash");
		Customer c = new Customer(address, pm, "Vlad-Andrei", "Oprea", 22);
		
		System.out.println(c.getCompleteName());
		System.out.println(c.getAdress().getFullAdress());
		System.out.println(c.getPaymentMethod().getType());
	}
}