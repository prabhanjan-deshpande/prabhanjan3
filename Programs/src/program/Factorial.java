package program;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[])
	{		
		int n, i, prod=1;
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter a No.");
		n=scan.nextInt();
		for(i=n;i>=1;i--)
		{
			prod*=i;	//prod=prod*i;
		}
		System.out.println("Factorial of " + n + " is  " + prod);
	}
}
