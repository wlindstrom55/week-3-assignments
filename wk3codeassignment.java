
public class wk3codeassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Create an array of int called ages that contains
	//the following values: 3, 9, 23, 64, 2, 8, 28, 93.	
//        a. Programmatically subtract the value of the first element 
//        in the array from the value in the last element of the array 
//        (i.e. do not use ages[7] in your code). Print the result to the console.
//			b. Add a new age to your array and repeat the 
//			step above to ensure it is dynamic (works for arrays of different lengths).
		
		int[] ages = new int[9];
				
		ages[0]= 3;
		ages[1]= 9;
		ages[3]= 23;
		ages[4]= 64;
		ages[5]= 2;
		ages[6]= 8;
		ages[7]= 28;
		ages[8]= 93;
		
		int firstElement = ages[0];
		int lastElement = ages[ages.length-1];
		int answer = firstElement - lastElement;
		
		System.out.println("The first element: " + firstElement + ", minus the last element, " + lastElement + " = " + answer );
		
		
		//Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int sum = 0;
		for(int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
		System.out.println("The average age = " + (sum / ages.length));
				

	}

}
