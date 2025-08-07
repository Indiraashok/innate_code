import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        long count =1,maj=0,data=0;
        int n=s.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        
        for(int i=0;i<n-1;i++)
        {
           
            if(a[i]==a[i+1])
                count++;
            else
            {
                if(maj<count)
                {
                maj=count;
                data=a[i];
                }
                count=1;
                
            }
           
            
        }
        if(maj>n/2)
            System.out.println("The majority element is : "+data);
        else
            System.out.println("No majority element found in the array");
        }
}
