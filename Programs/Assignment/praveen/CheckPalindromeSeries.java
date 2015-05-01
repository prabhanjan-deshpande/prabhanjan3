package praveen;

public class CheckPalindromeSeries {

	public static void main(String[] args) {
		int[] no = {121,24,2552,1};

		CheckPalindromeSeries cp = new CheckPalindromeSeries();
		cp.checkPalindrome(no);
	}

	public void checkPalindrome(int[] input){
		for(int i=0; i < input.length; i++){
			int number = input[i];
			int reversedNumber  = 0;
			int temp=0;

			while(number > 0){
				temp = number % 10;
				number = number / 10;
				reversedNumber = reversedNumber * 10 + temp;
			}

			if(input[i] == reversedNumber)
				System.out.println(input[i] + " is a palindrome number");
			else
				System.out.println(input[i] + " is not a palindrome number");
		}
	}
}