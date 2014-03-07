package arraylistaddstuff;
import java.util.*;

public class ArrayListAddStuff {
    public static void main(String[] args) {
        int num[][]={{1,2,3},{4,5,6}};
        
        int sum1 = 0;
        for(int i = 0; i<num[0].length; i++){
            sum1+=num[0][i];
        }
        //System.out.println(sum1);
        
        int sum2 = 0;
        for(int i = 0; i<num[0].length; i++){
            sum2+=num[1][i];
        }
        //System.out.println(sum2);
        
        int length = num[1].length;
        for(int r = 0; r<num.length;r++){
            for(int c = 0; c<num[0].length; c++){
                System.out.print(num[r][c] + "\t");
                if(c==num[0].length-1 && r==0){
                    System.out.print( " = " + sum1);
                }else if(c==num[0].length-1 && r==1){
                    System.out.print( " = " + sum2);
                }
            }
            System.out.println();
        }
        
       int moreSum = 0;
      
       System.out.println();
        
       for(int r1 = 0; r1<=num.length; r1++){
           for(int c1 = 0; c1<num[0].length; c1++){
               if(c1==0){
                   System.out.print(num[c1][r1]+num[c1+1][r1]+"\t");
               }
           }
       }
    }
}
