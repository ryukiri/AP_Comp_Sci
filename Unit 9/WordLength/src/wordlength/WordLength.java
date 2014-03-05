package wordlength;

import java.io.*;
import java.util.*;

public class WordLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
              
        String words[]=new String[5];
        
        for(int i=0; i<5;i++){
            System.out.println("Enter a word: ");
            words[i] = input.next();
        }
        
        int word1 = words[0].length();
        int word2 = words[1].length();
        int word3 = words[2].length();
        int word4 = words[3].length();
        int word5 = words[4].length();
        int total = word1+word2+word3+word4+word5;
        
        System.out.print("There are " + total + " letters in ");
        System.out.println("\"" +words[0] + " " + words[1] + " " + words[2] + " " + words[3] + " " + words[4] + "\"");
    }   
}
