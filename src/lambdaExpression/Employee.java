package lambdaExpression;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
	String Ename;
	int sal;
	int years;

	public Employee(String empName, int Empsal, int exe) {
		Ename = empName;
		sal = Empsal;
		years = exe;
	}

	public static void main(String[] args) {

		//First Program
		Employee emp1 = new Employee("Nita", 60000, 5);
		Predicate<Employee> p = e -> (e.sal > 30000 && e.years > 3);
		System.out.println(p.test(emp1)); // Ture
		
		//Second program 
		
		ArrayList<Employee> arr = new  ArrayList<Employee>();
		arr.add(new Employee("Nita2", 70000, 12));
		arr.add(new Employee("Nita3", 25000, 3));
		arr.add(new Employee("Nita4", 90000, 3));
		arr.add(new Employee("Nita5", 2000, 5));
		arr.add(new Employee("Nita6", 80000, 9));
		arr.add(new Employee("Nita7", 60000, 10));
		
		for(Employee e:arr) {
			if(p.test(e)) {
				System.out.println(e.Ename+"  "+e.sal+" "+e.years);
			}
		}
	}

}
