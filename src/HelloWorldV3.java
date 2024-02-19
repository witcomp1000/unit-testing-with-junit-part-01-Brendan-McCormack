import java.util.Scanner;

public class HelloWorldV3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//This means that it is scanning from the keyboard
		
		System.out.println("Pleaseinputyour              name: ");
		String name = s.next();
		System.out.println("Hello, " + name);
		s.close();
	}

}