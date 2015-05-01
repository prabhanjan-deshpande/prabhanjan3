package program;

import java.util.StringTokenizer;

public class StringManupulate {

	public static void main(String[] args) {
		String origional = "Have a good day";
		StringManupulate sm = new StringManupulate();		
		sm.PrintString(origional);
	}

	public void PrintString(String org){
		int length = org.length();
		System.out.println("Origional string : "+ org);

		System.out.print("\nReverse string : ");
		for(int i=length-1 ; i>=0; i--)
		{
			System.out.print(org.charAt(i));
		}
		
		System.out.println("\nUsing string tokenizer");
		StringTokenizer st = new StringTokenizer(org, " ");
		String check = "good";
		while(st.hasMoreTokens()){
			String temp = st.nextToken();
			int tempLen = temp.length();
			System.out.println("tokenizer split words : "+temp);
			for(int a=tempLen-1; a>=0; a--)
			{
				System.out.print(temp.charAt(a));	
				
			}
			System.out.print(" ");
			if(temp == check)
			{
			System.out.println("Strings are equal");	
			}
			else
				System.out.println("not equal");

		}

	}
}
