package practical7;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sum of Array Elements
		int sum = 0;
        int[] array = new int[5];
		Scanner obj  = new Scanner(System.in);
	    System.out.println("Enter the elements:");
	      for (int i=0; i<5; i++)
	      {
	    	  array[i] = obj.nextInt();
	      }
	      for(int num : array) 
	      {
	          sum = sum+num;
	      }
	      System.out.println("Sum of the array elements is: "+sum);

	}

}
