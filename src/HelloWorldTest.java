import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.io.InputStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelloWorldTest {
	
	//private static final double PI = 3.14;
	//Constant / read-only
	private static ByteArrayOutputStream out;
	//private static final ByteArrayOutputStream out = new ByteArrayOutputStream();
	private static final ByteArrayOutputStream err = new ByteArrayOutputStream();
	private static final PrintStream originalOut = System.out;
	private static final PrintStream originalErr = System.err;
	private static final InputStream originalIn = System.in;

	@BeforeEach
	void setUp() throws Exception {
	    //System.setOut(new PrintStream(out));
	    System.setErr(new PrintStream(err));
	}

	@AfterEach
	void tearDown() throws Exception {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	    System.setIn(originalIn);
	}
	
	void resetInputOutputStream(String testInput) {
		InputStream targetStream = new ByteArrayInputStream(testInput.getBytes());
		System.setIn(targetStream);
		out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
	}
	
	void flexibleAssertHello(String testInput) {
		String actualOutput = out.toString().strip();
		actualOutput = actualOutput.replaceAll(" ", "");
		actualOutput = actualOutput.replaceAll(":", "");
		actualOutput = actualOutput.replaceAll(",", "");
		actualOutput = actualOutput.replaceAll("\n", "");
		actualOutput = actualOutput.replaceAll("\r", "");
		actualOutput = actualOutput.replaceAll("\t", "");
		testInput = testInput.replaceAll("\n","");
		
		assertTrue (
			actualOutput.equalsIgnoreCase("PleaseInputYourNameHello" + testInput) ||
			actualOutput.equalsIgnoreCase("InputYourNameHello" + testInput) ||
			actualOutput.equalsIgnoreCase("Hi" + testInput)
		);
	}
	
	@Test
	void test() throws IOException{
		
		String testString = "Brendan\n";
		
		resetInputOutputStream(testString);
		HelloWorld.main(null);
		flexibleAssertHello(testString);
	}
	
	@Test
	void test2() throws IOException{
		
		String testString = "Brendan\n";
		
		resetInputOutputStream(testString);
		HelloWorld2.main(null);
		flexibleAssertHello(testString);	
	}
	@Test
	void test3() throws IOException{
		
		String testString = "Brendan\n";
	
		resetInputOutputStream(testString);
		HelloWorldV3.main(null);
		flexibleAssertHello(testString);	
	}
}
