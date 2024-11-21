// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

                String word = (args[0]);
                int numberOflines = Integer.parseInt(args[1]);

                //Convert the word to uppercase using ASCII manipulatio
                String upperCaseWord = "";

                for (int j = 0; j < word.length(); j++) {
                        char letter = word.charAt(j);

                        if (letter >= 'a' && letter <= 'z'){
                            upperCaseWord += (char) (letter -32);
                        } else{
                                upperCaseWord += letter;
                }
        }

                        // Define the letters that require "an" in the cheer  
                        String lettersForAn = "AEFHILMNORSX";

                        // Iterate over each character in the word to generate the cheer
                for (int i = 0; i < upperCaseWord.length(); i++){
                             char currentChar = upperCaseWord.charAt(i); 
                             
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
                        System.out.println(upperCaseWord + "!!!");

                }

                

        }
}
