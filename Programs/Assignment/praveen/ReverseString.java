package praveen;

import java.util.StringTokenizer;

public class ReverseString {

	public static void main(String[] args) {
		String str = "This is Namrata";
		ReverseString rs = new ReverseString();
		rs.DoReverse(str);
	}

	public void DoReverse(String input){
		for(int i=input.length()-1; i>=0;  i--){
			System.out.print(input.charAt(i));
		}
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(input);
		while(st.hasMoreTokens()){
			String temp = st.nextToken();
			for(int j=temp.length()-1; j>=0;  j--){
				System.out.print(temp.charAt(j)+" ");
				//System.out.println(temp);
			}
			System.out.println(temp);
			
		}
	}
}
