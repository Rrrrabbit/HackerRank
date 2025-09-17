//--------------------------------------------------------
//https://www.hackerrank.com/challenges/java-loops/problem
//--------------------------------------------------------

import java.util.*;
import java.io.*;

class JavaLoopsII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();     //num of queries
        for(int i=0;i<t;i++){   //loop ตามจำนวนครั้งของ t
            int a = in.nextInt();   //เลข a เลขหน้า
            int b = in.nextInt();   //เลข b
            int n = in.nextInt();   //เลขจำนวนพจน์

            //first
            int sum = a + (squareOfTwo(0)*b);
            System.out.print(sum+" ");

            for(int j=1;j<n;j++){
                sum += (squareOfTwo(j)*b);
                System.out.print(sum+" ");
            }
            System.out.println();   //ขึ้นบรรทัดใหม่
        }
        in.close();
    }

    public static int squareOfTwo(int x){
        int sum = 1;
        for(int i=0;i<x;i++){
            sum *= 2;
        }
        return sum;
    }
}
