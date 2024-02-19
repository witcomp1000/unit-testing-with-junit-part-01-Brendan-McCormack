import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuadraticEqCalcTest {

	@Test
	void testTwoUniqueRoots01() {
		double a = 1.0, b = -7.0, c = 10.0;
		assertTrue(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = 2.0;
		double expRoot2 = 5.0;
		double TOLERANCE = 1.0e-6;
		assertEquals(expRoot1, calcRoot1, TOLERANCE);
		assertEquals(expRoot2, calcRoot2, TOLERANCE);
	}
	@Test
	void testImaginaryRoots01() {
		double a = 54.5, b = -11.0, c = 566.0;
		assertFalse(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = Double.NaN;
		double expRoot2 = Double.NaN;
		double TOLERANCE = 1.0e-6;
		assertEquals(expRoot1, calcRoot1, TOLERANCE);
		assertEquals(expRoot2, calcRoot2, TOLERANCE);
	}
	@Test
	void testTwoUniqueRoots02() {
		double a = 54.5, b = 1115.8, c = 566.0;
		assertTrue(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = -19.9529;
		double expRoot2 = -0.520492;
		double TOLERANCE = 1.0e-4;
		assertEquals(expRoot1, calcRoot1, TOLERANCE);
		assertEquals(expRoot2, calcRoot2, TOLERANCE);
	}
	@Test
	void testTwoNonUniqueRoots01() {
		double a = 2.0, b = 4.0, c = 2.0;
		assertTrue(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = -1.0;
		double expRoot2 = -1.0;
		double TOLERANCE = 1.0e-6;
		assertEquals(expRoot1, calcRoot1, TOLERANCE);
		assertEquals(expRoot2, calcRoot2, TOLERANCE);
	}
	@Test
	void testTwoUniqueRoots03() {
		double a = 2.0, b = 4.0, c = 0.0;
		assertTrue(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = -2.0;
		double expRoot2 = 0.0;
		double TOLERANCE = 1.0e-6;
		assertEquals(expRoot1, calcRoot1, TOLERANCE);
		assertEquals(expRoot2, calcRoot2, TOLERANCE);
	}
	@Test
	void testImaginaryRoots02() {
		double a = 0.0, b = 12.0, c = 5.0;
		assertTrue(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = Double.NEGATIVE_INFINITY;
		double expRoot2 = Double.NaN;
		double TOLERANCE = 1.0e-6;
		assertEquals(expRoot1, calcRoot1, TOLERANCE);
		assertEquals(expRoot2, calcRoot2, TOLERANCE);
	}
	@Test
	void testTwoUniqueRoots04() {
		double a = -2.0, b = 0.0, c = 32.0;
		assertTrue(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = 4.0;
		double expRoot2 = -4.0;
		double TOLERANCE = 1.0e-6;
		assertEquals(expRoot1, calcRoot1, TOLERANCE);
		assertEquals(expRoot2, calcRoot2, TOLERANCE);
	}
	@Test
	void testTwoNonUniqueRoots02() {
		double a = -2.0, b = 0.0, c = 0.0;
		assertTrue(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = 0.0;
		double expRoot2 = 0.0;
		double TOLERANCE = 1.0e-6;
		assertEquals(expRoot1, calcRoot1, TOLERANCE);
		assertEquals(expRoot2, calcRoot2, TOLERANCE);
	}
	@Test
	void testTwoUniqueRoots05() {
		double a = -2.0, b = 5.0, c = 12.0;
		assertTrue(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = 4.0;
		double expRoot2 = -1.5;
		double TOLERANCE = 1.0e-6;
		assertEquals(expRoot1, calcRoot1, TOLERANCE);
		assertEquals(expRoot2, calcRoot2, TOLERANCE);
	}
	@Test
	void testImaginaryRoots03() {
		double a = 1.0, b = 0.0, c = 12.0;
		assertFalse(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = Double.NaN;
		double expRoot2 = Double.NaN;
		double TOLERANCE = 1.0e-6;
		assertEquals(expRoot1, calcRoot1, TOLERANCE);
		assertEquals(expRoot2, calcRoot2, TOLERANCE);
	}
	@Test
	void testTwoUniqueRoots06() {
		double a = 3.0, b = 0.0, c = -12.0;
		assertTrue(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = -2.0;
		double expRoot2 = 2.0;
		double TOLERANCE = 1.0e-6;
		assertEquals(expRoot1, calcRoot1, TOLERANCE);
		assertEquals(expRoot2, calcRoot2, TOLERANCE);
	}
	@Test
	void testTwoNonUniqueRoots03() {
		double a = 2.0, b = 3.0, c = 1.125;
		assertTrue(QuadraticEqCalc.hasRealRoots(a, b, c));
		double calcRoot1 = QuadraticEqCalc.getRoot1(a, b, c);
		double calcRoot2 = QuadraticEqCalc.getRoot2(a, b, c);
		double expRoot1 = -0.75;
		double expRoot2 = -0.75;
		double TOLERANCE = 1.0e-6;
		assertEquals(expRoot1, calcRoot1, TOLERANCE);
		assertEquals(expRoot2, calcRoot2, TOLERANCE);
	}
}
