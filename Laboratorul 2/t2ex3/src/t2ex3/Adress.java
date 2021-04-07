package t2ex3;

public class Adress {

	private String street;
	private String city;
	private int number;
	
	public Adress(String city,String street,int number){
		this.city=city;
		this.street=street;
		this.number=number;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getStreet() {
		return street;
	}

	public int getNumber() {
		return number;
	}

	public String getFullAdress() {
		return (getCity() + ", " + getStreet() + ", " +getNumber());
	}
}