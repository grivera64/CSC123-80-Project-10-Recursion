//package project10;

/*
 * 
 * Name: RecursiveIsMembers.java
 * Purpose: Checks if a member exists in an array list recursively
 * Author: grivera64
 * Date: 05/07/2021
 * 
 */

/* Imports */
import java.util.Random;
import java.util.ArrayList;

public class RecursiveIsMember
{
	
	/* Driver Method */
	public static void main(String[] args)
	{
		
		/* Create a randomizer */
		Random randy = new Random(5);
		/* Create an Integer ArrayList for numbers */
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		/* Randomly generate 15 ints */
		for (int i = 0; i < 15; i++)
		{
			
			numbers.add(randy.nextInt(16) * 2);
			
		}
		
		/* Print the ArrayList on one line */
		System.out.printf("The ArrayList numbers are: [%d", numbers.get(0));
		
		for (int i = 1; i < 15; i++)
		{
			
			System.out.printf(", %d", numbers.get(i));
			
		}
		
		System.out.printf("]\n");
		
		/* Check if the numbers 1-30 are found in the array list */
		for (int i = 0; i <= 30; i++)
		{
			
			System.out.printf("%d is %s in the array\n", 
							i, (isMember(numbers, i, 15)) ? "found" : "not found");
			
		}
		
		/* Terminate Program */
		
	}
	
	/* Recursive method for finding ifa member is used in the Array List */
	public static boolean isMember(ArrayList<Integer> myList, int value, int index)
	{
		
		/* If we are on the first index it doesn't exist */
		if (index == 0)
		{
			
			return false;
			
		}
		/* If the current index matches the value, return true */
		else if (myList.get(index - 1) == value)
		{
			
			return true;
			
		}
		/* Else continue searching one index lower */
		else
		{
			
			return isMember(myList, value, index - 1);
			
		}
		
	}
	
}