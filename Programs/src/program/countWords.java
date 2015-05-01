package program;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class countWords {

	public static final void main(String[] args) {
		String str = "Hi hello World 123!@";
	
		countWords cw = new countWords();
		cw.usingTreeMap(str);
		cw.usingHashMap(str);
	}

	public void usingTreeMap(String str){
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();

		for (char c: str.toCharArray())
		{
		  Integer i = map.get(c);
		  if (i == null)
		    i = 0;
		  map.put(c, i+1);
		}
		System.out.println("USing treemap: "+map);
	}
	
	public void usingHashMap(String str){
		int len = str.length();
		Map<Character, Integer> numChars = new HashMap<Character, Integer>(Math.min(len, 26));

		for (int i = 0; i < len; ++i)
		{
		    char charAt = str.charAt(i);

		    if (!numChars.containsKey(charAt))
		    {
		        numChars.put(charAt, 1);
		    }
		    else
		    {
		        numChars.put(charAt, numChars.get(charAt) + 1);
		    }
		}
		System.out.println("Using hash map : "+numChars);
	}
}
