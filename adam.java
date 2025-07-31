import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        long n,rev=0,copy,ld,ld1,rev1=0;
        n=s.nextLong();
        long sqr=n*n;
        while(n>0)
        {
            ld=n%10;
            n/=10;
            rev=rev*10+ld;
            
        }
          // System.out.println(rev);
        long sqr_rev=rev*rev;
        while(sqr_rev>0)
        {
            ld1=sqr_rev%10;
            sqr_rev/=10;
            rev1=rev1*10+ld1;
            
        }
          // System.out.println(rev1);
        
        if(sqr==rev1)
            System.out.println("Adam Number");
        else
            System.out.println("Not a adam number");
        
        
    }
}
