
public class hw2 {

	public static void main(String[] args) {
		
		String[] namesArray = new String[6];
		namesArray[0]= "Sam";
		namesArray[1]= "Tommy";
		namesArray[2]= "Tim";
		namesArray[3]= "Sally";
		namesArray[4]= "Buck";
		namesArray[5]= "Bob";
		
		int charSum = 0;
		double averageChar = 0;
		
		   System.out.println("The total number of names in namesArray = " + namesArray.length);
		int[] namesLength = new int [6]; // for a later question?
		
//		  for (int y = 0; y <= 5; y++) { // amount of chars per name
//	             namesLength[y] =  namesArray[y].length();
//	            System.out.println("The amount of characters for name " + y + " is " + namesLength[y]);
//	             }
		  for (int i = 0; i <= 5; i++) { // sum of chars per name in array AND average characters per name
			 charSum = charSum + namesArray[i].length();
		  }
		  for (int r = 0; r < namesArray.length; r++) { //loop to print all names concat w/ spaces
			  System.out.print(namesArray[r] + " ");
	        }
		  
		  averageChar = (double)charSum / (double)namesArray.length;
		  System.out.println(); //to add a break after the names array concat
		  System.out.println("The sum of characters in the array = " + charSum);
		  System.out.println("The average number of characters per word = " + averageChar);
}
}
