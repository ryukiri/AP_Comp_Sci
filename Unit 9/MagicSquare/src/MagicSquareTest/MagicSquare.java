package MagicSquareTest;

import java.util.*;

public class MagicSquare {
    public boolean isMagicSquare(int arr[][]){
        boolean value = isSquare(arr);
        List<Integer> sums = new ArrayList<Integer>();
        if(value==false){
            return false;
        }
        
        int r = arr.length;
        //System.out.println("r is "+ r);
        
        if(value==true){
            for(int i=1; i<=r;i++){ //sums for horizontal rows
                int sum=0;                
                for(int ii=0; ii<r; ii++){
                   sum+=arr[i-1][ii];
                }
                sums.add(sum);
                //System.out.println("Current sum is:" + sum);
            }
            
            for(int i=0; i<r;i++){ //sums for vertical columns
                int sum=0;                
                for(int ii=1; ii<=r; ii++){
                   sum+=arr[ii-1][i];
                }
                sums.add(sum);
                //System.out.println("Current sum is:" + sum);
            }
            
            int loop=1;
            while(loop==1){
                int sum=0;
                for(int i=0; i<r;i++){ //sums for diagonal left to right              
                    for(int ii=0; ii<r; ii++){
                       if(i==ii){
                       sum+=arr[i][i];
                       }
                    }
                }
            sums.add(sum);
            //System.out.println("Current sum is:" + sum);
            loop++;
            }
            
            int loop1=1;
            while(loop1==1){
                int sum=0;
                for(int i=0; i<r;i++){ //sums for diagonal right to left               
                    for(int ii=r-i-1; ii>=0; ii--){
                       sum+=arr[i][ii];
                       //System.out.print(arr[i][ii]);
                       break;
                    }
                }
            sums.add(sum);
            //System.out.println("Current sum is:" + sum);
            loop1++;
            }
        }
        
        System.out.println(sums);
        int check = sums.get(0);
        for(int i=1; i<sums.size();i++){
            if(sums.get(i)!=check)
                return false;
        }
        return true;
        /*
        if(!(sums.contains(check))){
            return false;
        }else
            return true;
                */
    }
    
    public boolean isSquare(int arr[][]){
        if(arr.length==arr[0].length){
            return true;
        }else
            return false;
    }
}