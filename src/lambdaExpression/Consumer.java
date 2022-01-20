package lambdaExpression;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;


class Complany{
	String Ename;
	String geneder;
	int salary;
	
	public Complany(String Ename, String geneder,int salary) {
		this.Ename = Ename;
		this.geneder = geneder;
		this.salary = salary;
	}
}


public class Consumer {

	public static void main(String[] args) {
		
		ArrayList<Complany> arr = new ArrayList<Complany>();
		arr.add(new Complany("Ram","ma",10000));
		arr.add(new Complany("Rohan","Male",12000));
		arr.add(new Complany("Jou","Male",25000));
		arr.add(new Complany("Smith","Male",90000));
		arr.add(new Complany("Garr","Female",35000));
		arr.add(new Complany("PAM","Female",48000));
		
		Function<Complany,Integer> fn = e->(e.salary*10/100);  // function method 
		
		Predicate<Integer> p = b->(b>5000); //Predicates method
		
		 //Consumer <Complany> consumer1 = com->{ 		 };

	}

}
