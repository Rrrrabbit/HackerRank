//---------------------------------------------------------------
//https://www.hackerrank.com/challenges/java-end-of-file/problem
//---------------------------------------------------------------

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //code i wrote-------------------------------
        Scanner sc = new Scanner(System.in);
        int lineno = 1;
        while(sc.hasNext()){
            String out = sc.nextLine();
            System.out.println(lineno+" "+out);
            lineno++;
        }
        //-------------------------------------------
    }
}
