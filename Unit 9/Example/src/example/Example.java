package example;

import java.util.*;
import java.io.*;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many numbers do you want to enter?");
        int x = input.nextInt();
        
        int num[] = new int[x];
        
        for(int i=0; i<x; i++){
            System.out.println("Enter a number: ");
            num[i]=input.nextInt();
        }
        
        double sum = 0;
        
        for(int i=0; i<x;i++){
            sum+=num[i];
        }
        
        double average = (double)sum/num.length;
        System.out.println(average);
    }  
}
