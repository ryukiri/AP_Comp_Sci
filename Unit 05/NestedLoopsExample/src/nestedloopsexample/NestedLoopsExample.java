package nestedloopsexample;

//import java.util.Scanner;

public class NestedLoopsExample 
{
    public static void main(String args[])
    {
        //Scanner input = new Scanner(System.in);
        //System.out.print("Enter a Number: ");
        //int x = input.nextInt();
        
        for(int r1=0; r1<6;r1++)
        {
            for(int c1=0; c1<r1+1;c1++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        
        /*for(int r=0; r<6;r++)
        {
            for(int c=6; c>r+1; c--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }*/
    }
}
