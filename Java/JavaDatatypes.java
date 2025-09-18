//------------------------------------------------------------
//https://www.hackerrank.com/challenges/java-datatypes/problem
//------------------------------------------------------------

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                //code i wrote ---
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-squareOfTwo(31) && x<=squareOfTwo(31)-1)System.out.println("* int");
                if(x>=-squareOfTwo(63) && x<=squareOfTwo(63)-1)System.out.println("* long");
                //----------------
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }

    //code i wrote ---
    //all should be 'long' to hold any data type
    public static long squareOfTwo(long x){
        long sum = 1;
        for(long i=0;i<x;i++){
            sum *= 2;
        }
        return sum;
    }
    //----------------
}
