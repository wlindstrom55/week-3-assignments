
public class Methods {

	public static void main(String[] args) {
		
		int[] myArray = new int[3];
			myArray[0] = 32;
			myArray[1] = 44;
			myArray[2] = 23; // total is 99
		
		double[] doubleArray = new double[4];
			doubleArray[0] = 54.22;
			doubleArray[1] = 75.88;
			doubleArray[2] = 39.02;
			doubleArray[3] = 14.91; // total is 184.03
		
		double[] tripleArray = new double [3];
			tripleArray[0] = 55.55;
			tripleArray[1] = 66.66;
			tripleArray[2] = 44.44; // total is 166.65
			
		String firstName = "Will";
	  	String lastName = "Lindstrom";
	  	String fullName = createFullName(firstName, lastName);
	  	
	  	boolean isHotOutside = false;
	  	double moneyInPocket = 40.67;
		
			System.out.println(calculateAverage(doubleArray));
			System.out.println(fullName);
			System.out.println(multiplyString("Hello", 4));
			System.out.println(greaterThanHundred(myArray));
			System.out.println(averagingArrays(doubleArray, tripleArray));
			System.out.println("Will I buy a drink?: " + willBuyDrink(isHotOutside, moneyInPocket));
			System.out.println("The sum of the combined values of both arrays = " + totalArraySum(doubleArray, tripleArray));
			}
	
//    7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
 
	public static String multiplyString(String str, int num) {
	  String result = "";
	  for (int i = 0; i < num; i++) {
	  result += str;
	  }
	  return result;
	  }
  
//    8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).

	public static String createFullName(String x, String y) {
	  return x + " " + y;
  }
  
//    9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
     
	public static boolean greaterThanHundred(int[] myArray) {
		int sum = 0;
		for (int number : myArray) {
			sum += number;
		} 
		if( sum > 100) {
			return true;
	}
		else { 
			return false;
		}
		}
	
//    10. Write a method that takes an array of double and returns the average of all the elements in the array.
	
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}

//    11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	
	public static boolean averagingArrays(double[] doubleArray, double[] tripleArray) {
		double sum1 = 0;
		double sum2 = 0;
		for (double number : doubleArray) {
			sum1 += number;
		}
		for (double number : tripleArray) {
			sum2 += number;
		}
		if ( (sum1 / doubleArray.length) > (sum2 / tripleArray.length)) {
			return true;
		} else {
			return false;
	}
	}
	
//    12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		}
		else {
			return false;
		}
	}
	
//    13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

	public static double totalArraySum(double[] doubleArray, double[] tripleArray) {
		double sum1 = 0;		// variable storage for sum amount for doubleArray
		double sum2 = 0;        // variable storage for sum amount for tripleArray
		for (double number : doubleArray) {     // for loop for modifying sum1
			sum1 += number;
		}
		for (double number : tripleArray) {     //for loop for modifying sum2
			sum2 += number;
		}
			return sum1 + sum2;   //returns the combined total of all values in both arrays as a double.
		}							// I made this method for better practice double methods

}

