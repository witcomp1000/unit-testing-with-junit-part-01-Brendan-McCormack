import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//This means that it is scanning from the keyboard
		
		System.out.println("Please input your name: ");
		String name = s.next();
		System.out.println("Hello, " + name);
		s.close();
	}

}