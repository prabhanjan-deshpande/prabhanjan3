package praveen;

import java.util.HashMap;

public class countNumbers {

	public static void main(String[] args) {
		int[] array = {2,4,6,8,2,99,108,6};
		countNumbers cw = new countNumbers();
		cw.usingHashMap(array);
	}

	public void usingHashMap(int[] input){
		int len = input.length;
		HashMap<Integer, Integer> numChars = new HashMap<Integer, Integer>(Math.min(len, 26));

		for (int i = 0; i < len; ++i)
		{
		    if (!numChars.containsKey(input[i]))
		    {
		        numChars.put((int) input[i], 1);
		    }
		    else
		    {
		        numChars.put((int) input[i], numChars.get(input[i]) + 1);
		    }
		}
		System.out.println("Using hash map : "+numChars);
	}
}
