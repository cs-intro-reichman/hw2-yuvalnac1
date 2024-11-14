// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int highestSeed = Integer.parseInt(args[0]);
		String mode = args[1];
		boolean verbose  = mode.equals("v");
		int currentNum;
		int numOfSteps;
		
		for (int seed = 1; seed < highestSeed + 1; seed++) {
			currentNum = seed;
			numOfSteps = 1;
			if (verbose) {
				System.out.print(currentNum + " ");
			}
			do {
				if (currentNum % 2 == 0){
					currentNum /= 2;
				}
				else {
					currentNum = currentNum * 3 + 1;
				}
				if (verbose) {
					System.out.print(currentNum + " ");
				}
				numOfSteps ++;
			} while (currentNum != 1);
			if (verbose) {
				System.out.println("(" + numOfSteps + ")");
			}
		}
		System.out.println("Every one of the first " + highestSeed + " hailstone sequences reached 1.");
	}
}
