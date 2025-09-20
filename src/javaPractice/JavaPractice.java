/*Write a Java method that takes a string as input and counts the occurrences of each character. 
The method should return a Map where the key is the character and the value is its count.*/
package javaPractice;
import java.util.*;

public class JavaPractice {
	
	public static void findingDuplicateOccurancesOfCharacter()
	{
		int count=0;
		Set<Character> testSet=new HashSet<Character>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String");
		
		String inputString=sc.next();
		
		System.out.println("Entered String is:"+inputString);
		
		sc.close();
	
		char charArray[]=inputString.toCharArray();
		
		for(int i=0;i<inputString.length();i++)
		{
			if(!testSet.add(charArray[i]))
			{
				System.out.println(charArray[i]);
				count=count+1;
			}
		}
		System.out.println("Count of Duplicate Elements are"+count);
	}
	public static void main(String args[])
	{
		findingDuplicateOccurancesOfCharacter();
	}
}
