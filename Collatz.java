// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]){
	    int n = Integer.parseInt(args[0]);
		String mode = args [1];
		boolean isVerbose = mode.equals("v");


		for(int seed = 1; seed <= n; seed++){
			int currentSeed = seed;
			String hailstoneSequence = "";
			int steps = 0; 

			if(isVerbose){
				hailstoneSequence += seed;
			}

			while (currentSeed != 1){
				if (currentSeed % 2 == 0){
					currentSeed /= 2;
				}else{
					currentSeed = ( 3 * currentSeed ) + 1;
				}

				steps++;
				if (isVerbose){
					hailstoneSequence += " " + currentSeed;
				}
			}
				if (isVerbose){
					System.out.println( hailstoneSequence + "(" + ( steps + 1 ) + ")");

			}
		}


			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");



		
	}
	}


