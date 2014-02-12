public class PigLatin2 
{
    private String w = "";
    private String s = "";
    private String newS = "";
    
    String translateWord(String word)
    {
        w = word;
        if(isY(word)==true)
        {
            Startconsonant(word);
            return w + "ay";        
        }else if(isQu(word)==true)
        {
            Startqu(word);
            return w + "ay";
        }
        else if(isVowel(word)==true)
            return vowel(word);
        else
            return consonant(word);
    }
    String translateSentence(String sentence)
    {
        String sent1 = sentence.trim();
        //this is a sentence.
        int y = 0;
        for(int i=0; i<sent1.length();i++)
        {
            if(sent1.charAt(i)==' ' || sent1.charAt(i)=='.' )
            {
                w = sent1.substring(y, i);
                String w1 = w.trim();
                //System.out.println(w1);
                //System.out.print("y=" + y+ " ");
                //System.out.println("i=" + i);

                y= i+1;
                
                if(isY(w1)==true)
                {
                    Startconsonant(w1);
                    s+= w1 + "ay" + "";
                    s.trim();
                }else if(w1.charAt(0)=='q' && w1.charAt(1)=='u')
                {
                    String sub = w1.substring(2);
                    s = sub+"qu";
                    s.trim();                   
                }else if(isVowel(w1)==true)
                {
                    s+= vowel(w1)+ " ";
                    s.trim();                 
                }else if(isVowel(w1)==false)
                {
                    s+= consonant(w1) + " ";
                    s.trim();                
                } 
            }
        }
        fixWhiteSpace();
        return newS;
    }
    
    boolean isVowel(String word)
    {
        char first = word.charAt(0);
        return (word.charAt(0)=='a')||(word.charAt(0)=='e')||(word.charAt(0)=='i')||(word.charAt(0)=='o')||(word.charAt(0)=='u');
    }
    
    boolean isY(String word)
    {
        char first = word.charAt(0);
        return word.charAt(0)=='y';
    }
    
    boolean isQu(String word)
    {
        char first = word.charAt(0);
        return (word.charAt(0)=='q')||(word.charAt(1)=='u');
    }
    
    void Startconsonant(String word)
    {
        String s = word.substring(1);
        w = s+word.charAt(0);
        w.trim();       
    }
    
    void Startvowel(String word)
    {
        w = word+"way";
        w.trim();
    }
    
    void Startqu(String word)
    {
        String s = word.substring(2);
        w = s+"qu";
        w.trim();
    }
    
    String consonant(String word)
    {
        int loop = 0;
        //if(isVowel(w)==false)
        //{
         //   loop=0;
        //}
        
        while(loop < 2)
        {
            if(isVowel(w)==false)
            {
                Startconsonant(w);
            }else if(isVowel(w)==true)
            {
                loop++;
            }
        }
        return w+"ay";
    }
    
    String vowel(String word)
    {
        return w+"way";
    }
    
    void fixWhiteSpace()
    {
        newS = s.replaceAll("  ", " ");
    }
}
