// CS1020 (AY2014/5 Semester 2)
// Take-home Lab1 Ex1
// Name: Hong Lu 
// Matric. No.: A0133889
// Lab group: 5
// Write the program description below.
// It is mandatory to write program description at the top of every program.
// Marks will be awarded for this in sit-in labs.
// Please remove this line and its preceding 3 lines.

// Add import statement(s) below

import java.util.Scanner;
import java.text.DecimalFormat;

public class ConvertTemperature {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature: ");
		double temperature = sc.nextDouble();
		printMenuSource();
		int fromScale = sc.nextInt();
		printMenuDest(fromScale);
		int toScale = sc.nextInt();

		convert(temperature, fromScale, toScale);
	}

	// Print menu to select source scale
	private static void printMenuSource() {
		System.out.println();
		System.out.println("Choose source scale:");
		System.out.println("  1. Celsius");
		System.out.println("  2. Fahrenheit");
		System.out.println("  3. Kelvin");
		System.out.print("Enter your choice: ");
	}

	private static void printMenuDest(int fromScale) {
		System.out.println();
		System.out.println("Choose destination scale:");
		if (fromScale == 1){
			System.out.println("  1. Fahrenheit");
			System.out.println("  2. Kelvin");
		}
		else if (fromScale == 2){
			System.out.println("  1. Celsius");
			System.out.println("  2. Kelvin");
		}
		else if (fromScale == 3){
			System.out.println("  1. Celsius");
			System.out.println("  2. Fahrenheit");
		}
		System.out.print("Enter your choice: ");
	}

	// Convert temperature from fromScale to toScale
	private static void convert(double temperature, int fromScale, int toScale) {
		double temp = temperature;
		String scale1 = "Celsius";
		String scale2 = "Celsius";
		DecimalFormat df = new DecimalFormat("0.00");
		// Fill in the code
		if (fromScale == 2){
			temp = (5.0/9) * (temperature - 32);
			scale1 = "Fahrenheit";
			if (toScale == 2){
				temp = temp + 273.15;
				scale2 = "Kelvin";
			}
		}
		else if (fromScale == 3){
			temp = temperature - 273.15;
			scale1 = "Kelvin";
			if (toScale == 2){
				temp = 1.8 * temp +32;
				scale2 = "Fahrenheit";
			}
		}
		else{
			if (toScale == 2){
				temp = 1.8 * temp +32;
				scale2 = "Fahrenheit";
			}
			else if (toScale == 3){
				temp = temp + 273.15;
				scale2 = "Kelvin";
			}
		}
		System.out.println();
		System.out.println(temperature + " degrees " + scale1 + " = " + df.format(temp) + " degrees " + scale2);
	}

}

