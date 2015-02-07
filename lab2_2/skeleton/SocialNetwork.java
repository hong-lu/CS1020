// CS1020 (AY2014/5 Semester 2)
// Take-home Lab2 Ex2
// Name: Hong Lu
// Matric. No.: A0133889M
// Lab group: 05
// Write the program description below.
// It is mandatory to write program description at the top of every program.
// Marks will be awarded for this in sit-in labs.
// Please remove this line and its preceding 3 lines.

// Add import statement(s) below
import java.util.*;

public class SocialNetwork {
 //Define your data attributes here
  private User[] usersList;
  private int numOfTotalUsers = 0;

 //constructor
 public SocialNetwork() {
  this.usersList = new User[100];
 }

 //return the number of pairs of mutual follow friends
 public int findMutualFollow() {
  int numOfMutualFollow = 0;
  
  //write your solution here
   for(int i = 0; i < this.numOfTotalUsers - 1; i++){
     for(int j = i + 1; j < this.numOfTotalUsers; j++){
       if (usersList[i].isFollowing(usersList[j]) && usersList[j].isFollowing(usersList[i])){
         numOfMutualFollow ++;
       }
     }
   }
  return numOfMutualFollow;
 }

 //register a new user with a given name
 public void registerUser(String name) {
  this.usersList[this.numOfTotalUsers] = new User(name);
  this.numOfTotalUsers++;
 }

 //set user A follows user B
 public void setFollow(User A, User B) {
  A.setFollow(B);
 }
 
 //set user A unfollows user B
 public void setUnfollow(User A, User B) {
  A.setUnfollow(B);
 }

 //find the user object according to the name given
 public User getUserByName(String name){
   User result = new User("");
   for (User u: this.usersList){
     if( u.getName().equals(name)){
       result = u;
       break;
     }
   }
   return result;
 }


 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  SocialNetwork socialNetwork = new SocialNetwork();
  
  //write your code here
  while(sc.hasNext()){
    String str = sc.nextLine();
    String[] operation = str.split(" ");
    String command = operation[0];
    if (command.equals("R")){
      for (int i = 1; i < operation.length; i++){
        socialNetwork.registerUser(operation[i]);
      }
    }
    else if (command.equals("F") ){
        User A = socialNetwork.getUserByName(operation[1]);
        User B = socialNetwork.getUserByName(operation[2]);
        socialNetwork.setFollow(A, B);
    }
    else if (command.equals("U")){
        User A = socialNetwork.getUserByName(operation[1]);
        User B = socialNetwork.getUserByName(operation[2]);
        socialNetwork.setUnfollow(A, B);
    }
    else if (command.equals("M")){
        System.out.println("Number of pairs of mutual followers: " 
                      + socialNetwork.findMutualFollow());
    }
  }
  
 }

}
