package pkg2darrayexample;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Main{
    public static void main(String[] args){          
        
        int [][] gameBoard = new int[3][5];
        int prizeR = (int)(Math.random()*gameBoard.length);
        int prizeC = (int)(Math.random()*gameBoard[0].length);
        gameBoard[prizeR][prizeC] = 1;
        
        Scanner input = new Scanner(System.in);
        
        boolean hasWon = false;
        
        while(!hasWon){
            System.out.print("Enter a row number (0-"+(gameBoard.length-1)+"): ");
            int row = input.nextInt();
            System.out.print("Enter a row number (0-"+(gameBoard[0].length-1)+"): ");
            int column = input.nextInt();
            
            if(gameBoard[row][column]==1){
                hasWon=true;
                System.out.println("You have won!");
            }else if(gameBoard[row][column]==-1){
                System.out.println("You already guessed that location.");
            }else{
                System.out.println("You lost, try again.");
                gameBoard[row][column]=-1;
            }
        }
        
        int count = 0;
        for(int r = 0; r<gameBoard.length; r++){
            for(int c = 0; c<gameBoard[0].length; c++){
                System.out.print(gameBoard[r][c] + "\t");
                if(gameBoard[r][c]==-1 || gameBoard[r][c]==1)
                    count++;
            }
            System.out.println();
        }
        
        System.out.println("It took you "+ count+" tries.");
        
        }
}
