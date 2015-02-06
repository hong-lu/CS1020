// CS1020 (AY2014/5 Semester 2)
// Take-home Lab2 Ex2
// Name: 
// Matric. No.: 
// Lab group: 
// Write the program description below.
// It is mandatory to write program description at the top of every program.
// Marks will be awarded for this in sit-in labs.
// Please remove this line and its preceding 3 lines.

// Add import statement(s) below
import java.util.*;


public class SocialNetwork {
	//Define your data attributes here


	//constructor
	public SocialNetwork() {
		
	}

	//return the number of pairs of mutual follow friends
	public int findMutualFollow() {
		int numOfMutualFollow = 0;
		
		//write your solution here

		return numOfMutualFollow;
	}

	//register a new user with a given name
	public void registerUser(String name) {
		
	}

	//set user A follows user B
	public void setFollow(User A, User B) {
		
	}
	
	//set user A unfollows user B
	public void setUnfollow(User A, User B) {
		
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SocialNetwork socialNetwork = new SocialNetwork();
		
		//write your code here
		System.out.println("Number of pairs of mutual followers: " 
		                    + socialNetwork.findMutualFollow());
		
	}

}
