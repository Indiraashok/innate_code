import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        long n,count=0,sum=0,copy,ld,power=1;
        n=s.nextLong();
        copy=n;
        while(n>0)
        {
            n/=10;
            count++;
        }
        n=copy;
        while(n>0){
            power=1;
             ld=n%10;
            n/=10;
        for(int i=1;i<=count;i++)
        {
            
            power=power*ld;
        }
        sum+=power;
            // System.out.println(sum);
        }
        if(sum==copy)
            System.out.println("Armstrong number");
        else
             System.out.println("Not an Armstrong number");
        
    }
}
