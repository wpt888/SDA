package lab5p1;

public class Student {
	private String name;
	private String lastname;
	private double math;
	private double ro;

	public Student(String Nume, String Prenume, double Matematica, double Romana) {
		this.name = Nume;
		this.lastname = Prenume;
		this.math = Matematica;
		this.ro = Romana;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getRo() {
		return ro;
	}

	public void setRo(double ro) {
		this.ro = ro;
	}

	public String toString() {
		return "Name: " + name + "\n" + "Last name: " + lastname + "\n" + "Math: " + math + "\n" + "Ro: " + ro + "\n";
	}
}
