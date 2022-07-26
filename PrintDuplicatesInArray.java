package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		//Create List
		Set<Integer> dups = new HashSet<Integer>();
		
		//Iterate through for each loop
		for (Integer integer : arr) {
			//When add returns false, it will print integer value(Duplicate)
			if (!dups.add(integer)) {
				System.out.print(integer+" ");
			}
		}

	}

}
