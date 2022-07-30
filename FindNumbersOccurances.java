package week3.day2.assignments.mandatory;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		/* Psuedcode:
			 * 
			 * 1) Create Map -> TreeMap
			 * 2) For loop -> each number -> add to the map
			 * 3) If it is exist -> update it with + 1
			 * 	  Else -> new entry with 1 as value
			 * 
			 */
             //declare an array
			 int[] arr={2,6,5,7,3,2,1,4,2,1,6,-1};
			 //Create Map
			 Map<Integer,Integer> numOccurance=new TreeMap<Integer,Integer>();
			 //For loop -> each number -> add to the map
			 for (int i = 0; i < arr.length; i++) {
				 //put the array into map and order
				 numOccurance.put(arr[i],numOccurance.getOrDefault(arr[i],0)+1);
				
			}
			 //Print the map
			 System.out.println(numOccurance);

	}

}
