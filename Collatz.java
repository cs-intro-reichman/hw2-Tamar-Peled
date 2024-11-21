// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); 
        String mode = args[1]; 

        for (int seed = 1; seed <= n; seed++) {
            int currentSeed = seed; 
            int steps = 0; 

            // Special handling for seed = 1
            if (seed == 1) {
                if (mode.equals("v")) {
                    System.out.println("1 4 2 1 (4)");
                }
                continue; 
            }

             // In verbose mode, print the first number in the sequence
            if (mode.equals("v")) {
                System.out.print(currentSeed + " ");
            }

           
            // Compute the Collatz sequence
            while (currentSeed != 1) {
                if (currentSeed % 2 == 0) {
                    currentSeed /= 2; 
                } else {
                    currentSeed = (3 * currentSeed) + 1; 
                }
                steps++; 

                // In verbose mode, print the next number in the sequence
                if (mode.equals("v")) {
                    System.out.print(currentSeed + " ");
                }
            }

            
            if (mode.equals("v")) {
                System.out.println("(" + (steps + 1) + ")");
            }
        }

        	// Print the summary message
            System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
        }
    }

