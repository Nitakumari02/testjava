package lambdaExpression;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class EmployeeList {
	String Ename;
	int Esal;

	public EmployeeList(String Ename, int Esal) {
		this.Ename = Ename;
		this.Esal = Esal;
	}
}

public class FunctionalInterfaces2 {

	public static void main(String[] args) {

		ArrayList<EmployeeList> ae = new ArrayList<EmployeeList>();
		ae.add(new EmployeeList("Rohan", 40000));
		ae.add(new EmployeeList("Joy", 10000));
		ae.add(new EmployeeList("Sunday", 60000));
		ae.add(new EmployeeList("Pou", 17000));
		ae.add(new EmployeeList("Salu", 210000));
		ae.add(new EmployeeList("Testing", 5000));

		Function<EmployeeList, Integer> fn = e -> {
			int salary = e.Esal;
			if (salary >= 10000 && salary <= 20000) {
				return (salary * 10 / 100);
			} else if (salary >= 20000 && salary <= 30000) {
				return (salary * 10 / 100);
			}

			else if (salary >= 30000 && salary <= 40000) {
				return (salary * 10 / 100);
			} else {
				return (salary * 50 / 100);
			}

		};

		Predicate<Integer> p = n -> (n > 5000); //Predicates 

		for (EmployeeList Emp : ae) {
			int bonus = fn.apply(Emp);  //Function 
			if (p.test(bonus)) {
				System.out.println((Emp.Ename + " " + Emp.Esal));
				System.out.println("Bonus is " + bonus);
			}
		}

	}

}
