// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

                String word = (args [0]);
                int numberOflines = Integer.parseInt(args[1]);        
              
               
                for (int i = 0; i < word.length(); i++){
                        char currentLetter = word.toUpperCase().charAt(i);
                        String lettersForAn = "AEFHILMNORSX";

                        if (lettersForAn.indexOf(currentLetter)>= 0){
                        System.out.println("Give me an " + currentLetter + ": " + currentLetter + "!" ); 
                        }

                        else{
                                System.out.println("Give me a  " + currentLetter + ": " + currentLetter + "!" ); 
                        }
                                
                        
                                
                }  

                System.out.println("What does that spell? ");

                for (int line = 0; line < numberOflines; line++){
                        
                        System.out.println(word.toUpperCase()+ "!!!");

                

                                  
                        
                }


}

        }
