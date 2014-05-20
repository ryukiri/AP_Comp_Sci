package stringbuffers;

public class StringBuffers 
{
    public static void main(String[] args) 
    {
        StringBuffer word = new StringBuffer();
        
        word.append("hello");
        word.append(" hi");
        System.out.println(word);
        word.insert(0, "b");
        word.deleteCharAt(1);
        word.setCharAt(5, 'f');
        System.out.println(word);
    }
}
