// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

		int numbersOfTerms =Integer.parseInt(args[0]);
		double sum = 0;
		

		for(int i = 0; i < numbersOfTerms; i++){

			sum += Math.pow(-1, i)/(2*i +1);
		}

		double piApproximated = 4* sum;

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + piApproximated );

	    
	}
}
