package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuredElement {

	public static void main(String[] args) {
		String str = "abbaba";
		
		//Change string to char array
		char[] chArray = str.toCharArray();
		
		//Create HashMap
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		//For loop -> each number -> add to the map
		for (int i = 0; i < chArray.length; i++) {
			char key = chArray[i];
			if (map.containsKey(key)) {
				int value = map.get(key);
				map.put(key, value+1);
				int maxvalue = map.get(key);
				//Keep comparing the occurance with other values -> max value -> character
				if (maxvalue > value) {
					System.out.println(chArray[i]);
					break;
				}
			}else {
				map.put(key, 1);
			}
		}

	}

}
