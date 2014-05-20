package basiccalculator;

/**
 * Very Basic Calculator that gives out the sum, difference, product, and 
 * quotient when given two numbers.
 * 
 * @Austin
 * 
 */
import java.util.Scanner;

public class BasicCalculator
{
    public static void main(String[] args)
    {
        int y = 1;
        int x = 0;
        while(x==0)
        {
            while(y == 1){
            System.out.println("Enter first number.");
            Scanner input = new Scanner(System.in);
            Double num1 = input.nextDouble();
            System.out.println(" ");
            System.out.println("Enter second number.");
            Double num2 = input.nextDouble();
            System.out.println(" ");
            System.out.println("Would you like to add, subtract, multiply, or divide?");
            System.out.println("Please enter 1 for add, 2 for subtract, 3 for multiply, and 4 for divide.");

            int operation = input.nextInt();

            double sum = num1 + num2;
            double subtract = num1 - num2;
            double product = num1 * num2;
            double divide = num1/num2;

            if(operation == 1){
                System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);
                System.out.println(" ");
                x=x+1;
            }else if(operation == 2){
                System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + subtract);
                System.out.println(" ");
                x=x+1;
            }else if(operation == 3){
                System.out.println("Product: " + num1 + " * " + num2 + " = " + product);
                System.out.println(" ");
                x=x+1;
            }else if(operation == 4){
                System.out.println("Divide: " + num1 + " / " + num2 + " = " + divide);
                System.out.println(" ");
                x=x+1;
            }else{
                System.out.println("Error. Please enter the correct operation number.");
                System.out.println(" ");
            }
                int z=0;
                while(z==0)
              {
                System.out.println("Do you wish to continue?");
                System.out.println("Enter 1 for yes. Enter 2 for no.");
                int choice = input.nextInt();
                
                
                    if(choice == 1){
                    z++;
                    }else if(choice == 2){
                    y++;
                    z++;
                    }else if(choice > 2){
                    System.out.println("Please Answer The Question ");
                    System.out.println(" ");
                    }else if(choice < 1){
                    System.out.println("Please Answer The Question ");
                    System.out.println(" ");
                    }
                }   
            }
        }
    }
}
