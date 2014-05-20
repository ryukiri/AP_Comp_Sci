//
// Name: Austin Quach
// Date: 9.10.2013
// Module 1
// AP Computer Science
//

public class Module1
{
    // returns the square of the given parameter
    public static double square(double x)
    {
        return x * x;
    }
    
    // returns the sum of the parameters
    public static int addThem(int x, int y)
    {
        return x + y;
    }
    
    // returns the area of a circle of radius r
    public static double circleArea(double r)
    {
        return Math.PI * square(r);
    }

    // returns the area of a ring of inner radius "inner" and outer radius "outer"
    public static double ringArea(double inner, double outer)
    {
        return circleArea(outer) - circleArea(inner);
    }
        
    // returns celsius to fahrenheit and fahrenheit to celsius
    public static double cToF(double celsius){
        return (celsius*1.8) + 32;
    }
    
    // define currentTemp here
    public static double currentTemp(double time){
    return time + 40*.25;
    }
    
    // returns the length of something in inches when inputing feet and inches
    public static int lengthInInches(int feet, int inches){
    return inches = (12*feet)+inches;
    }
    
    // returns the area of a triangle when inputting base and height
    public static double triangleArea(double base, double height){
    double area;
    return area = (.5 * base)*height;
    }
    
    // returns total amount of money in cents after inputting number of quarters, dimes,
    // nickels, and pennies
    public static int sumCoins(int quarters, int dimes, int nickels, int pennies){
    
    return (quarters * 25) + (dimes * 10) + (nickels * 5) + (pennies) * 1;
    }
    
    // returns distance fallen after inputting time
    public static double distanceFallen(double time){
    return square(time)*(9.8)*(.5);
    }
    
    // returns the volume of a cylinder after inputting radius and height
    public static double cylinderVolume(double radius, double height){
    return Math.PI * square(radius) * height;
    }
    
    // define totalProfit here
    public static double totalProfit(int people){
        Double profit;
        return profit = (people*.5)-20;
    }
    
}