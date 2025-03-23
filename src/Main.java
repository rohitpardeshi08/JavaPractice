import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a[]={1,3,5,7,9};
        int b[]={2,4,6,8,10};
        int c[];

        Set<Integer> setDemo=new HashSet<>();

        for(int i=0;i<a.length;i++)
        {
            setDemo.add(a[i]);
        }
        for(int i=0;i<b.length;i++)
        {
            setDemo.add(b[i]);
        }
        System.out.println(setDemo);

        System.out.println("Code is connected to Github Now..");
        System.out.println("Testing Pull request");
    }
}
