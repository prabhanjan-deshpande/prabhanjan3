package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciTill100 {
	public static void main(String args[])throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));

		int a, n, b;
		System.out.print("Enter the no till which you want the series: ");
		n= Integer.parseInt(br.readLine());

		System.out.println("The Fibonacci series is: ");
		a=0;
		b=1;
		System.out.println(a);
		System.out.println(b);

		for(int c=1; c<n;)
		{
			c=a+b;
			if(c<=n)
			{
				System.out.println(c); }
			a=b;
			b=c;
		}
	}
}