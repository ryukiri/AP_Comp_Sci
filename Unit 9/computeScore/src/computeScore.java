public class computeScore {
    public int computeScore(String word){
        int[] points = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,3,3,10,1,1,1,1,4,4,8,4,10};
        String[] characters = {"A", "B", "C", "D", "E", "F", "G",
                               "H", "I", "J", "K", "L", "M", "N",
                               "O", "P", "Q", "R", "S", "T", "U",
                               "V", "W", "X", "Y", "Z"};
        int l = word.length();
        
        int sum = 0;
        for(int i=0; i<l; i++){
            word.indexOf(i);
            for(int ii = 0; ii<26; ii++){
                if(characters[ii].equals(word.indexOf(i))){
                    sum+=points[i];
                }
            }
        }
        return sum;
    }
}
