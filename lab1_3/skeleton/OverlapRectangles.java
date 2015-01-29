// CS1020 (AY2014/5 Semester 2)
// Take-home Lab1 Ex3
// Name: Hong Lu 
// Matric. No.: A0133889M
// Lab group: 5
// Write the program description below.
// It is mandatory to write program description at the top of every program.
// Marks will be awarded for this in sit-in labs.
// Please remove this line and its preceding 3 lines.
import java.util.*;
import java.awt.*;
public class OverlapRectangles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point interLeft, interRgt;
        Point rect1LowerLeft, rect2LowerLeft, rect1UpperRgt, rect2UpperRgt;

        System.out.print("Enter 2 opposite vertices of 1st rectangle: ");
        Point rect1Vertex1 = new Point(sc.nextInt(), sc.nextInt());
        Point rect1Vertex2 = new Point(sc.nextInt(), sc.nextInt());
        rect1LowerLeft = lowerLeft(rect1Vertex1, rect1Vertex2);
        rect1UpperRgt = upperRight(rect1Vertex1, rect1Vertex2);

        System.out.print("Enter 2 opposite vertices of 2nd rectangle: ");
        Point rect2Vertex1 = new Point(sc.nextInt(), sc.nextInt());
        Point rect2Vertex2 = new Point(sc.nextInt(), sc.nextInt());
        rect2LowerLeft = lowerLeft(rect2Vertex1, rect2Vertex2);
        rect2UpperRgt = upperRight(rect2Vertex1, rect2Vertex2);
        
        interLeft = upperRight(rect1LowerLeft, rect2LowerLeft);
        interRgt = lowerLeft(rect1UpperRgt, rect2UpperRgt);
        
        // For testing. Remove or comment off the statement below after testing.
        System.out.println("Overlap area = " + overlapArea(interLeft.x, interLeft.y, interRgt.x, interRgt.y));
    }
         
    public static int overlapArea(int interLeftX, int interLeftY, int interRightX, int interRightY) {
        return Math.max(interRightX - interLeftX, 0) * Math.max(interRightY - interLeftY, 0);
    }
    
    public static Point lowerLeft(Point vertex1, Point vertex2) {
        return new Point(Math.min(vertex1.x, vertex2.x), Math.min(vertex1.y, vertex2.y));
    }
    
    public static Point upperRight(Point vertex1, Point vertex2) {
        return new Point(Math.max(vertex1.x, vertex2.x), Math.max(vertex1.y, vertex2.y));
    }
    
    // This method is provided for your testing.
    // To print the 2 opposite vertices of each of the 2 rectangles.
    public static void printAllVertices(Point r1V1, Point r1V2,
        Point r2V1, Point r2V2) {
        System.out.println("1st rectangle vertex 1: " + r1V1);
        System.out.println("1st rectangle vertex 2: " + r1V2);
        System.out.println("2nd rectangle vertex 1: " + r2V1);
        System.out.println("2nd rectangle vertex 2: " + r2V2);
    }

}
