/*Write a Java method that takes a string as input and counts the occurrences of each character. 
The method should return a Map where the key is the character and the value is its count.*/
package javaPractice;
import java.util.*;

public class JavaPractice {
	
	public static void countOccurancesOfCharacters()
	{
		Map<Character,Integer> testMap=new HashMap<Character,Integer>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String inputString=sc.next();
		
		sc.close();
		
		for(char c : inputString.toCharArray())
		{
			if(testMap.containsKey(c))
			{
				testMap.put(c, testMap.get(c)+1);
			}
			else
			{
				testMap.put(c,1);
			}
		}
		
		System.out.println(testMap);
	}
	public static void main(String args[])
	{
		countOccurancesOfCharacters();
	}
}
