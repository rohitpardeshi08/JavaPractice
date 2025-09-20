/*Write a Java method that takes a string as input and counts the occurrences of each character. 
The method should return a Map where the key is the character and the value is its count.*/
package javaPractice;
import java.util.*;

public class JavaPractice {
	
	public static void findingLargestNumberInTheArray()
	{
		int intArray[]= {97,11,22,1028,88,65,96,36};
		
		Arrays.sort(intArray);
		
		System.out.println("Largest Number is"+intArray[intArray.length-1]);
	}
	public static void main(String args[])
	{
		findingLargestNumberInTheArray();
	}
}
