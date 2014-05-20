package MagicSquareTest;


import MagicSquareTest.MagicSquare;

public class squareTest {
    public static void main(String args[]){
        MagicSquare box = new MagicSquare();
        int arr[][]={   {1, 2, 3}, 
                        {3, 2, 1} };
        
        box.isMagicSquare(arr);
        //System.out.println(arr.length);
        //System.out.println(arr[0].length);
        
        if(box.isMagicSquare(arr)==true){
            System.out.println("true");
        }else
            System.out.println("false");
    }
}
