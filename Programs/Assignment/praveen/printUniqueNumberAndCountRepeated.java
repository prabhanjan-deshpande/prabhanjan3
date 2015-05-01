package praveen;

import java.util.HashMap;
import java.util.Set;

public class printUniqueNumberAndCountRepeated {

	public static void main(String[] args) {

		int[] testArray = {36, 23, 4, 7, 12, 567, 34, 809, 12, 2053, 3, 36, 877, 12, 63, 99, 165, 7, 12};
		//printUniqueNumberAndCountRepeated p1 = new printUniqueNumberAndCountRepeated();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int x =0; x< testArray.length; x++){
			if(!hm.containsKey(testArray[x]))
			{
				hm.put(testArray[x], 1);
			}
			else{
				hm.put(testArray[x], hm.get(testArray[x])+1);
			}
		}
		System.out.println(hm);
		Set<Integer> keys = hm.keySet();
		System.out.println("Unique keys : ");
		for(Integer key : keys){
			if(hm.get(key) == 1)
			{
				System.out.print(" " + key);
			}
		}
		System.out.println("duplicate keys : ");
		for(Integer key : keys){
			if(hm.get(key) > 1)
			{
				System.out.print("Key = " + key);
				System.out.println(" Values = " + hm.get(key));
			}
		}
	}
}