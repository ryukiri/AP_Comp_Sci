// Finds the two largest elements in scores
// and returns their average.
// Precondition: scores.length >= 2.

public class Average {
    public static double averageTopTwo(int[] scores){
        int i; 
        int n = scores.length;
        int iMax1 = 0;  //index of largest element
        int iMax2 = 1;  //index of second largest element
        
        //If scores[iMax2] is bigger than scores[iMax1] --
        //swap iMax1 and iMax2
        if (scores[iMax2] > scores[iMax1]){
            i=iMax1;
            iMax1 = iMax2;
            iMax2 = i;
        }
        
        //n = length of scores
        for(i=2; i<n; i++){
            if(scores[i] > scores[iMax1]){
                iMax1=i;
            }else if(scores[i] > scores[iMax2]){
                iMax2 = i;
            }
        }
    return (iMax2 + iMax1)/2;
    }
}
