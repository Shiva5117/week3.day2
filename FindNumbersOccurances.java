package week3.day2;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		int[] arr = {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		//Sort given array
		Arrays.sort(arr);
		
		//Create TreeMap
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		
		//For loop -> each number -> add to the map
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			//If it is exist -> update it with + 1
			if(map.containsKey(key)) {
				int value = map.get(arr[i]);
				map.put(key, value+1);
			//Else -> new entry with 1 as value	
			}else {
				map.put(key, 1);
			}
		}
		System.out.println(map);

	}

}
