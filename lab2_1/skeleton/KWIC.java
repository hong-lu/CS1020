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

class KWIC {
	private static ArrayList<String> ignoreWordList;
	private static ArrayList<String> titleList;
	private static ArrayList<String> finalResult;
	
	public KWIC() {
		// TODO. UNDONE!
	}
	
	/* Pre-condition:  */
    /* Post-condition:  */
    /* Description: Add a new title to titleList. */
	public void addWordToTitleList(String word) {
		
	}
	
	/* Pre-condition:  */
    /* Post-condition:  */
    /* Description: Add a new title to ignoreWordList. */
	public void addWordToIgnoreWordList(String word) {
		ignoreWordList.add(word);
	}
	
	/* Description: This method is to find the final result. */
	public static void findKWICIndex() {
		
    }
	
	/* Pre-condition:  */
    /* Post-condition:  */
    /* Description: To print out the final result. */
	public static void printOutResult() {
		
	}
	
	/* Pre-condition:  */
    /* Post-condition:  */
    /* Description: Receive a list of titles and wordToIgnore, circular shift all the titles and store them. */
    /* Note that wordToIgore cannot be in the beginning of a title. */
	private static ArrayList<String> circularShift(ArrayList<String> list) {
		
	}
	
	/* Pre-condition:  */
    /* Post-condition:  */
    /* Description: To sort a list in alphabetical order. */
	private static ArrayList<String> orderInAlphabetical(ArrayList<String> list) {
		
	}

    /* Pre-condition:  */
    /* Post-condition:  */
    /* Description: To capitalize every first character of keywords. */
	private static ArrayList<String> capitalizeKeyword() {
		
	}
}
