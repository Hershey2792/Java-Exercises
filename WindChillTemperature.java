/*
Class: CMSC201
Instructor: Grigory Grinberg
Description: This project calculates wind chill based on temperature in farenheit and wind speed in miles per hour
Due: <09/06/2020>
I Pledge that I have completed that programming assignment independently. 
I have not copied the code from a student or any source
I have not given my code to any student
Quentin Jefferies 
*/



//import scanner class
import java.util.Scanner;

public class WindChillTemperature {

	public static void main(String[] args) {
		//Read in temperature from the user and prompt 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Farenheit between -58 degrees and 41 degrees: ");
		
		//Convert temperature 
		double temperature = input.nextDouble();
	
		//Enter Wind speed and convert
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double windspeed = input.nextDouble();
		
		//Declare constant to store permanent coefficients
		//Write formula for temperature wind chill
		final double FIRST_COEFFICIENT = 35.74;
		double tempCoefficient = 0.6215 * temperature;

		double Twc = FIRST_COEFFICIENT + tempCoefficient - 35.75 * Math.pow(windspeed, 0.16) + 0.4275 * temperature * Math.pow(windspeed, 0.16);
		//Output wind chill
		System.out.println("The wind chill index is: " + Twc);
		
	}
}
