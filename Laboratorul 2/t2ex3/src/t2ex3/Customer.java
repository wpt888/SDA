package t2ex3;

public class Customer {
	
	private Adress adress;
	private PaymentMethod paymentMethod;
	private String lastName;
	private String firstName;
	private int age;
	
	public Customer(Adress adress,PaymentMethod pm,String lastName,String firstName,int age) {
		
		this.adress=adress;
		this.paymentMethod=pm;
		this.lastName=lastName;
		this.firstName=firstName;
		this.age=age;
	}
	
	public String getCompleteName() {
		return (firstName + ", " + lastName);
	}

	public Adress getAdress() {
		return adress;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getAge() {
		return age;
	}
}