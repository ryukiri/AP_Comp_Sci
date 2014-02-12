import java.util.ArrayList;
import java.util.List;

public class PigLatin 
{
    private String w;
    private String ww;
    private int x;
    private final List<String> list2 = new ArrayList<>();
    
    String translateWord(String word)
    {
        w = word;
        startConsonant(word);
        //startConsonant(w);
        startVowel(word);
        qu(word);
        return w;
    }
    
    void startConsonant(String word)
    {
        int loop = 0;
        //while(loop<1)
        //{
           if(word.charAt(0) != 'a')
           {
               String s = word.substring(1);
               w = s+word.charAt(0)+"ay";
           }
           else if(word.charAt(0) != 'e')
           {
               String s = word.substring(1);
               w = s+word.charAt(0)+"ay";
           }
           else if(word.charAt(0) != 'i')
           {
               String s = word.substring(1);
               w = s+word.charAt(0)+"ay";
           }
           else if(word.charAt(0) != 'o')
           {
               String s = word.substring(1);
               w = s+word.charAt(0)+"ay";
           }
           else if(word.charAt(0) != 'u')
           {
               String s = word.substring(1);
               w = s+word.charAt(0)+"ay";
           }
        //}
    }
    
    void startVowel(String word)
    {
        if(word.charAt(0) == 'a')
        {
            w = word+"way";
        }
        else if(word.charAt(0) == 'e')
        {
            w = word+"way";
        }
        else if(word.charAt(0) == 'i')
        {
            w = word+"way";
        }
        else if(word.charAt(0) == 'o')
        {
            w = word+"way";
        }
        else if(word.charAt(0) == 'u')
        {
            w = word+"way";
        }
    }
    
    void qu(String word)
    {
        if(word.charAt(0) == 'q' && word.charAt(1) == 'u')
        {
            String s = word.substring(2);
            w = s + "quay";
        }
    }
    
    void secondConsonant()
    {
        
        int loop = 0;
        //while(loop<1)
        //{
           if(w.charAt(1) != 'a')
           {
               String s = w.substring(0);
               ww = s+w.charAt(0)+"ay";
           }
           else if(w.charAt(0) != 'e')
           {
               String s = w.substring(0);
               ww = s+w.charAt(0)+"ay";
           }
           else if(w.charAt(0) != 'i')
           {
               String s = w.substring(0);
               ww = s+w.charAt(0)+"ay";
           }
           else if(w.charAt(0) != 'o')
           {
               String s = w.substring(0);
               ww = s+w.charAt(0)+"ay";
           }
           else if(w.charAt(0) != 'u')
           {
               String s = w.substring(0);
               ww = s+w.charAt(0)+"ay";
           }
        //}
    }
    
    String translateSentence(String sentence)
    {
        Sentence(sentence);
        for(int y = 0; y < list2.size(); y++)
            System.out.print(list2.get(y));
        return " ";
     }
    
    void Sentence(String sentence)
    {
        String sent1 = sentence.trim();
        int whitespace = 0;
        for(int i = 0; i < sent1.length(); i++)
        {
            if(sentence.charAt(i) == ' ')
            {
                whitespace += 1;
            }
        }
        
        int numWord = whitespace+1;
        //System.out.println(numWord);
        
        int y=0;        
        for(int i = 0; i < sent1.length(); i++)
        {
            if(sentence.charAt(i) == ' ')
            {
                //System.out.println(i);
                
                String word1 = sent1.substring(y, i);

                y = i;
                w = word1;
                System.out.print(w);
                
                startConsonant(w);
                secondConsonant();
                //startConsonant(w);
                startVowel(w);
                qu(w);
                
                translateWord(word1);
                //System.out.print(ww);
                //list2.add(w);
            }
        }
    }
}