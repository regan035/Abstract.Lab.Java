package abstractlab;

import java.util.ArrayList;
import java.util.List;



public class School {

		List <Student> students = new ArrayList <Student>();
		List <Employee> employees = new ArrayList <Employee>();
		public School() {
			
		}
		public School(List<Student> students, List<Employee> employees) {
			
			this.students = students;
			this.employees = employees;
		}
		public List<Student> getStudents() {
			return students;
		}
		public void setStudents(List<Student> students) {
			this.students = students;
		}
		public List<Employee> getEmployees() {
			return employees;
		}
		public void setEmployees(List<Employee> employees) {
			this.employees = employees;
		}
		
		
}
