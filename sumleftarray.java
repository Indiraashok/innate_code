import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n,i,sum=0;
        n=s.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.print(sum+" ");
            a[i]=s.nextInt();
            sum+=a[i];
        }
    }
}
