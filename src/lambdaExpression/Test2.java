package lambdaExpression;


@FunctionalInterface
interface Cab2 {
	public String book(String Source, String destination);
}

//Using lambda expression we can ignore this method 
/*
 * class uber implements Cab2 { public String book(String Source, String
 * destination) {
 * System.out.println("Ola cab is booked.."+Source+" to "+destination);
 * return("price is 5000"); } }
 */
 

public class Test2 {

	public static void main(String[] args) {
		
		 // Cab2 c = new uber(); System.out.println(c.book("Patna", "Delhi"));
		 
		Cab2 c = (String Source, String destination) -> {System.out.println("Ola cab is booked.."+Source+" to "+destination);
		  return("price is 5000");};
		  c.book("Patna", "Delhi");

		 
		 

	}

}

