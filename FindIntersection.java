package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7};
		
		//Create List for array1 and array2
		List<Integer> arrayList1 = new ArrayList<Integer>();
		List<Integer> arrayList2 = new ArrayList<Integer>();
		
		//Add array1 in List(arrayList1)
		for (int i = 0; i < array1.length; i++) {
			arrayList1.add(array1[i]);
		}
		
		//Add array2 in List(arrayList2)
		for (int i = 0; i < array2.length; i++) {
			arrayList2.add(array2[i]);
		}
		
		//Get common elements of arrayList1 and arrayList2
		arrayList1.retainAll(arrayList2);
		
		//Print arrayList1 in integer type through for each loop
		for (Integer integer : arrayList1) {
			System.out.print(integer);
		}

	}

}
