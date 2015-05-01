package praveen;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateFromArray {
	public static void main(String[] args){
		String[] data = {"a","c","d","a","b"};
		RemoveDuplicateFromArray rd = new RemoveDuplicateFromArray();
		rd.RemoveDuplicates(data);
	}
	public void RemoveDuplicates(String[] input){
		Set<String> set = new HashSet<String>(); 
		for(int i=0; i<input.length; i++){
			set.add(input[i]);
		}

		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}	
	}
}
