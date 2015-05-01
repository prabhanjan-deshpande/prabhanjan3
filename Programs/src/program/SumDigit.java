package program;

import java.util.Scanner;

public class SumDigit {
	public static void main(String args[])
	{		
		int n, res, sum=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter No.: ");
		n=scan.nextInt();		
		while(n>0)
		{
			res=n%10;
			n=n/10;
			sum+=res;	//sum=sum+res;
		}
		System.out.println("Second No: " + sum);

	}
}
