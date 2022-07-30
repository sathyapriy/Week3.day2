package week3.day2.assignments.mandatory;

public class FindIntersection {

	public static void main(String[] args) {
		
			//declared two array varible
			int[] arr1={7,2,11,5,6,3};
			int[] arr2={1,2,8,10,9,0};
			//Declare for loop iterator from 0 to array length
			for (int i = 0; i < arr2.length; i++) {
		    //Compare Both the arrays using a condition statement
				if(arr1[i]==arr2[i])
				{
					//Print the first array (should match item in both arrays)
					System.out.println(arr1[i]);	
				}		
			}	
		}

	}
