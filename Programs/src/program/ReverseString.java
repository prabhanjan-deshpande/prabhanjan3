package program;

import java.util.StringTokenizer;

 class ReverseString {

	 public static void main(String[] args) {
			String origional = "Have a good day";
			ReverseString sm = new ReverseString();		
			sm.PrintString(origional);
		}

		public void PrintString(String origional){
			
			System.out.println("\nUsing string tokenizer");
			StringTokenizer st = new StringTokenizer(origional);
			String check = "good";
			while(st.hasMoreTokens()){
				String temp = st.nextToken();
				
				if(temp.equals(check))
				{
				System.out.println(temp + " & "+ check +" === Strings are equal");	
				}
				else
					System.out.println(temp+ " & "+ check +" === not equal");

			}

		}
}
