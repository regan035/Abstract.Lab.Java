package abstractlab;

public class Student extends Person implements Bill{

	@Override
	public double taxes(double amount) {
		// TODO Auto-generated method stub
		return amount*.02;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}


	public double gas(double amount) {
		// TODO Auto-generated method stub
		return this.taxes(amount)+amount;
	}

	public double carins(double amount) {
		// TODO Auto-generated method stub
		return this.taxes(amount)+amount;
	}

	@Override
	public double gas() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double carins() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
