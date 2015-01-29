// CS1020 (AY2014/5 Semester 2)
// Take-home Lab1 Ex2
// Name: Hong Lu 
// Matric. No.: A0133889
// Lab group: 5
// Write the program description below.
// It is mandatory to write program description at the top of every program.
// Marks will be awarded for this in sit-in labs.
// Please remove this line and its preceding 3 lines.

// Add import statement(s) below
import java.util.*;

public class Palindromes {

	// Add other methods below -- remove this comment
	public static boolean isPalindrome(String str){
		String newStr = str.replaceAll("[^A-Za-z]+", "");
		newStr = newStr.toUpperCase();
		String reverse = new StringBuilder(newStr).reverse().toString();
		return reverse.equals(newStr);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str;
		int numPalindromes = 0;
		System.out.print("Enter text: ");
		while (sc.hasNextLine()){
			str = sc.nextLine();
			if (isPalindrome(str)){
				numPalindromes ++;
			}
			System.out.print("Enter text: ");
		}
		System.out.println("Number of palindromes = " + numPalindromes);
	}
}

