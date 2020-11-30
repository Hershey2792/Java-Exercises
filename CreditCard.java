/*
 * Class: CMSC201 
 * Instructor:
 * Description: (Program validates a credit card number based on the proper criteria)
 * Due: 10/04/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Quentin Jefferies
*/

import java.util.Scanner;




public class CreditCard {
	public static void main (String[] args)
    {
        
        System.out.print("Enter a credit card number as a long integer: ");
        displayResults(inputData());
        
     
    
        




    }

//Display Results
public static void displayResults(long number)
{
	System.out.println(number + " is " +  
	        (isValid(number) ? "valid" : "invalid"));
}






/** input credit card’s number from keyboard
Return this credit Card’s number
*/
  public static long inputData()
  {
    Scanner input = new Scanner(System.in);
    long cardNum = input.nextLong();
    return cardNum;
    
  }

   /** Return the number of digits in d 
loop through the length of string and increase count
*/
   public static int getSize(long d)
   {
       int count = 0;
       String s = Long.toString(d);
       for (int i = 0; i < s.length(); i++)
       {
           count++;
       }
       return count;
   }

     /** Return true if the digit d is a prefix for number */
   public static long getPrefix(long number, int k)
   {
       //returns number if number is in the first position 
   if (getSize(number) > k) 
   {
    String s = Long.toString(number);
    for (int i = 0; i < (s.length() - k); i++)
						
        {
            number = number / 10;// gets me to the first digit			
        }						//used https://www.geeksforgeeks.org/find-first-last-digits-number/
								//to get to the first digit using number / 10
    }
        
        return number;
       
   }

   /** Return true if the digit d is a prefix for number */
public static boolean prefixMatched(long number, int d)
  { 
    String s = Long.toString(number);// Convert long to string 
    int secondDigit = Character.getNumericValue(s.charAt(1));//get second digit from string
    int numberSize = getSize(number);//get size of the number entered

    if (numberSize >= 13 && numberSize <= 16)//check 
    {
        if(getPrefix(number, d) == 4 || getPrefix(number, d) == 5 || getPrefix(number, d) == 6)//check for 4 , 5, 6
        {
            return true;
        }
        else if (secondDigit == 7 && getPrefix(number, d) == 3)//case for 37
        {
            return true;
        }        

    }
    return false;

  }

/** Get the result from Step 2 */
public static int sumOfOddPlace(long number)
{
    String s = Long.toString(number);
    int sum = 0;
    //int digit = Character.getNumericValue(s.charAt(0));
    for (int i = s.length() - 1; i >= 0; i -= 2)//go backwards from length of sting starting at second to last number
    {
        sum += Character.getNumericValue(s.charAt(i));      
        
    }
    return sum;

}

/** Return this number if it is a single digit, otherwise, 
   * return the sum of the two digits */
public static int getDigit(int number) {
    if (number > 9) {
        return ((number / 10) + (number % 10));//used https://www.geeksforgeeks.org/find-first-last-digits-number/
        										//to get each digit with number % 10 and number / 10
    } // add each digit
    return number;

}

public static int sumOfDoubleEvenPlace(long number)
{
    String s = Long.toString(number);
    int digitProduct;
    int sum = 0;
  
    // int doubleSum = 0;
    //int digit = Character.getNumericValue(s.charAt(0));
    for (int i = s.length() - 2; i >= 0; i -= 2)
    {
        int digit = Character.getNumericValue(s.charAt(i));
        digitProduct = digit * 2;
        sum += getDigit(digitProduct);
    }

    return sum;

}

  /** Return true if the card number is valid */
  public static boolean isValid(long number)
{
	  long input = (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number));
	    if (input % 10 == 0)
	    {
	        return true;
	    }
	    else
	    {
	        return false;
	    }
	  
	  
}
}



    

    

