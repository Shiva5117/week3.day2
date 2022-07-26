package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		
		//Change to string array
		String[] str = text.split(" ");
		
		//Creating List
		Set<String> remo_dups = new LinkedHashSet<String>();
		
		//Add string array elements to Set
		for (int i = 0; i < str.length; i++) {
			remo_dups.add(str[i]);
		}
		
		//Print Set in String format
		for (String string : remo_dups) {
			System.out.print(string+" ");
		}
		

	}

}
