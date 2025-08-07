import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int zc=0,oc=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            if(a[i]==0)
                 zc++;
            else
                 oc++;
        }
        System.out.println("zc = "+zc);
        System.out.println("oc = "+oc);
        
    }
}
