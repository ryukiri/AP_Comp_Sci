public class Time 
{
    private int hours;
    private int mins;
    
    public Time(int h, int m)
    {
        if((h<=24 && h>=0) && (m<=60 && m>=0))
        {
            hours = h;
            mins = m;
        }else
            throw new IllegalArgumentException
                    ("Please put legal hours and mins.");
    }
    
    private int toMins()
    {
        int temp = hours * 60;
        return temp + mins;
    }
    
    public boolean lessThan(Time t)
    {
        if(toMins() < t.toMins())
        {
            return false;
        }else
            return true;
    }
    
    public int elapsedSince(Time t)
    {
        int time = toMins();
        int newTime = t.toMins();
        
        if(newTime >= time)
        {
            return Math.abs(newTime+(1440-time));
        }
        else
            return Math.abs(newTime - time);
    }
    
    public String toString()
    {
        return hours + ":" + mins;
    }
}
