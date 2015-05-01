package praveen;

public class sortInteger {
	public static void main(String[] args) {
		int[] array = {8,2,5,7,2,1,3,60,3434,98};	
		sortInteger si = new sortInteger();
		int[] sortedArray = si.sortValues(array);
		System.out.print("Sorted array : ");
		for(int i=0; i<sortedArray.length; i++){
			System.out.print(sortedArray[i] + " ");
		}
	}
	public int[] sortValues(int[] input){
		int length = input.length;
		for(int i=0; i<length; i++){
			for(int j=0; j<length; j++)
			{
				if(input[i] < input[j]){
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		return input;
	}
}
