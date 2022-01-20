package lambdaExpression;

@FunctionalInterface
interface Cab {
	public void book();
}

//Using lambda expression we can ignore this method 

  class Ola implements Cab { public void book() {
   System.out.println("Ola cab is booked...................."); } }
 

public class Test {

	public static void main(String[] args) {
		
		  Cab c = new Ola(); 
		  c.book();
		 
		/*
		 * Cab c= ()->System.out.println("Ola cab is booked....."); c.book();
		 */
	
	}

}
