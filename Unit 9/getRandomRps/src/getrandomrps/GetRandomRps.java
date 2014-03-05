package getrandomrps;

public class GetRandomRps {
    public static void main(String[] args) {
        char[] arr = {'r', 'r', 'r', 
                    'p', 'p', 'p', 'p', 'p', 
                    's', 's', 's', 's', 's', 's'};
        
        int x = (int)(Math.random()*14)+1;
        System.out.println(arr[x]);
    }   
}
