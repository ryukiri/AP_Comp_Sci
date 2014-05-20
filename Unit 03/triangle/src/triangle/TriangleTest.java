package triangle;

// Run this test file and compare your input with the comments/expected output
public class TriangleTest 
{
    public static void main( String [] args )
    {
        Triangle test = new Triangle( 0, 0, 0, 5, 5, 0 );
        System.out.println( test.angleAt12() ); // 90.00000000000001
        System.out.println( test.angleAt13() ); // 45.0
        System.out.println( test.angleAt23() ); // 45.0 
        System.out.println( test.lengthOfSide1() ); // 5.0
        System.out.println( test.lengthOfSide2() ); // 5.0
        System.out.println( test.lengthOfSide3() ); // 7.0710678118654755
        System.out.println( test.calculatePerimeter() ); // 17.071067811865476
        System.out.println( test.calculateArea() ); // 12.5
    }
}
