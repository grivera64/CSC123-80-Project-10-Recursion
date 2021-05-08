//package project10;

/*
 * 
 * Name: AckermannDemo.java
 * Purpose: Finds the ackermann solution
 * Author: grivera64
 * Date: 05/07/2021
 * 
 */

public class AckermannDemo
{
	
	/* Driver Method */
	public static void main(String[] args)
	{
		
		/* Test a few ackermann recursion problems */
		test(0, 0); // ackermann(0, 0)
		test(0, 1); // ackermann(0, 1)
		test(1, 1); // ackermann(1, 1)
		test(1, 2); // ackermann(1, 2)
		test(1, 3); // ackermann(1, 3)
		test(2, 2); // ackermann(2, 2)
		test(3, 2); // ackermann(3, 2)
		
		/* Terminate Program */
		
	}
	
	/* Ackermann recursive algorithm */
	public static int ackermann(int m, int n)
	{
		
		/* If the first number is 0, return n + 1 */
		if (m == 0)
		{
			
			return n + 1;
			
		}
		/* If n is 0, return the value returned by decreasing m by 1 and increasing n by 1 */
		else if (n == 0)
		{
			
			return ackermann(m - 1, 1);
			
		}
		/* Else calculate ackermann from m - 1 and the return of ackermann m and n - 1 */
		else
		{
			
			return ackermann(m - 1, ackermann(m, n - 1));
			
		}
		
	}
	
	/* Test test method for printing the results of ackermann in an easy-to-read format */
	public static void test(int m, int n)
	{
		
		System.out.printf("ackermann(%d, %d) = %d\n", m, n, ackermann(m, n));
		
	}
	
}