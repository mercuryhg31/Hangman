// HangmanRunner.java - The driver class to use the HangmanGame object and play hangman.
// A.Garg
 // March 2022

 public class HangmanRunner
 {
     public static void main(String[] args)
     {
		System.out.println("HHHHH    HHHHH  AAAAAAAAAA  NNNN     NNNN  GGGGGGGGGGG  MMMM     MMMM  AAAAAAAAAA  NNNN     NNNN\n"
				+ 		   "HHHHH    HHHHH  AAA    AAA  NNNNNN   NNNN  GGGGGGGGGGG  MMMMM   MMMMM  AAA    AAA  NNNNNN   NNNN\n"
				+ 		   "HHHHH    HHHHH  AAA    AAA  NNNNNNNN NNNN  GGG          MMMMMMMMMMMMM  AAA    AAA  NNNNNNNN NNNN\n"
				+ 		   "HHHHHHHHHHHHHH  AAAAAAAAAA  NNNN NNNNNNNN  GGG    GGGG  MMMM MMM MMMM  AAAAAAAAAA  NNNN NNNNNNNN\n"
				+ 		   "HHHHHHHHHHHHHH  AAAAAAAAAA  NNNN   NNNNNN  GGG    GGGG  MMMM     MMMM  AAAAAAAAAA  NNNN   NNNNNN\n"
				+ 		   "HHHHH    HHHHH  AAA    AAA  NNNN    NNNNN  GGG      GG  MMMM     MMMM  AAA    AAA  NNNN    NNNNN\n"
				+ 		   "HHHHH    HHHHH  AAA    AAA  NNNN     NNNN  GGGGGGGGGGG  MMMM     MMMM  AAA    AAA  NNNN     NNNN\n"
				+ 		   "HHHHH    HHHHH  AAA    AAA  NNNN     NNNN  GGGGGGGGGGG  MMMM     MMMM  AAA    AAA  NNNN     NNNN\n");
		System.out.println("\nThe Rules are Simple: \n- Guess the word letter by letter\n- If you get a letter wrong, the man gains a limb\n- You lose when the man is fully hung\n");
         HangmanGame game = new HangmanGame();
     }
 }