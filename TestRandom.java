
public  class  TestRandom {
	public static void main(String[]  args) {

		int n = Integer.parseInt(args[0]);
		
		int lessThenHalf=0;
		int greaterOrEqualHalf=0;
		

		for (int i = 0; i<n; i++){
		double random = Math.random();
			if (random< 0.5){
				lessThenHalf++;
			}

			else{
				greaterOrEqualHalf++;
				
			}
	    
	}
	
	System.out.println("> 0.5: " + lessThenHalf + " times");
	System.out.println("<= 0.5: " +greaterOrEqualHalf + " times");
	

	if (lessThenHalf>0 && greaterOrEqualHalf>0){

		double ratio = (lessThenHalf < greaterOrEqualHalf)
				 ? (double) lessThenHalf/greaterOrEqualHalf : (double) greaterOrEqualHalf/lessThenHalf;
		System.out.println("Ratio: " + "" +ratio);
}
	

		
		
}

}
