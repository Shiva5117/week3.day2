package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		
		//Creating List
		List<Integer> secLarge = new ArrayList<Integer>();
		
		//Add elements in secLarge list
		for (int i = 0; i < data.length; i++) {
			secLarge.add(data[i]);
		}
		
		//Sort a list
		Collections.sort(secLarge);
		
		//Take second large element
		int size = secLarge.size();
		System.out.println("Second Large element is "+secLarge.get(size-2));

	}

}
