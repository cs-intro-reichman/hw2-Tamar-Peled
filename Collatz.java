// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		String mode = (args [1]);

		

		for(int seed =1; seed <= n; seed++){
			 if (mode == "v"){
				System.out.println("seed" + seed + ": ");
			 }


		while (n != 1) {
			if (n % 2 ==0){
				n = n/2;
			}

				else{
					n = (n*3)+1;
				}

				System.out.print(n+ " ");

			

			}


				System.out.println("Every one of the first 7 hailstone sequences reched 1.");

		
	}
}
