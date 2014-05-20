public class Hello {
    public static void main(String args[]){
        char[] hello = {' ', 'h', 'e', 'l', 'l', 'o'};
        
        int i = 1;
        while(i<6){
            hello[i-1]=hello[i];
            i++;
        }
        hello[5]='!';
    }
}
