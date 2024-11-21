// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

                String wordOfEncouragement = (args[0]);
                int numberOflines = Integer.parseInt(args[1]);

                //Convert the word to uppercase using ASCII manipulatio
                String upperCaseWordEncouragement = "";

                for (int j = 0; j < wordOfEncouragement.length(); j++) {
                        char letter = wordOfEncouragement.charAt(j);

                        if (letter >= 'a' && letter <= 'z'){
                            upperCaseWordEncouragement += (char) (letter -32);
                        } else{
                                upperCaseWordEncouragement += letter;
                }
        }

                        // Define the letters that require "an" in the cheer  
                        String lettersForAn = "AEFHILMNORSX";

                        ///////// Iterate over each character in the word to generate the cheer
                for (int i = 0; i < upperCaseWordEncouragement.length(); i++){
                             char currentChar = upperCaseWordEncouragement.charAt(i); 
                             
                        // Check if the character requires "an" or "a"
                        if (lettersForAn.indexOf(currentChar) >= 0) {
                                System.out.println("Give me an " + currentChar + ": " + currentChar + "!");
                        }else {

                                System.out.println("Give me a  " + currentChar + ": " + currentChar + "!");
                        }

                }
                        // Print the final cheer with the number of lines specified
                        System.out.println("What does that spell?");

                for (int line = 0; line < numberOflines; line++) {
                        System.out.println(upperCaseWordEncouragement + "!!!");

                }

                

        }
}
