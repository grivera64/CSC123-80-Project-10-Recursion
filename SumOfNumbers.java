//package project10;

/*
 * 
 * Name: SumOfNumbers.java
 * Purpose: Finds the sigma notation from k = 1 to n
 * Author: grivera64
 * Date: 05/07/2021
 * 
 */

/* Imports */
import java.util.Scanner;

public class SumOfNumbers
{
	
	/* Driver Function */
	public static void main(String[] args)
	{
		
		/* Allows for User input */
		Scanner keyboard = new Scanner(System.in);
		
		/* Ask User for an integer greater than or equal to 0 until provided */
		int input = 0;
		
		do
		{
			
			System.out.printf("Please enter a integer greater than or equal to 0\n");
			
			try
			{
				input = keyboard.nextInt();
			}
			catch (Exception e)
			{
				
				keyboard.nextLine();
				input = -1;
				
			}
				
		} while(input < 0);
		
		/* Calculate the finite sum */
		int answer = sum(input);
		
		/* Print to the console */
		System.out.printf("The sum from 1 to %d is %d.\n", input, answer);
		
		/* Close the input stream and terminate the program */
		keyboard.close();
		
	}
	
	/* Recursive method that solves infinite sum */
	public static int sum(int number)
	{
		
		/* Guard Case */
		if (number < 0) return 0;
		
		/*                    recursive case (> 1) else  base case */
		return (number > 1) ? number + sum(number - 1) : number;
		
	}
}