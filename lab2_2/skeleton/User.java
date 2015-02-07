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

public class User {
 //Define your data attributes here
 private String name;
 private User[] followUsers;
 //keep track of the number of users that current user is following
 private int numOfFollowing;

 //constructor
 //Assume there will not be more than 100 users
 //Assume that no two same names will be registered
 public User(String name) {
  this.name = name;
  this.followUsers = new User[100];
  this.numOfFollowing = 0;
 }
 

 //set this user follows a given user. 
 public void setFollow(User user) {
  //A user cannot follow himself or a user that he has already followed
   if (user != this && (!this.isFollowing(user))){
     this.followUsers[this.numOfFollowing] = user;
     this.numOfFollowing++;
   }
 }
 
 //set this user unfollows a given user.
 public void setUnfollow(User user) {
   User[] newFollowUsers = new User[100];
   int i = 0;
   for(User u : this.followUsers){
     if (u != user){
       newFollowUsers[i] = u;
       i++;
     }
   }
   this.numOfFollowing --;
   this.followUsers = newFollowUsers;
 }
 
 
 //Check whether current user is following user A
 public boolean isFollowing(User A){
   for (int i = 0; i < numOfFollowing; i++){
     if (followUsers[i].equals(A))
       return true;
   }
   return false;
 }
 
 //Accessor
 public String getName(){
   return this.name;
 }
 
}
