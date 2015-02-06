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
import java.lang.*;

class KWIC {
 private static ArrayList<String> ignoreWordList;
 private static ArrayList<String> titleList;
 private static ArrayList<String> finalResult;
 
 public KWIC() {
  this.ignoreWordList = new ArrayList<String>();
  this.titleList = new ArrayList<String>();
  this.finalResult = new ArrayList<String>();
 }
 
 /* Pre-condition: */
    /* Post-condition: */
    /* Description: Add a new title to titleList. */
 public void addTitleToTitleList(String title) {
     this.titleList.add(title);
 }
 
 /* Pre-condition: The word is in lower case. */
    /* Post-condition: The word will be ignored during the shifting procedure. */
    /* Description: Add a new title to ignoreWordList. */
 public void addWordToIgnoreWordList(String word) {
  ignoreWordList.add(word);
 }
 
 /* Description: Iterate through every title 
  * and call circularShift to store results in the finalResult */
 public void findKWICIndex() {
   for (String title: titleList){
     this.circularShift(title);
   }
 }
 
 /* Pre-condition:  */
    /* Post-condition:  */
    /* Description: To sort final result in alphabetical order
     * and print out the final result. */
 public void printOutResult() {
   this.finalResult = orderInAlphabetical(this.finalResult);
   for(String result: this.finalResult){
     System.out.println(result);
   }
 }
 

    /* Description: Call capitalizeKeyword to receive an arraylist of words.
     * Then circular shift to generate all possible strings and store in the final result. */
    /* Note that wordToIgore cannot be in the beginning of a title. */
 private void circularShift(String title) {
   ArrayList<String> titleWords = capitalizeKeyword(title);
   
   for (int i = 0; i < titleWords.size(); i++){
     if (!this.ignoreWordList.contains(titleWords.get(0))){
       String currStr = titleWords.get(0);
       for (int j = 1; j < titleWords.size(); j++){
         currStr = currStr + " " + titleWords.get(j);
       }
       this.finalResult.add(currStr);
     }
     titleWords.add(titleWords.remove(0));
   }
 }
 
    /* Description: To sort a list in alphabetical order. */
 private static ArrayList<String> orderInAlphabetical(ArrayList<String> list) {
   Collections.sort(list);
   return list;
 }

    /* Pre-condition:  The input should start with and end with a word, 
     * use only one space to seperate words. */
    /* Post-condition: Return an arraylist of the capitalized words of the title*/
    /* Description: To capitalize every first character of keywords. */
 private static ArrayList<String> capitalizeKeyword(String title) {
   ArrayList<String> titleWords = new ArrayList<String>();
   String[] temp = title.split(" ");
   for (String word: temp){
     if (!ignoreWordList.contains(word)){
       word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
     }
     titleWords.add(word);
   }
   return titleWords;
 }
 
 }
