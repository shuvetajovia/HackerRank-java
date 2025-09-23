import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;



public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       for(int i = 1; i<11 ; i++){
        System.out.println( a + " x " + i +" = "+ (i*a));
       }
       sc.close();
    }
}
