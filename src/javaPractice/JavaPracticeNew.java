package javaPractice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaPracticeNew extends JavaPractice{
	
public static void main(String[] args) {
	
	Set<String> setDemo=new HashSet<String>();
    
    setDemo.add("Rohit");
    setDemo.add("Bandu");
    setDemo.add("Pardeshi");
   
    System.out.println(setDemo.size());
	}
}
