package praveen;

public class printOddNumbers {

	public static void main(String[] args) {
		int[] array = {8,2,5,7,2,1,3,60,3434,97};	
		printOddNumbers pon = new printOddNumbers();
		System.out.print("Odd numbers : ");
		pon.printOddNo(array);
	}

	private void printOddNo(int[] inputArray) {
		for(int i=0; i<inputArray.length; i++){
			if(inputArray[i] % 2 != 0 )
			{
				System.out.print(" "+inputArray[i]);
			}
		}
	}
}
