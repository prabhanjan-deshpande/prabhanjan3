package praveen;
public class moveEvenNo {

	public static void main(String[] args) {
		int[] array = {2,5,9,4,99,104,76,200,87};
		moveEvenNo men = new moveEvenNo();
		men.moveEven(array);
	}
	public void moveEven(int[] input){
		for(int i=0; i<input.length; i++){
			for(int j=0; j<input.length; j++)
			{
				if(input[i] % 2 ==0){
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		System.out.print("Sorted array : ");
		for(int i=0; i<input.length; i++){
			System.out.print(input[i] + " ");
		}
	}
}