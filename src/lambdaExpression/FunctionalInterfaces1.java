package lambdaExpression;

import java.util.function.Function;

public class FunctionalInterfaces1 {

	public static void main(String[] args) {
		
		//Fist program 
		
		Function<Integer, Integer> fn = n->n*n;
		System.out.println(fn.apply(4)); //16
		System.out.println(fn.apply(14)); //196
		System.out.println(fn.apply(5));  //25

		//Second program 
		
		Function<String, Integer> fn2 = n->n.length();
		System.out.println(fn2.apply("Ramu")); //4
		System.out.println(fn2.apply("Joy"));  //3
		System.out.println(fn2.apply("Test manager ")); //13
		System.out.println(fn2.apply("Test Lead")); //9
		
	}

}
