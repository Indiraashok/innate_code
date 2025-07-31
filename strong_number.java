import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        long n,sum=0,ld;
        n=s.nextLong();
        long copy=n;
        while(n>0)
        {
            long fact=1;
            ld=n%10;
            n/=10;
            for(int i=1;i<=ld;i++)
            {
                fact=fact*i;
            }
            sum+=fact;
        }
        if(sum==copy)
        System.out.println("Strong Number");
        else
            System.out.println("Not a strong number");
    }
}
