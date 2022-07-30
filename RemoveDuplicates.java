package week3.day2.assignments.mandatory;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * Pseudo code 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 * g) Displaying the String without duplicate words	
		 */
		//declare String text
		String text = "We learn java basics as part of java sessions in java week1";
		//declare integer
		int count=0;
		//Split the String into array
		String[] split = text.split(" ");
		//iterate over it
		for (int i = 0; i < split.length; i++) {
			//Initialize another loop to check whether the word is in the array
			for (int j = i+1; j < split.length; j++) {
				//if it is available then increase and count by 1
				if(split[i].equalsIgnoreCase(split[j]))
				{
					count++;
				//if the count > 1 then replace the word as ""
					if(count>1)	{
						split[i]="";
						}
				}
			}
			System.out.print(split[i]+"\t");
		}
		
}
	
}
