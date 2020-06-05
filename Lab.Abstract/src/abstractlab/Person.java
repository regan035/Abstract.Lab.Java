package abstractlab;

public abstract class Person {
	
	protected String firstName;
	protected String lastName;
	
	public abstract double taxes(double amount);
	
	public double calTelPhonBill(double amount) {
		return this.taxes(amount)+amount;
	}
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	
}
