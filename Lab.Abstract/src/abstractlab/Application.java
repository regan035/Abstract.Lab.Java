package abstractlab;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Employee e1 = new Employee();
		Person p1 = new Student();
		Person p2 = new Employee();
		
		double s1PhoneBill = s1.calTelPhonBill(120.5);
		double e1PhoneBill = e1.calTelPhonBill(120.5);
		double p1PhoneBill = p1.calTelPhonBill(120.5);
		double p2PhoneBill = p2.calTelPhonBill(120.5);
		System.out.println("S1 Phone Bill : "+s1PhoneBill);
		System.out.println("E1 Phone Bill : "+e1PhoneBill);
		System.out.println("P1 Phone Bill : "+p1PhoneBill);
		System.out.println("P2 Phone Bill : "+p2PhoneBill);
		
		s1.setFirstName("Gen");
		s1.setLastName("Li");
		e1.setFirstName("Lesley");
		e1.setLastName("Lu");
		p1.setFirstName("Luna");
		p1.setLastName("Black");
		p2.setFirstName("Leo");
		p2.setLastName("Caat");	
		
		String s1first = s1.getFirstName();
		String s1last  = s1.getLastName();
		String e1first = e1.getFirstName();
		String e1last  = e1.getLastName();
		String p1first = p1.getFirstName();
		String p1last  = p1.getLastName();
		String p2first = p2.getFirstName();
		String p2last  = p2.getLastName();		
		System.out.println("S1 name: "+s1first + " " + s1last);
		System.out.println("E1 name: "+e1first + " " + e1last);
		System.out.println("P1 name: "+p1first + " " + p1last);
		System.out.println("P2 name: "+p2first + " " + p2last);
		
		double s1tax = s1.taxes(1000);
		double e1tax = e1.taxes(1000);
		double p1tax = p1.taxes(1000);
		double p2tax = p2.taxes(1000);		
		System.out.println("S1 Tax: "+ s1tax);
		System.out.println("E1 Tax: "+ e1tax);
		System.out.println("P1 Tax: "+ p1tax);
		System.out.println("P2 Tax: "+ p2tax);
		
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<Employee> employees = new ArrayList<Employee>();
		School school = new School();
		students.add(s1);
		students.add((Student) p1);
		employees.add(e1);
		employees.add((Employee) p2);
		school.setStudents(students);
		school.setEmployees(employees);
		System.out.println(school.getEmployees());
		System.out.println(school.getStudents());
	} 

}
