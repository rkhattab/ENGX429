package Arrays;


/**
 *
 * @author Reem Khattab
 */

public class AverageArray {
	public static void main(String[] args) {
		int[] temperature = {68, 73, 69, 83, 89, 88, 87};
		int average = 0; 
		int sum = 0; 
	    for (int i= 0; i < temperature.length; i++) {
		    sum = sum + temperature[i];    
	    	}
	    average = sum / temperature.length; 
	    System.out.println("Average value of array element is " + average);  
	}
}