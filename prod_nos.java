import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int prod=1;
        while(num>0)
        {
            prod=prod*(num%10);
            num=num/10;
        }
        System.out.println(prod);
    }
}
