// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int numOfTerms = Integer.parseInt(args[0]);
		double result = 0;
		int denominator = 1;
		for (int i = 0; i < numOfTerms; i++){
			if (i % 2 == 0){
				result += 1.0 / denominator;
			}
			else {
				result -= 1.0 / denominator;
			}
			denominator += 2;
		}
		result *= 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:	 " + result);
	}
}
