package windowHandleExample;

import java.util.HashMap;
import java.util.Set;

public class STUBHUBExample {

	public static void main(String[] args) {
		String str = "STUBHUB";
		STUBHUBExample se = new STUBHUBExample();
		se.CountWords(str);
	}
	
	public void CountWords(String input){
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int countOfDuplicate =0;
		for(int i=0; i<input.length(); i++){
			char temp = input.charAt(i);
			if(!hm.containsKey(temp)){
				hm.put(temp, 1);
			}
			else{
				hm.put(temp, hm.get(input.charAt(i))+1);
			}
		}
		
		System.out.println("Words : "+hm);
		Set<Character> keys = hm.keySet();
		System.out.println("Unique values : ");
		for(Character key : keys){
			if(hm.get(key) == 1){
				System.out.println("Keys : "+key);
			}
		}
		
		System.out.println("Duplicate values : ");
		for(Character key : keys){
			if(hm.get(key) > 1){
				countOfDuplicate++;
				System.out.println("Keys : "+key);
			}
		}
		System.out.println("count of duppl= "+ countOfDuplicate);
	}
}
