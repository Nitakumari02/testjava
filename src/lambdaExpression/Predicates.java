package lambdaExpression;

import java.util.function.Predicate;

public class Predicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> p = i -> (i > 10);

		System.out.println(p.test(10)); // False
		System.out.println(p.test(15)); // True
		System.out.println(p.test(6)); // False

		Predicate<String> p2 = s -> (s.length() > 4);

		System.out.println(p2.test("Test")); // False
		System.out.println(p2.test("TestAutomation")); // True
		System.out.println(p2.test("TestManual")); // True

		String[] a = { "Test", "TestAutomation", "TestManual", "SQLjob", "Jmeter" };

		for (String s : a) {
			if (p2.test(s)) {
				System.out.println(s);
			}
		}

	}

}
