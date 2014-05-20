

/*Austin Quach
 * APCS Period 3
 * Elevator lab
 */

public class Elevator 
{
    //Field Variables
    private int highestFloor;
    private int currentFloor;
    private int maxPassengers;
    private int currentPassengers;
    
    //Default Constructor: no arguments / parameters
    public Elevator(int f, int p)
    {
        highestFloor = f;
        maxPassengers = p;
        currentPassengers = 0;
        currentFloor = 1;
    }
    
    //Takes in integer number
    public boolean loadPassengers(int addPassengers)
    {
        if (addPassengers <= maxPassengers && addPassengers + currentPassengers <= maxPassengers)
        {
            currentPassengers+=addPassengers;
            return true;
        }else
        {
        return false;
        }
    }
     
    //Unloads Passengers
    public boolean unloadPassengers(int unloadPassengers)
    {   

        if(currentPassengers>=unloadPassengers)
        {
            currentPassengers -= unloadPassengers;
            return true;
        }else
        {
        return false;
        }
    }
    
    //Move Elevator to desired floor.
    public boolean moveToFloor(int newFloor)
    {   
        if(newFloor>0)
        {
            if(currentFloor<highestFloor && newFloor <= highestFloor)
            {
                 newFloor = newFloor-1; //Because in the default constructor, currentFloor is set to 1 so if we add new floor, it will always be 1 too high
                 currentFloor = currentFloor + newFloor;
                 return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    //Gets number of passengers
    public int getNumberOfPassengers()
    {
        return currentPassengers;
    }
    
    //Get current floor
    public int getCurrentFloor()
    {
        return currentFloor;
    }   
}


