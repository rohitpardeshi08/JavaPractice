//Finding Second Largest number in the Array:
package javaPractice;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class JavaPractice {
	
	public static void findSecondLargestNumber()
	{
		int intArray[]= {100,99,88,44,76};
		
		Arrays.sort(intArray);
		
		System.out.println("Second Largest Number is "+intArray[intArray.length-2]);
	}
	public static void main(String args[])
	{
		findSecondLargestNumber();
	}
}
