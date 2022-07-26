package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		
		//Create List
		List<Integer> arr1 = new ArrayList<Integer>();
		
		//Add elements of arr to List
		for (int i = 0; i < arr.length; i++) {
			arr1.add(arr[i]);
		}
		
		//Sort a List
		Collections.sort(arr1);
		
		//Print the Missing element of arr
		for (int i = 0; i < arr1.size(); i++) {
			if (!arr1.contains(i)) {
				System.out.println(i);
			}
		}
	}
}
