package testJava.test;

public class SpilitStringWord {

	public static void main(String[] args) {
	
		String src = "Java, Selenium,TestNg,POM,Mavan";
        
		String[] s1 = src.split(",");
		for(String s: s1) {
			System.out.println(s.trim());
		}
	}

}
