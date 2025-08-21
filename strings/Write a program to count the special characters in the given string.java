import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            if(!Character.isLetterOrDigit(a.charAt(i)))
                count++;
        }
        System.out.println(count);
    }
}
