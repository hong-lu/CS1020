// CS1020 (AY2014/5 Semester 2)
// Take-home Lab2 Ex1
// Name:
// Matric. No.:
// Lab group:
// Write the program description below.
// It is mandatory to write program description at the top of every program.
// Marks will be awarded for this in sit-in labs.
// Please remove this line and its preceding 3 lines.

// Add import statement(s) below
import java.util.*;

public class KWICIndexSystem {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  KWIC myKWIC = new KWIC();
  int numOfIgnoreWords = sc.nextInt();
  sc.nextLine();
  for (int i = 0; i < numOfIgnoreWords; i++){
    myKWIC.addWordToIgnoreWordList(sc.nextLine());
  }
  int numOfTitles = sc.nextInt();
  sc.nextLine();
  for (int i = 0; i < numOfTitles; i++){
    myKWIC.addTitleToTitleList(sc.nextLine());
  }
  myKWIC.findKWICIndex();
  myKWIC.printOutResult();
 }
}
