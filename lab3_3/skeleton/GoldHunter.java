// CS1020 (AY2014/5 Semester 2)
// Take-home Lab2 Ex3
// Name: Hong Lu
// Matric. No.: A0133889M
// Lab group: 05
// Write the program description below.
// It is mandatory to write program description at the top of every program.
// Marks will be awarded for this in sit-in labs.
// Please remove this line and its preceding 3 lines.

import java.util.*;

public class GoldHunter {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  MyMap map = new MyMap(sc);

  // Fill in the code below
  computeGoldMap(map);
  goldMapDisplay(map);

 }

 // Note: You should add some methods in this program.
 //       You should not do all the work in the main() method above.
 
 //Compute the amount of gold of every cell by suming up the number of mine-filled cells around it
 public static void computeGoldMap(MyMap map){
   for (int i = 0; i < map.getNumRow(); i++){
     for (int j = 0; j < map.getNumCol(); j++){
       if (map.getLabel(i, j) == '*'){
         //set the gold value to -1 when it is mine-filled
         map.setGoldVal(i, j, -1);
         continue;
       }
       int nGold = haveGold(map, i-1, j-1) + haveGold(map, i-1, j) + haveGold(map, i-1, j+1)
         + haveGold(map, i, j-1) + haveGold(map, i, j+1)
         + haveGold(map, i+1, j-1) + haveGold(map, i+1, j) + haveGold(map, i+1, j+1);
       map.setGoldVal(i, j, nGold);
     }
   }
 }
 
 //Check whether the cell is within the map and whether it is mine-filled
 public static int haveGold(MyMap map, int i, int j){
   if (map.indexWithinRange(i, j) && map.getLabel(i, j) == '*'){
     return 1;
   }
   //If its index is out of range, or it is not mine-filled, return 0
   return 0;
 }
 
 //Display the gold map
 public static void goldMapDisplay(MyMap map){
   for (int i = 0; i < map.getNumRow(); i++){
     for (int j = 0; j < map.getNumCol(); j++){
       if (map.getGoldVal(i, j) == -1)
         System.out.print("*");
       else
         System.out.print(map.getGoldVal(i,j));
     }
     System.out.print("\n");
   }
 }
}

