package notes;

/*
 * Notes on how to print to the screen
 * Also includes Escape Sequences
 * 
 */

public class Notes01_Printing_and_Escape_Sequences {

	public static void main(String[] args) {
		
		//print() Simply prints the String
		System.out.print("Sup Yo! ");
		
		//println() prints the String and then a return
		System.out.println("🤓");
		System.out.println("Mr Hunter Loves CS1");
		
		/*
		 * Escape Sequences
		 *    \"  actually print a "  (don't end the String)
		 *    \n  go to next line (print a return)
		 *    \\  actually print a \ (don't start an escape sequence)
		 */
		System.out.println("Adam\n said, \"Im tired!\"");
		System.out.println("When I was\ngoing to Saint Eyve's");
		System.out.println("\\");
		
		problem1();
		problem1();
		problem1();
		problem1();
		problem1();
		problem1();
		
		
		
		///////////////////////
		
		
		
		
		
		
		
		//declare String variable
		String letters;
		//initialize letters
		letters = "abcd...";
		
		
		//declare and initialize in the 1 line
		String letters2 = "ABCD...";
		/*
		 *  = is a command
		 *  it says take the right and store it in the left
		 * 
		*/
		
		System.out.println(letters);
		System.out.println(letters2);
		
		letters2 = "OH MY... I'm stuck in the computer!!!";
		System.out.println(letters2);
		
		letters2 = letters;
		System.out.println(letters2);
		/*
		 * Concatenation
		 * 
		 * Basically is the act of smooshing (technical term) 2
		 * 	Strings together.
		 * 
		 * Use a +
		 * 
		*/
		
		String word1 = "Oops";
		String word2 = " I did it again...";
		System.out.println(word1 + word2);
		
		/*
		 * Now with a String literal
		 * 
		 * String Literal = the actual characters between the ""
		 * 		It is LITERALLY the letters
		 */
		
		String word3 = "mouse";
		System.out.println("If you give a " + word3 + " a cookie...");
		
		String number = "5";
		System.out.println(number + number);
		
		
		int number2 = 5;
		System.out.println(number2 + number2);
		
		
		
		
		
		
		
	//////////////////	
		
		
		
		
		
		
		
	}
	
	
	public static void problem1() {
		
		System.out.println("Thank GOD tomorrow is Flex!");
		
		
	}
	
	
	
public static void problem2() {
		
		System.out.println("Thank GOD tomorrow is Flex!");
		
		
	}
	
	
	
}
