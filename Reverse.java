import java.lang.*;
import java.io.*;
import java.util.*;
 

class Reverse {
    public static void main(String[] args)
    { 
    	Scanner sc = new Scanner(System.in);
    	
        System.out.println("enter a string");
        String input = sc.next();
 
        StringBuilder input1 = new StringBuilder();
 
        
        input1.append(input);
 
        
        input1.reverse();
        System.out.println(input1);
    }
}