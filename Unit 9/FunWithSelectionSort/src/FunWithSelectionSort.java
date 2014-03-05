import java.util.*;

public class FunWithSelectionSort{ 
    private int [] list;
    
    public FunWithSelectionSort( int [] arr ){ 
        list = arr; 
    } 
    
    public int [] getList(){ 
        return list; 
    } 
    
    public void swap( int a, int b ){ 
    //It will take in two indices and swap those elements. For example, if list is: 
    // 5 4 6 3 7 2 8 1 9 
    //The statement swap(1, 3) will turn the list into this: 
    //5 3 6 4 7 2 8 1 9 (The data at index 1 and the data at index 3 have switched places)
        int indexOfA=0;
        for(int i = 0; i<list.length; i++){
            if(a==list[i]){
                indexOfA = i;
            }
        }

        int indexOfB=0;
        for(int i=0; i<list.length; i++){
            if(b==list[i]){
                indexOfB=i;
            }
        }
        
        int temp = list[indexOfA];
        list[indexOfA]=list[indexOfB];
        list[indexOfB]=temp;

        for(int i=0; i<list.length; i++){
            System.out.print(list[i]);
        }
    } 
    
    public int findIndexOfSmallest( int a ){ 
    //It will return the index of the smallest element, starting with element a. 
    //For example if list is: 
    //1 2 6 5 7 8 3 4 
    //The statement findIndexOfSmallest(2) will return 6. 
    //(6 is the index of the number 3, which is the smallest 
    //element if you start looking from element 2.)
        //Arrays.asList(list).indexOf(a);      //finds index of a  
        int index = 0;
        
        for(int i=a; i<list.length-1; i++){
            int first = list[i];
            int second = list[i+1];
            //System.out.print(first);
            
            if(first<second){
                index = i;
            }
        }
        return index;
    } 
    
    public void sort(){ 
    // Using a for loop, find the smallest element in the list starting with element 0, 
    // and swap it with element 0. Then find the smallest element in the list starting 
    // with element 1, and swap it with element 1. 
    // Repeat until you reach the end of the list. 
        
        
   } 
}
