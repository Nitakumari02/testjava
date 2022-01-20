package lambdaExpression;

import java.util.ArrayList;
import java.util.function.Predicate;

class EmployeeNew {

	String Ename;
	int Esal;
	int Eyear;

	public EmployeeNew(String name, int sal, int year) {
		Ename = name;
		Esal = sal;
		Eyear = year;
	}}

public class Employee2 {

	public static void main(String[] args) {

		// First Program
		EmployeeNew emp1 = new EmployeeNew("Nita", 60000, 5);
		Predicate<EmployeeNew> p = e -> (e.Esal > 30000 && e.Eyear > 3);
		//System.out.println(p.test(emp1)); // Ture

		// Second program

		ArrayList<EmployeeNew> arr = new ArrayList<EmployeeNew>();
		arr.add(new EmployeeNew("Nita2", 70000, 12));
		arr.add(new EmployeeNew("Nita3", 25000, 3));
		arr.add(new EmployeeNew("Nita4", 90000, 4));
		arr.add(new EmployeeNew("Nita5", 1400, 5));
		arr.add(new EmployeeNew("Nita6", 80000, 9));
		arr.add(new EmployeeNew("Nita7", 60000, 10));

		// program for Predicate.and() , Predicate.or() and Predicate.negate()

		Predicate<EmployeeNew> p1 = e1 -> (e1.Esal > 1500);
		Predicate<EmployeeNew> p2 = e2 -> (e2.Eyear > 6);

		for (EmployeeNew EN : arr) {
			if (p1.or(p2).test(EN)) {
				// System.out.println("Or condition Employee name "+EN.Ename+" salaray is :- "+EN.Eyear);
			}
			if (p1.and(p2).test(EN)) {
				//System.out.println("AND condition Employee name " + EN.Ename + " salaray is :- " + EN.Eyear);
			}
			if (p1.or(p2.negate()).test(EN)) {
				System.out.println("with Negate or Employee name " + EN.Ename + " salaray is :- " + EN.Eyear);
			}
			if (p1.and(p2.negate()).test(EN)) {
				//System.out.println("with Negate and Employee name " + EN.Ename + " salaray is :- " + EN.Eyear);
			}
		}

	}

}
