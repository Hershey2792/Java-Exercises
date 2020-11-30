/*
Class: CMSC201
Instructor: Grigory Grinberg
Description: This project calculates cost of driving given miles per gallon, price per gallon
and distance driving 
Due: <09/06/2020>
I Pledge that I have completed that programming assignment independently. 
I have not copied the code from a student or any source
I have not given my code to any student
Quentin Jefferies 
*/




//import scanner class
import java.util.Scanner;

public class CostOfDriving {

	public static void main(String[] args) {
		//Create Scanner class input 
		Scanner input = new Scanner(System.in);
		
		//Read in driving distance 
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
		
		//Read in miles per gallon
		System.out.print("Enter miles per gallon: ");
		double miles = input.nextDouble();
		
		//Read in price per gallon
		System.out.print("Enter the price per gallon: ");
		double price = input.nextDouble();
		
		//Find distance per gallon and cost per gallon
		double distancePerGallon = distance / miles;
		double costPerGallon = distancePerGallon * price;
		
		System.out.print("The cost of driving is: $" + costPerGallon);
		
	}

}
