public class ComplexNumbersTest extends junit.framework.TestCase
{

    public void testComplex1()
    {
    	Complex number1 = new Complex( 1, 2 );
	Complex number2 = new Complex( 3, 4 );
	
	Complex number3 = number1.add( number2 );
	assertEquals( "4.0 + 6.0i", number3.toString() );   
    }
    
    public void testComplex2()
    {
	Complex number1 = new Complex( 5, 6 );
	assertEquals( 51.0, number1.abs() );   
    }
    
    public void testComplex3()
    {
	Complex number1 = new Complex( 8 );
	assertEquals( 8.0 , number1.getA()); 
	assertEquals( 0.0 , number1.getB()); 
    }

    public void testComplex4()
    {
	Complex number1 = new Complex( 1, 2 );
	Complex number2 = number1.add( 4 );
	assertEquals( "5.0 + 2.0i", number2.toString() );   
    }
    
    public void testComplex5()
    {
	Complex number1 = new Complex( 1, 2 );
	Complex number2 = new Complex( 3, 4 );
	
	Complex number3 = number1.multiply( number2 );
	assertEquals( "-5.0 + 10.0i", number3.toString() );    
    }
    public void testComplex6()
    {
	Complex number1 = new Complex( 2, 3 );
	Complex number2 = number1.multiply( 5 );
	assertEquals( "10.0 + 15.0i", number2.toString() );   
    }
    
    
}
