package triangle;

// Austin Quach
// APCS Period 3

/*In this project, you will perform calculations with triangles. 
 * A triangle is defined by the x- and y- coordinates of its three corner points. 
 * Your job is to computer the following properties of a given triangle:
 * -The lengths of all sides
 * -The angles at all corners
 * -The perimeter
 * -The area
*/

public class Triangle
{
	// Field Variables Here
	private int xCoord1;
        private int yCoord1;
        private int xCoord2;
        private int yCoord2;
        private int xCoord3;
        private int yCoord3;
	   
        // Constructor
	public Triangle( int x1, int y1, int x2, int y2, int x3, int y3 )
	{
            // Complete the constructor
            xCoord1 = x1;
            yCoord1 = y1;
            xCoord2 = x2;
            yCoord2 = y2;
            xCoord3 = x3;
            yCoord3 = y3;		
	}
	
	// Length of coordinate 1 to coordinate 2
	public double lengthOfSide1()
	{
            // Insert code here
            return Math.sqrt((xCoord1-xCoord2)*(xCoord1-xCoord2)+(yCoord1-yCoord2)*(yCoord1-yCoord2));
	}

	// Length of coordinate 1 to coordinate 3
	public double lengthOfSide2()
	{
            // Insert code here
            return Math.sqrt((xCoord1-xCoord3)*(xCoord1-xCoord3)+(yCoord1-yCoord3)*(yCoord1-yCoord3));
	}

	// Length of coordinate 2 to coordinate 3
	public double lengthOfSide3()
	{
            // Insert code here
            return Math.sqrt((xCoord2-xCoord3)*(xCoord2-xCoord3)+(yCoord2-yCoord3)*(yCoord2-yCoord3));
	}

	// Calculates the angle that is formed by side 1 and side 2
	public double angleAt12()
	{
            // Insert code here
            // c^2 = a^2 + b^2 -2 a b cosC
            //cosC = (c^2-a^2-b^2)/-2ab
            double a = Math.sqrt((xCoord1-xCoord2)*(xCoord1-xCoord2)+(yCoord1-yCoord2)*(yCoord1-yCoord2));     //length of Side 1    
            double b = Math.sqrt((xCoord1-xCoord3)*(xCoord1-xCoord3)+(yCoord1-yCoord3)*(yCoord1-yCoord3));     //length of Side 2
            double c = Math.sqrt((xCoord2-xCoord3)*(xCoord2-xCoord3)+(yCoord2-yCoord3)*(yCoord2-yCoord3));     //length of Side 3
           
            double cSq = c*c;
            double bSq = b*b;
            double aSq = a*a;
            
            double preAns = (cSq - aSq - bSq) / (-2*a*b);
            double cos = Math.acos(preAns);
            return Math.toDegrees(cos);

        }

	// Calculates the angle that is formed by side 1 and side 3
	public double angleAt13()
	{	
            // Insert code here
            //b^2 = a^2 + c^2 - 2ac Cosb
            //cosb = (b^2-a^2-c^2) / -2ac
            double a = Math.sqrt((xCoord1-xCoord2)*(xCoord1-xCoord2)+(yCoord1-yCoord2)*(yCoord1-yCoord2));     //length of Side 1    
            double b = Math.sqrt((xCoord1-xCoord3)*(xCoord1-xCoord3)+(yCoord1-yCoord3)*(yCoord1-yCoord3));     //length of Side 2
            double c = Math.sqrt((xCoord2-xCoord3)*(xCoord2-xCoord3)+(yCoord2-yCoord3)*(yCoord2-yCoord3));     //length of Side 3
            
            double cSq = c*c;
            double bSq = b*b;
            double aSq = a*a;
            
            double preAns = bSq - cSq - aSq;
            double divide = preAns / (-2*a*c);
            double cosS = Math.acos(divide);
            return Math.toDegrees(cosS);
	}

	// Calculates the angle that is formed by side 2 and side 3
	public double angleAt23()
	{
            // Insert code here
            // a^2 = b^2 + c^2 -2bcCosA
            // cosA = (a^2 - b^2 - c^2)/-2bc      
            double a = Math.sqrt((xCoord1-xCoord2)*(xCoord1-xCoord2)+(yCoord1-yCoord2)*(yCoord1-yCoord2));     //length of Side 1    
            double b = Math.sqrt((xCoord1-xCoord3)*(xCoord1-xCoord3)+(yCoord1-yCoord3)*(yCoord1-yCoord3));     //length of Side 2
            double c = Math.sqrt((xCoord2-xCoord3)*(xCoord2-xCoord3)+(yCoord2-yCoord3)*(yCoord2-yCoord3));     //length of Side 3
            
            double cSq = c*c;
            double bSq = b*b;
            double aSq = a*a;
            
            double preAns = (aSq-bSq-cSq) / (-2*b*c);
            double cos = Math.acos(preAns);
            return Math.toDegrees(cos);
	}

	public double calculatePerimeter()
	{
		// Insert code here
            double a = Math.sqrt((xCoord1-xCoord2)*(xCoord1-xCoord2)+(yCoord1-yCoord2)*(yCoord1-yCoord2));     //length of Side 1    
            double b = Math.sqrt((xCoord1-xCoord3)*(xCoord1-xCoord3)+(yCoord1-yCoord3)*(yCoord1-yCoord3));     //length of Side 2
            double c = Math.sqrt((xCoord2-xCoord3)*(xCoord2-xCoord3)+(yCoord2-yCoord3)*(yCoord2-yCoord3));     //length of Side 3
            return a+b+c;     
	}

	public double calculateArea()
	{
            // Insert code here
            //(1/2 a b sin c)
            
            //double s;
            //s = Triangle.findDistance(xCoord1, xCoord2, yCoord1, yCoord2);
            
            double a = Math.sqrt((xCoord1-xCoord2)*(xCoord1-xCoord2)+(yCoord1-yCoord2)*(yCoord1-yCoord2));     //length of Side 1    
            double b = Math.sqrt((xCoord1-xCoord3)*(xCoord1-xCoord3)+(yCoord1-yCoord3)*(yCoord1-yCoord3));     //length of Side 2
            double c = Math.sqrt((xCoord2-xCoord3)*(xCoord2-xCoord3)+(yCoord2-yCoord3)*(yCoord2-yCoord3));     //length of Side 3
            
            double preArea = (.5*a)*b;
            return preArea;
	}
        
        private double findDistance(int x1, int x2, int y1, int y2)
        {
            return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));                        
        }	
}
		