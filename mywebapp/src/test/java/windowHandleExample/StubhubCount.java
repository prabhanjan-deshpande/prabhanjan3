package windowHandleExample;

import java.util.HashMap;
import java.util.Set;

public class StubhubCount {

	public static void main(String[] args){
		String name = "STUBHUB";
		StubhubCount sc = new StubhubCount();
		sc.WordCount(name);
	}

	public void WordCount(String input){
		int length = input.length();

		HashMap<Character, Integer> hm =new HashMap<Character, Integer>();
		for(int i=0; i<length; i++){
			char temp = input.charAt(i);
			if(!hm.containsKey(temp)){
				hm.put(input.charAt(i), 1);
			}
			else{
				hm.put(input.charAt(i), hm.get(input.charAt(i))+1);
			}
		}
		System.out.println("Words : "+hm);
		System.out.print("Unique keys :");
		Set<Character> keys = hm.keySet();
		for(Character key : keys){
			if(hm.get(key)==1){
				System.out.print(" "+key);
			}
		}
		System.out.print("\nDuplicate keys :");
		for(Character key : keys){
			if(hm.get(key) > 1){
				System.out.print(" "+key);
			}
		}
	}
}
