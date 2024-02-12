
public class QuadraticEqCalc {
	public static boolean hasRealRoots(double a, double b, double c) {
		return (b*b - 4*a*c) >= 0;}
	public static double getRoot1(double a, double b, double c) {
		return (-b - Math.sqrt(b*b - 4*a*c))/(2*a); }
	public static double getRoot2(double a, double b, double c) {
		return (-b + Math.sqrt(b*b - 4*a*c))/(2*a);}
}
