package multiconcat;

public class MultiConCatTest 
{
    public static void main(String args[])
    {
        MultiConCat cat1 = new MultiConCat();
        System.out.println("Both parameters provided:");
        System.out.print(cat1.concat("hi", 3));
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("No integer parameter:");
        System.out.print(cat1.concat("hi"));
        System.out.println("");
    }
}
